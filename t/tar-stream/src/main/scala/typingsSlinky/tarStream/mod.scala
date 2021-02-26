package typingsSlinky.tarStream

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.PassThrough
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.ReadableOptions
import typingsSlinky.node.streamMod.Writable
import typingsSlinky.node.streamMod.WritableOptions
import typingsSlinky.tarStream.tarStreamStrings.`block-device`
import typingsSlinky.tarStream.tarStreamStrings.`character-device`
import typingsSlinky.tarStream.tarStreamStrings.`contiguous-file`
import typingsSlinky.tarStream.tarStreamStrings.`gnu-long-link-path`
import typingsSlinky.tarStream.tarStreamStrings.`gnu-long-path`
import typingsSlinky.tarStream.tarStreamStrings.`pax-global-header`
import typingsSlinky.tarStream.tarStreamStrings.`pax-header`
import typingsSlinky.tarStream.tarStreamStrings.directory
import typingsSlinky.tarStream.tarStreamStrings.entry
import typingsSlinky.tarStream.tarStreamStrings.fifo
import typingsSlinky.tarStream.tarStreamStrings.file
import typingsSlinky.tarStream.tarStreamStrings.link
import typingsSlinky.tarStream.tarStreamStrings.symlink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tar-stream", "extract")
  @js.native
  def extract(): Extract_ = js.native
  @JSImport("tar-stream", "extract")
  @js.native
  def extract(opts: WritableOptions): Extract_ = js.native
  
  @JSImport("tar-stream", "pack")
  @js.native
  def pack(): Pack_ = js.native
  @JSImport("tar-stream", "pack")
  @js.native
  def pack(opts: ReadableOptions): Pack_ = js.native
  
  type Callback = js.Function1[/* err */ js.UndefOr[js.Error | Null], js.Any]
  
  @js.native
  trait Extract_ extends Writable {
    
    @JSName("on")
    def on_entry(
      event: entry,
      listener: js.Function3[/* headers */ Headers, /* stream */ PassThrough, /* next */ js.Function0[Unit], Unit]
    ): this.type = js.native
  }
  
  @js.native
  trait Headers extends StObject {
    
    var devmajor: js.UndefOr[Double] = js.native
    
    var devminor: js.UndefOr[Double] = js.native
    
    var gid: js.UndefOr[Double] = js.native
    
    var gname: js.UndefOr[String] = js.native
    
    var linkname: js.UndefOr[String | Null] = js.native
    
    var mode: js.UndefOr[Double] = js.native
    
    var mtime: js.UndefOr[js.Date] = js.native
    
    var name: String = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[
        file | link | symlink | `character-device` | `block-device` | directory | fifo | `contiguous-file` | `pax-header` | `pax-global-header` | `gnu-long-link-path` | `gnu-long-path` | Null
      ] = js.native
    
    var uid: js.UndefOr[Double] = js.native
    
    var uname: js.UndefOr[String] = js.native
  }
  object Headers {
    
    @scala.inline
    def apply(name: String): Headers = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit class HeadersMutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevmajor(value: Double): Self = StObject.set(x, "devmajor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevmajorUndefined: Self = StObject.set(x, "devmajor", js.undefined)
      
      @scala.inline
      def setDevminor(value: Double): Self = StObject.set(x, "devminor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevminorUndefined: Self = StObject.set(x, "devminor", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setGname(value: String): Self = StObject.set(x, "gname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGnameUndefined: Self = StObject.set(x, "gname", js.undefined)
      
      @scala.inline
      def setLinkname(value: String): Self = StObject.set(x, "linkname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinknameNull: Self = StObject.set(x, "linkname", null)
      
      @scala.inline
      def setLinknameUndefined: Self = StObject.set(x, "linkname", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setType(
        value: file | link | symlink | `character-device` | `block-device` | directory | fifo | `contiguous-file` | `pax-header` | `pax-global-header` | `gnu-long-link-path` | `gnu-long-path`
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      @scala.inline
      def setUname(value: String): Self = StObject.set(x, "uname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnameUndefined: Self = StObject.set(x, "uname", js.undefined)
    }
  }
  
  @js.native
  trait Pack_ extends Readable {
    
    /**
      * To create a pack stream use tar.pack() and call pack.entry(header, [callback]) to add tar entries.
      */
    def entry(headers: Headers): Writable = js.native
    def entry(headers: Headers, buffer: js.UndefOr[scala.Nothing], callback: Callback): Writable = js.native
    def entry(headers: Headers, buffer: String): Writable = js.native
    def entry(headers: Headers, buffer: String, callback: Callback): Writable = js.native
    def entry(headers: Headers, buffer: Buffer): Writable = js.native
    def entry(headers: Headers, buffer: Buffer, callback: Callback): Writable = js.native
    def entry(headers: Headers, callback: Callback): Writable = js.native
  }
}
