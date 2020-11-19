package typingsSlinky.videoJs.mod.videojs

import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("video.js", "videojs.Hook")
@js.native
object Hook extends js.Object {
  
  type BeforeSetup = js.Function2[/* element */ HTMLVideoElement, /* options */ js.Any, js.Any]
  
  type Setup = js.Function1[/* player */ Player, Unit]
}
