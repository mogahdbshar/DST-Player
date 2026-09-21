package com.dstwr.player.core.download
data class DownloadItem(val id:String,val title:String,val url:String,val progress:Int=0,val status:DownloadStatus=DownloadStatus.QUEUED)
enum class DownloadStatus{QUEUED,DOWNLOADING,COMPLETED,FAILED,CANCELLED}
