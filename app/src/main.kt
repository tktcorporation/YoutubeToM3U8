// import com.squareup.okhttp3 //:okhttp //:4.4.0  //http通信ライブラリ
// import com.eclipsesource.minimal-json //:minimal-json //:0.9.5 //jsonパースライブラリ
// // def coroutines_version = '1.3.9' //Kotlin coroutines用ライブラリ(async, await)のバージョン
// import org.jetbrains.kotlinx //:kotlinx-coroutines-core //:1.3.9 //Kotlin coroutines用ライブラリ(async, await)
// import org.jetbrains.kotlinx //:kotlinx-coroutines-android //:1.3.9 //Kotlin coroutines用ライブラリ(async, await)
// import kotlinx.coroutines.Dispatchers
// import kotlinx.coroutines.GlobalScope
// import kotlinx.coroutines.async
// import kotlinx.coroutines.launch

// import kotlinx.coroutines
// import com.squareup.okhttp3

fun main(){
    val url: List<String> = extractURLs("+codecs%3D%5C%22opus%5C%22%22%2C%22bitrate%22%3A3858%2C%22initRange%22%3A%7B%22start%22%3A%220%22%2C%22end%22%3A%22265%22%7D%2C%22indexRange%22%3A%7B%22start%22%3A%22266%22%2C%22end%22%3A%22314%22%7D%2C%22lastModified%22%3A%221542171061250790%22%2C%22contentLength%22%3A%2211630%22%2C%22quality%22%3A%22tiny%22%2C%22projectionType%22%3A%22RECTANGULAR%22%2C%22averageBitrate%22%3A3712%2C%22audioQuality%22%3A%22AUDIO_QUALITY_MEDIUM%22%2C%22approxDurationMs%22%3A%2225061%22%2C%22audioSampleRate%22%3A%2248000%22%2C%22audioChannels%22%3A2%2C%22loudnessDb%22%3A-9986.0%7D%5D%2C%22hlsManifestUrl%22%3A%22https%3A%2F%2Fmanifest.googlevideo.com%2Fapi%2Fmanifest%2Fhls_variant%2Fexpire%2F1602895282%2Fei%2FUumJX_K9CMWClQTK_KXwCw%2Fip%2F126.255.82.97%2Fid%2Faef931b5592f6b07%2Fsource%2Fyoutube%2Frequiressl%2Fyes%2Fplayback_host%2Fr3---sn-ogul7n7s.googlevideo.com%2Fmh%2F12%2Fmm%2F31%252C26%2Fmn%2Fsn-ogul7n7s%252Csn-3pm7kn7l%2Fms%2Fau%252Conr%2Fmv%2Fm%2Fmvi%2F3%2Fpl%2F16%2Fhfr%2F1%2Ftts_caps%2F1%2Fmaudio%2F1%2Fpcm2%2Fno%2Finitcwndbps%2F1066250%2Fvprv%2F1%2Fgo%2F1%2Fmt%2F1602873530%2Ffvip%2F3%2Fkeepalive%2Fyes%2Ffexp%2F23915654%2Fdover%2F11%2Fitag%2F0%2Fplaylist_type%2FDVR%2Fsparams%2Fexpire%252Cei%252Cip%252Cid%252Csource%252Crequiressl%252Chfr%252Ctts_caps%252Cmaudio%252Cpcm2%252Cvprv%252Cgo%252Citag%252Cplaylist_type%2Fsig%2FAOq0QJ8wRgIhALP940xJgYfLwI5OEiwSxeAKfIbKmqvjr4-xOY98xsiZAiEAve9oHPNC5TI2ML6JiDDARmQw06JwLocYAGrew9mZ9WY%253D%2Flsparams%2Fplayback_host%252Cmh%252Cmm%252Cmn%252Cms%252Cmv%252Cmvi%252Cpl%252Cinitcwndbps%2Flsig%2FAG3C_xAwRQIgX6QfinuK6KPJhKIB_sPU6aAlgaN7Q_BXae9zb797bXgCIQDqgVejz_svO8q6FWZVwKDCreMQYQC_LN413AdwN1zvrg%253D%253D%2Ffile%2Findex.m3u8e%2F1602895282%2Fei%2FUumJX_K9CMWClQTK_KXwCw%2Fip%2F126.255.82.0")
    println(url[0])
    // return body
}

fun extractURLs(text: String): List<String> {
    // 正規表現は一例。状況に応じてもっと良いのがあればそれを。
    val regex = "(https%3A%2F%2Fmanifest.googlevideo.com.+m3u8)"
    val urls = regex.toRegex(RegexOption.IGNORE_CASE).findAll(text).map{it.value}
    return urls.toList()
}