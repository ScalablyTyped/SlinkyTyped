package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.breadcrumbDividerMod.BreadcrumbDividerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BreadcrumbDivider {
  @JSImport("semantic-ui-react/dist/commonjs/collections/Breadcrumb/BreadcrumbDivider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: BreadcrumbDividerProps): SharedBuilder_BreadcrumbDividerProps_1812549402 = new SharedBuilder_BreadcrumbDividerProps_1812549402(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: BreadcrumbDivider.type): SharedBuilder_BreadcrumbDividerProps_1812549402 = new SharedBuilder_BreadcrumbDividerProps_1812549402(js.Array(this.component, js.Dictionary.empty))()
}

