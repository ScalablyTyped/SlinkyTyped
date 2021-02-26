package typingsSlinky.webtorrent

import org.scalajs.dom.raw.File
import typingsSlinky.webtorrent.mod.Torrent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Autoplay extends StObject {
    
    var autoplay: js.UndefOr[Boolean] = js.native
    
    var controls: js.UndefOr[Boolean] = js.native
    
    var maxBlobLength: js.UndefOr[Double] = js.native
  }
  object Autoplay {
    
    @scala.inline
    def apply(): Autoplay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Autoplay]
    }
    
    @scala.inline
    implicit class AutoplayMutableBuilder[Self <: Autoplay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setMaxBlobLength(value: Double): Self = StObject.set(x, "maxBlobLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBlobLengthUndefined: Self = StObject.set(x, "maxBlobLength", js.undefined)
    }
  }
  
  @js.native
  trait End extends StObject {
    
    var end: Double = js.native
    
    var start: Double = js.native
  }
  object End {
    
    @scala.inline
    def apply(end: Double, start: Double): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Files extends StObject {
    
    var files: js.Array[File] = js.native
    
    var length: Double = js.native
    
    var torrent: Torrent = js.native
  }
  object Files {
    
    @scala.inline
    def apply(files: js.Array[File], length: Double, torrent: Torrent): Files = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], torrent = torrent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Files]
    }
    
    @scala.inline
    implicit class FilesMutableBuilder[Self <: Files] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFiles(value: js.Array[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTorrent(value: Torrent): Self = StObject.set(x, "torrent", value.asInstanceOf[js.Any])
    }
  }
}
