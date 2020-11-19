package typingsSlinky.torrentStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object torrentStreamStrings {
  
  @scala.inline
  def download: download = "download".asInstanceOf[download]
  
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
  
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  
  @scala.inline
  def torrent: torrent = "torrent".asInstanceOf[torrent]
  
  @scala.inline
  def upload: upload = "upload".asInstanceOf[upload]
  
  @js.native
  sealed trait download extends js.Object
  
  @js.native
  sealed trait idle extends js.Object
  
  @js.native
  sealed trait ready extends js.Object
  
  @js.native
  sealed trait torrent extends js.Object
  
  @js.native
  sealed trait upload extends js.Object
}
