package typingsSlinky.uifabricMergeStyles

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyleBaseArray
import typingsSlinky.uifabricMergeStyles.istyleoptionsMod.IStyleOptions
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/merge-styles/lib/mergeStyles", JSImport.Namespace)
@js.native
object mergeStylesMod extends js.Object {
  
  def mergeCss(): String = js.native
  def mergeCss(args: js.UndefOr[IStyle], options: IStyleOptions): String = js.native
  def mergeCss(args: Null, options: IStyleOptions): String = js.native
  def mergeCss(args: IStyle): String = js.native
  def mergeCss(args: IStyleBaseArray): String = js.native
  def mergeCss(args: IStyleBaseArray, options: IStyleOptions): String = js.native
  @JSName("mergeCss")
  def mergeCss_false(args: js.Array[js.UndefOr[IStyle | IStyleBaseArray | `false` | Null]]): String = js.native
  @JSName("mergeCss")
  def mergeCss_false(args: js.Array[js.UndefOr[IStyle | IStyleBaseArray | `false` | Null]], options: IStyleOptions): String = js.native
  @JSName("mergeCss")
  def mergeCss_false(args: `false`): String = js.native
  @JSName("mergeCss")
  def mergeCss_false(args: `false`, options: IStyleOptions): String = js.native
  
  @JSName("mergeStyles")
  def mergeStyles_false(args: (js.UndefOr[IStyle | IStyleBaseArray | `false` | Null])*): String = js.native
}
