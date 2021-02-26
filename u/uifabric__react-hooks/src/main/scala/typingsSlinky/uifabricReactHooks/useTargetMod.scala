package typingsSlinky.uifabricReactHooks

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Window
import slinky.core.facade.ReactRef
import typingsSlinky.uifabricUtilities.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTargetMod {
  
  @JSImport("@uifabric/react-hooks/lib/useTarget", "useTarget")
  @js.native
  def useTarget[TElement /* <: HTMLElement */](): js.Tuple2[ReactRef[Element | MouseEvent | Point | Null], js.UndefOr[Window]] = js.native
  @JSImport("@uifabric/react-hooks/lib/useTarget", "useTarget")
  @js.native
  def useTarget[TElement /* <: HTMLElement */](target: js.UndefOr[Target], hostElement: ReactRef[Null | TElement]): js.Tuple2[ReactRef[Element | MouseEvent | Point | Null], js.UndefOr[Window]] = js.native
  @JSImport("@uifabric/react-hooks/lib/useTarget", "useTarget")
  @js.native
  def useTarget[TElement /* <: HTMLElement */](target: Target): js.Tuple2[ReactRef[Element | MouseEvent | Point | Null], js.UndefOr[Window]] = js.native
  
  type Target = Element | String | MouseEvent | Point | Null | ReactRef[Element]
}
