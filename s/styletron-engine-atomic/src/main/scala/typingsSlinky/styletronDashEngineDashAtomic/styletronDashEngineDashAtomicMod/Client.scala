package typingsSlinky.styletronDashEngineDashAtomic.styletronDashEngineDashAtomicMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLStyleElement
import typingsSlinky.styletronDashEngineDashAtomic.Anon_Block
import typingsSlinky.styletronDashStandard.styletronDashStandardMod.FontFace
import typingsSlinky.styletronDashStandard.styletronDashStandardMod.KeyframesObject
import typingsSlinky.styletronDashStandard.styletronDashStandardMod.StandardEngine
import typingsSlinky.styletronDashStandard.styletronDashStandardMod.StyleObject
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
  var styleCache: MultiCache[Anon_Block] = js.native
  var styleElements: StringDictionary[HTMLStyleElement] = js.native
  /* CompleteClass */
  override def renderFontFace(fontFace: FontFace): String = js.native
  /* CompleteClass */
  override def renderKeyframes(keyframes: KeyframesObject): String = js.native
  /* CompleteClass */
  override def renderStyle(style: StyleObject): String = js.native
}

