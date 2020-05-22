package typingsSlinky.typestyle

import typingsSlinky.freeStyle.mod.Styles
import typingsSlinky.typestyle.typesMod.KeyFrames
import typingsSlinky.typestyle.typesMod.NestedCSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typestyle/lib/internal/formatting", JSImport.Namespace)
@js.native
object formattingMod extends js.Object {
  def convertToKeyframes(frames: KeyFrames): Styles = js.native
  def convertToStyles(`object`: NestedCSSProperties): Styles = js.native
}

