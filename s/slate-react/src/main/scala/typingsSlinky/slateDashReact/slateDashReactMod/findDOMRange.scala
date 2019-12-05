package typingsSlinky.slateDashReact.slateDashReactMod

import org.scalajs.dom.raw.Range
import org.scalajs.dom.raw.Window
import typingsSlinky.slate.slateMod.RangeType
import typingsSlinky.slate.slateMod.RangeTypeJSON
import typingsSlinky.slate.slateMod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-react", "findDOMRange")
@js.native
object findDOMRange extends js.Object {
  def apply(range: RangeType): Range | Null = js.native
  def apply(range: RangeTypeJSON): Range | Null = js.native
  def apply(range: RangeTypeJSON, win: Window): Range | Null = js.native
  def apply(range: RangeTypeProperties): Range | Null = js.native
  def apply(range: RangeTypeProperties, win: Window): Range | Null = js.native
  def apply(range: RangeType, win: Window): Range | Null = js.native
}

