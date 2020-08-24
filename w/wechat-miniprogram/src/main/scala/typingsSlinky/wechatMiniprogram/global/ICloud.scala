package typingsSlinky.wechatMiniprogram.global

import typingsSlinky.wechatMiniprogram.ICloud.ICDNFilePathSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ICloud")
@js.native
object ICloud extends js.Object {
  // === end ===
  // === API: CDN ===
  @js.native
  abstract class CDN protected ()
    extends typingsSlinky.wechatMiniprogram.ICloud.CDN {
    def this(target: String) = this()
    def this(target: js.typedarray.ArrayBuffer) = this()
    def this(target: ICDNFilePathSpec) = this()
  }
  
  // === end ===
  // === API: CloudID ===
  @js.native
  abstract class CloudID protected ()
    extends typingsSlinky.wechatMiniprogram.ICloud.CloudID {
    def this(cloudID: String) = this()
  }
  
}

