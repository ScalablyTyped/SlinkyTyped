package typingsSlinky.youtubeDl

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.youtubeDl.youtubeDlStrings.complete
import typingsSlinky.youtubeDl.youtubeDlStrings.error
import typingsSlinky.youtubeDl.youtubeDlStrings.info
import typingsSlinky.youtubeDl.youtubeDlStrings.next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("youtube-dl", JSImport.Namespace)
  @js.native
  def apply(url: String, arg: js.Array[String], opt: StringDictionary[String]): Youtubedl = js.native
  
  /**
    * Call `youtube-dl` with whatever arguments you like.
    */
  @JSImport("youtube-dl", "exec")
  @js.native
  def exec(
    url: String,
    args: js.Array[String],
    options: Options,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]
  ): Unit = js.native
  
  @JSImport("youtube-dl", "getExtractors")
  @js.native
  def getExtractors(callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]): Unit = js.native
  @JSImport("youtube-dl", "getExtractors")
  @js.native
  def getExtractors(
    descriptions: Boolean,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]
  ): Unit = js.native
  @JSImport("youtube-dl", "getExtractors")
  @js.native
  def getExtractors(
    descriptions: Boolean,
    options: Options,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]
  ): Unit = js.native
  
  @JSImport("youtube-dl", "getInfo")
  @js.native
  def getInfo(
    url: String,
    args: js.Array[String],
    callback: js.Function2[/* err */ js.Any, /* output */ Info, Unit]
  ): Unit = js.native
  @JSImport("youtube-dl", "getInfo")
  @js.native
  def getInfo(
    url: String,
    args: js.Array[String],
    options: Options,
    callback: js.Function2[/* err */ js.Any, /* output */ Info, Unit]
  ): Unit = js.native
  @JSImport("youtube-dl", "getInfo")
  @js.native
  def getInfo(url: String, callback: js.Function2[/* err */ js.Any, /* output */ Info, Unit]): Unit = js.native
  
  @JSImport("youtube-dl", "getSubs")
  @js.native
  def getSubs(url: String, callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]): Unit = js.native
  @JSImport("youtube-dl", "getSubs")
  @js.native
  def getSubs(
    url: String,
    options: Options,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]
  ): Unit = js.native
  
  @JSImport("youtube-dl", "getThumbs")
  @js.native
  def getThumbs(url: String, callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]): Unit = js.native
  @JSImport("youtube-dl", "getThumbs")
  @js.native
  def getThumbs(
    url: String,
    options: Options,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]
  ): Unit = js.native
  
  @js.native
  trait Info extends StObject {
    
    var _duration_hms: String = js.native
    
    var _duration_raw: Double = js.native
    
    var _filename: String = js.native
    
    var duration: String = js.native
    
    var filename: String = js.native
    
    var size: Double = js.native
  }
  object Info {
    
    @scala.inline
    def apply(
      _duration_hms: String,
      _duration_raw: Double,
      _filename: String,
      duration: String,
      filename: String,
      size: Double
    ): Info = {
      val __obj = js.Dynamic.literal(_duration_hms = _duration_hms.asInstanceOf[js.Any], _duration_raw = _duration_raw.asInstanceOf[js.Any], _filename = _filename.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    @scala.inline
    implicit class InfoMutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_duration_hms(value: String): Self = StObject.set(x, "_duration_hms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_duration_raw(value: Double): Self = StObject.set(x, "_duration_raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_filename(value: String): Self = StObject.set(x, "_filename", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var all: js.UndefOr[Boolean] = js.native
    
    var auto: js.UndefOr[Boolean] = js.native
    
    var cwd: js.UndefOr[String] = js.native
    
    var lang: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      @scala.inline
      def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    }
  }
  
  @js.native
  trait Youtubedl extends Readable {
    
    @JSName("on")
    def on_complete(event: complete, listener: js.Function1[/* info */ Info, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_info(event: info, listener: js.Function1[/* info */ Info, Unit]): this.type = js.native
    @JSName("on")
    def on_next(event: next, listener: js.Function1[/* data */ Info | js.Array[Info], Unit]): this.type = js.native
  }
}
