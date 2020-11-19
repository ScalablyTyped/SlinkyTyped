package typingsSlinky.semanticUiReact.gridColumnMod

import slinky.core.facade.ReactElement
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticFLOATS
import typingsSlinky.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import typingsSlinky.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typingsSlinky.semanticUiReact.genericMod.SemanticWIDTHS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictGridColumnProps extends js.Object {
  
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  
  /** Primary content. */
  var children: js.UndefOr[ReactElement] = js.native
  
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  
  /** A grid column can be colored. */
  var color: js.UndefOr[SemanticCOLORS] = js.native
  
  /** A column can specify a width for a computer. */
  var computer: js.UndefOr[SemanticWIDTHS] = js.native
  
  /** A column can sit flush against the left or right edge of a row. */
  var floated: js.UndefOr[SemanticFLOATS] = js.native
  
  /** A column can specify a width for a large screen device. */
  var largeScreen: js.UndefOr[SemanticWIDTHS] = js.native
  
  /** A column can specify a width for a mobile device. */
  var mobile: js.UndefOr[SemanticWIDTHS] = js.native
  
  /** A column can appear only for a specific device, or screen sizes. */
  var only: js.UndefOr[GridOnlyProp] = js.native
  
  /** An can stretch its contents to take up the entire grid or row height. */
  var stretched: js.UndefOr[Boolean] = js.native
  
  /** A column can specify a width for a tablet device. */
  var tablet: js.UndefOr[SemanticWIDTHS] = js.native
  
  /** A row can specify its text alignment. */
  var textAlign: js.UndefOr[SemanticTEXTALIGNMENTS] = js.native
  
  /** A column can specify its vertical alignment to have all its columns vertically centered. */
  var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.native
  
  /** A column can specify a width for a wide screen device. */
  var widescreen: js.UndefOr[SemanticWIDTHS] = js.native
  
  /** Represents width of column. */
  var width: js.UndefOr[SemanticWIDTHS] = js.native
}
object StrictGridColumnProps {
  
  @scala.inline
  def apply(): StrictGridColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictGridColumnProps]
  }
  
  @scala.inline
  implicit class StrictGridColumnPropsOps[Self <: StrictGridColumnProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColor(value: SemanticCOLORS): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setComputer(value: SemanticWIDTHS): Self = this.set("computer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputer: Self = this.set("computer", js.undefined)
    
    @scala.inline
    def setFloated(value: SemanticFLOATS): Self = this.set("floated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloated: Self = this.set("floated", js.undefined)
    
    @scala.inline
    def setLargeScreen(value: SemanticWIDTHS): Self = this.set("largeScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargeScreen: Self = this.set("largeScreen", js.undefined)
    
    @scala.inline
    def setMobile(value: SemanticWIDTHS): Self = this.set("mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobile: Self = this.set("mobile", js.undefined)
    
    @scala.inline
    def setOnly(value: GridOnlyProp): Self = this.set("only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnly: Self = this.set("only", js.undefined)
    
    @scala.inline
    def setStretched(value: Boolean): Self = this.set("stretched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStretched: Self = this.set("stretched", js.undefined)
    
    @scala.inline
    def setTablet(value: SemanticWIDTHS): Self = this.set("tablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTablet: Self = this.set("tablet", js.undefined)
    
    @scala.inline
    def setTextAlign(value: SemanticTEXTALIGNMENTS): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    
    @scala.inline
    def setWidescreen(value: SemanticWIDTHS): Self = this.set("widescreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidescreen: Self = this.set("widescreen", js.undefined)
    
    @scala.inline
    def setWidth(value: SemanticWIDTHS): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
