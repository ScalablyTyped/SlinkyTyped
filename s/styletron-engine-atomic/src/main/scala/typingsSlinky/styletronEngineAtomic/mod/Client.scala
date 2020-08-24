package typingsSlinky.styletronEngineAtomic.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLStyleElement
import typingsSlinky.styletronEngineAtomic.anon.Block
import typingsSlinky.styletronStandard.mod.FontFace
import typingsSlinky.styletronStandard.mod.KeyframesObject
import typingsSlinky.styletronStandard.mod.StandardEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styletron-engine-atomic", "Client")
@js.native
class Client () extends StandardEngine {
  def this(opts: ClientOptions) = this()
  var fontFaceCache: Cache[FontFace] = js.native
  var fontFaceSheet: HTMLStyleElement = js.native
  var keyframesCache: Cache[KeyframesObject] = js.native
  var keyframesSheet: HTMLStyleElement = js.native
  var styleCache: MultiCache[Block] = js.native
  var styleElements: StringDictionary[HTMLStyleElement] = js.native
}

