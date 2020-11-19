package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticFLOATS
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import typingsSlinky.semanticUiReact.segmentGroupMod.SegmentGroupProps
import typingsSlinky.semanticUiReact.segmentInlineMod.SegmentInlineProps
import typingsSlinky.semanticUiReact.segmentSegmentMod.SegmentProps
import typingsSlinky.semanticUiReact.segmentSegmentMod.SegmentSizeProp
import typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import typingsSlinky.semanticUiReact.semanticUiReactStrings.top
import typingsSlinky.semanticUiReact.semanticUiReactStrings.very
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Segment {
  
  @JSImport("semantic-ui-react", "Segment")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def attached(value: Boolean | top | bottom): this.type = set("attached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def basic(value: Boolean): this.type = set("basic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def circular(value: Boolean): this.type = set("circular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clearing(value: Boolean): this.type = set("clearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floated(value: SemanticFLOATS): this.type = set("floated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def padded(value: Boolean | very): this.type = set("padded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def piled(value: Boolean): this.type = set("piled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: Boolean): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def raised(value: Boolean): this.type = set("raised", value.asInstanceOf[js.Any])
    
    @scala.inline
    def secondary(value: Boolean): this.type = set("secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: SegmentSizeProp): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stacked(value: Boolean): this.type = set("stacked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tertiary(value: Boolean): this.type = set("tertiary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textAlign(value: SemanticTEXTALIGNMENTS): this.type = set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SegmentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Segment.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  object Inline {
    
    @JSImport("semantic-ui-react", "Segment.Inline")
    @js.native
    object component extends js.Object
    
    def withProps(p: SegmentInlineProps): SharedBuilder_SegmentInlineProps1003700032 = new SharedBuilder_SegmentInlineProps1003700032(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Inline.type): SharedBuilder_SegmentInlineProps1003700032 = new SharedBuilder_SegmentInlineProps1003700032(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Group {
    
    @JSImport("semantic-ui-react", "Segment.Group")
    @js.native
    object component extends js.Object
    
    def withProps(p: SegmentGroupProps): SharedBuilder_SegmentGroupProps1911915083 = new SharedBuilder_SegmentGroupProps1911915083(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Group.type): SharedBuilder_SegmentGroupProps1911915083 = new SharedBuilder_SegmentGroupProps1911915083(js.Array(this.component, js.Dictionary.empty))()
  }
}
