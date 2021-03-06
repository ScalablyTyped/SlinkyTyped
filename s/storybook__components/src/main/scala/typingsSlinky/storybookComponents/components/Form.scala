package typingsSlinky.storybookComponents.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLFormElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLSelectElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.storybookComponents.anon.PropsWithChildrenDetailed
import typingsSlinky.storybookComponents.anon.PropsWithChildrenPickPick
import typingsSlinky.storybookComponents.anon.PropsWithChildrenPickSele
import typingsSlinky.storybookComponents.anon.PropsWithChildrenPickanyc
import typingsSlinky.storybookComponents.fieldMod.FieldProps
import typingsSlinky.storybookComponents.inputMod.Alignments
import typingsSlinky.storybookComponents.inputMod.Sizes
import typingsSlinky.storybookComponents.inputMod.ValidationStates
import typingsSlinky.storybookComponents.storybookComponentsStrings.`additions removals`
import typingsSlinky.storybookComponents.storybookComponentsStrings.`additions text`
import typingsSlinky.storybookComponents.storybookComponentsStrings.`inline`
import typingsSlinky.storybookComponents.storybookComponentsStrings.`removals additions`
import typingsSlinky.storybookComponents.storybookComponentsStrings.`removals text`
import typingsSlinky.storybookComponents.storybookComponentsStrings.`text additions`
import typingsSlinky.storybookComponents.storybookComponentsStrings.`text removals`
import typingsSlinky.storybookComponents.storybookComponentsStrings.additions
import typingsSlinky.storybookComponents.storybookComponentsStrings.all
import typingsSlinky.storybookComponents.storybookComponentsStrings.ascending
import typingsSlinky.storybookComponents.storybookComponentsStrings.assertive
import typingsSlinky.storybookComponents.storybookComponentsStrings.both
import typingsSlinky.storybookComponents.storybookComponentsStrings.copy
import typingsSlinky.storybookComponents.storybookComponentsStrings.date
import typingsSlinky.storybookComponents.storybookComponentsStrings.decimal
import typingsSlinky.storybookComponents.storybookComponentsStrings.descending
import typingsSlinky.storybookComponents.storybookComponentsStrings.dialog
import typingsSlinky.storybookComponents.storybookComponentsStrings.email
import typingsSlinky.storybookComponents.storybookComponentsStrings.execute
import typingsSlinky.storybookComponents.storybookComponentsStrings.grammar
import typingsSlinky.storybookComponents.storybookComponentsStrings.grid
import typingsSlinky.storybookComponents.storybookComponentsStrings.horizontal
import typingsSlinky.storybookComponents.storybookComponentsStrings.inherit
import typingsSlinky.storybookComponents.storybookComponentsStrings.link
import typingsSlinky.storybookComponents.storybookComponentsStrings.list
import typingsSlinky.storybookComponents.storybookComponentsStrings.listbox
import typingsSlinky.storybookComponents.storybookComponentsStrings.location
import typingsSlinky.storybookComponents.storybookComponentsStrings.menu
import typingsSlinky.storybookComponents.storybookComponentsStrings.mixed
import typingsSlinky.storybookComponents.storybookComponentsStrings.move
import typingsSlinky.storybookComponents.storybookComponentsStrings.no
import typingsSlinky.storybookComponents.storybookComponentsStrings.none
import typingsSlinky.storybookComponents.storybookComponentsStrings.numeric
import typingsSlinky.storybookComponents.storybookComponentsStrings.off
import typingsSlinky.storybookComponents.storybookComponentsStrings.on
import typingsSlinky.storybookComponents.storybookComponentsStrings.other
import typingsSlinky.storybookComponents.storybookComponentsStrings.page
import typingsSlinky.storybookComponents.storybookComponentsStrings.polite
import typingsSlinky.storybookComponents.storybookComponentsStrings.popup
import typingsSlinky.storybookComponents.storybookComponentsStrings.removals
import typingsSlinky.storybookComponents.storybookComponentsStrings.search
import typingsSlinky.storybookComponents.storybookComponentsStrings.spelling
import typingsSlinky.storybookComponents.storybookComponentsStrings.step
import typingsSlinky.storybookComponents.storybookComponentsStrings.tel
import typingsSlinky.storybookComponents.storybookComponentsStrings.text
import typingsSlinky.storybookComponents.storybookComponentsStrings.time
import typingsSlinky.storybookComponents.storybookComponentsStrings.tree
import typingsSlinky.storybookComponents.storybookComponentsStrings.url
import typingsSlinky.storybookComponents.storybookComponentsStrings.vertical
import typingsSlinky.storybookComponents.storybookComponentsStrings.yes
import typingsSlinky.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Form {
  
  /* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
  object Button {
    
    def apply(p: js.Any): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @JSImport("@storybook/components", "Form.Button")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Button.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Field {
    
    @JSImport("@storybook/components", "Form.Field")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Field.type): SharedBuilder_FieldProps1274675511 = new SharedBuilder_FieldProps1274675511(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: FieldProps): SharedBuilder_FieldProps1274675511 = new SharedBuilder_FieldProps1274675511(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Input {
    
    @JSImport("@storybook/components", "Form.Input")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[slinky.web.html.input.tag.type, js.Object] {
      
      @scala.inline
      def default(value: Boolean): this.type = set("default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accept(value: String): this.type = set("accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def acceptCharset(value: String): this.type = set("acceptCharset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def action(value: String): this.type = set("action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def align(value: Alignments): this.type = set("align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def allowFullScreen(value: Boolean): this.type = set("allowFullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def allowTransparency(value: Boolean): this.type = set("allowTransparency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-atomic`(value: Boolean): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-busy`(value: Boolean): this.type = set("aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-disabled`(value: Boolean): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-expanded`(value: Boolean): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-grabbed`(value: Boolean): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-hidden`(value: Boolean): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-modal`(value: Boolean): this.type = set("aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-multiline`(value: Boolean): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-multiselectable`(value: Boolean): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-readonly`(value: Boolean): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-required`(value: Boolean): this.type = set("aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-selected`(value: Boolean): this.type = set("aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def as(value: String): this.type = set("as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def async(value: Boolean): this.type = set("async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoPlay(value: Boolean): this.type = set("autoPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def capture(value: Boolean | String): this.type = set("capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def cellPadding(value: Double | String): this.type = set("cellPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def cellSpacing(value: Double | String): this.type = set("cellSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def challenge(value: String): this.type = set("challenge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def charSet(value: String): this.type = set("charSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def cite(value: String): this.type = set("cite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def classID(value: String): this.type = set("classID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def content(value: String): this.type = set("content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def controls(value: Boolean): this.type = set("controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def coords(value: String): this.type = set("coords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def crossOrigin(value: String): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def css(value: js.Any): this.type = set("css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def data(value: String): this.type = set("data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dateTime(value: String): this.type = set("dateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value :_*))
      
      @scala.inline
      def defer(value: Boolean): this.type = set("defer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def download(value: js.Any): this.type = set("download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def encType(value: String): this.type = set("encType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def form(value: String): this.type = set("form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def formAction(value: String): this.type = set("formAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def formEncType(value: String): this.type = set("formEncType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def formMethod(value: String): this.type = set("formMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def formNoValidate(value: Boolean): this.type = set("formNoValidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def formTarget(value: String): this.type = set("formTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def frameBorder(value: Double | String): this.type = set("frameBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def headers(value: String): this.type = set("headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def high(value: Double): this.type = set("high", value.asInstanceOf[js.Any])
      
      @scala.inline
      def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hrefLang(value: String): this.type = set("hrefLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def htmlFor(value: String): this.type = set("htmlFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def httpEquiv(value: String): this.type = set("httpEquiv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inlist(value: js.Any): this.type = set("inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def integrity(value: String): this.type = set("integrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def keyParams(value: String): this.type = set("keyParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def keyType(value: String): this.type = set("keyType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def kind(value: String): this.type = set("kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def list(value: String): this.type = set("list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def low(value: Double): this.type = set("low", value.asInstanceOf[js.Any])
      
      @scala.inline
      def manifest(value: String): this.type = set("manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def marginHeight(value: Double): this.type = set("marginHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def marginWidth(value: Double): this.type = set("marginWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def max(value: Double | String): this.type = set("max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def media(value: String): this.type = set("media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def mediaGroup(value: String): this.type = set("mediaGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def method(value: String): this.type = set("method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def min(value: Double | String): this.type = set("min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def minLength(value: Double): this.type = set("minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def muted(value: Boolean): this.type = set("muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def noValidate(value: Boolean): this.type = set("noValidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAbort(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAbortCapture(value: js.Any): this.type = set("onAbortCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAnimationEnd(value: SyntheticAnimationEvent[HTMLInputElement] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAnimationEndCapture(value: js.Any): this.type = set("onAnimationEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAnimationIteration(value: SyntheticAnimationEvent[HTMLInputElement] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAnimationIterationCapture(value: js.Any): this.type = set("onAnimationIterationCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAnimationStart(value: SyntheticAnimationEvent[HTMLInputElement] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAnimationStartCapture(value: js.Any): this.type = set("onAnimationStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAuxClick(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAuxClickCapture(value: js.Any): this.type = set("onAuxClickCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onBeforeInput(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def onBeforeInputCapture(value: js.Any): this.type = set("onBeforeInputCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def onBlurCapture(value: js.Any): this.type = set("onBlurCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCanPlay(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCanPlayCapture(value: js.Any): this.type = set("onCanPlayCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCanPlayThrough(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCanPlayThroughCapture(value: js.Any): this.type = set("onCanPlayThroughCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onChange(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onChangeCapture(value: js.Any): this.type = set("onChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onClick(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onClickCapture(value: js.Any): this.type = set("onClickCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCompositionEnd(value: SyntheticCompositionEvent[HTMLInputElement] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCompositionEndCapture(value: js.Any): this.type = set("onCompositionEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCompositionStart(value: SyntheticCompositionEvent[HTMLInputElement] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCompositionStartCapture(value: js.Any): this.type = set("onCompositionStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCompositionUpdate(value: SyntheticCompositionEvent[HTMLInputElement] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCompositionUpdateCapture(value: js.Any): this.type = set("onCompositionUpdateCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onContextMenu(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def onContextMenuCapture(value: js.Any): this.type = set("onContextMenuCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCopy(value: SyntheticClipboardEvent[HTMLInputElement] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCopyCapture(value: js.Any): this.type = set("onCopyCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCut(value: SyntheticClipboardEvent[HTMLInputElement] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCutCapture(value: js.Any): this.type = set("onCutCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDoubleClick(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDoubleClickCapture(value: js.Any): this.type = set("onDoubleClickCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDrag(value: DragEvent[HTMLInputElement] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragCapture(value: js.Any): this.type = set("onDragCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragEnd(value: DragEvent[HTMLInputElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragEndCapture(value: js.Any): this.type = set("onDragEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragEnter(value: DragEvent[HTMLInputElement] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragEnterCapture(value: js.Any): this.type = set("onDragEnterCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragExit(value: DragEvent[HTMLInputElement] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragExitCapture(value: js.Any): this.type = set("onDragExitCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragLeave(value: DragEvent[HTMLInputElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragLeaveCapture(value: js.Any): this.type = set("onDragLeaveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragOver(value: DragEvent[HTMLInputElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragOverCapture(value: js.Any): this.type = set("onDragOverCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragStart(value: DragEvent[HTMLInputElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragStartCapture(value: js.Any): this.type = set("onDragStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDrop(value: DragEvent[HTMLInputElement] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDropCapture(value: js.Any): this.type = set("onDropCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDurationChange(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDurationChangeCapture(value: js.Any): this.type = set("onDurationChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEmptied(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def onEmptiedCapture(value: js.Any): this.type = set("onEmptiedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEncrypted(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def onEncryptedCapture(value: js.Any): this.type = set("onEncryptedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEnded(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def onEndedCapture(value: js.Any): this.type = set("onEndedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onError(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def onErrorCapture(value: js.Any): this.type = set("onErrorCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def onFocusCapture(value: js.Any): this.type = set("onFocusCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onGotPointerCapture(value: js.Any): this.type = set("onGotPointerCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onGotPointerCaptureCapture(value: js.Any): this.type = set("onGotPointerCaptureCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onInput(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def onInputCapture(value: js.Any): this.type = set("onInputCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onInvalid(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def onInvalidCapture(value: js.Any): this.type = set("onInvalidCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onKeyDown(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyDownCapture(value: js.Any): this.type = set("onKeyDownCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onKeyPress(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyPressCapture(value: js.Any): this.type = set("onKeyPressCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onKeyUp(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyUpCapture(value: js.Any): this.type = set("onKeyUpCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoad(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadCapture(value: js.Any): this.type = set("onLoadCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoadStart(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadStartCapture(value: js.Any): this.type = set("onLoadStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoadedData(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadedDataCapture(value: js.Any): this.type = set("onLoadedDataCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoadedMetadata(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadedMetadataCapture(value: js.Any): this.type = set("onLoadedMetadataCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLostPointerCapture(value: js.Any): this.type = set("onLostPointerCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLostPointerCaptureCapture(value: js.Any): this.type = set("onLostPointerCaptureCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseDown(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseDownCapture(value: js.Any): this.type = set("onMouseDownCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseEnter(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseLeave(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseMove(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseMoveCapture(value: js.Any): this.type = set("onMouseMoveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseOut(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseOutCapture(value: js.Any): this.type = set("onMouseOutCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseOver(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseOverCapture(value: js.Any): this.type = set("onMouseOverCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseUp(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseUpCapture(value: js.Any): this.type = set("onMouseUpCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPaste(value: SyntheticClipboardEvent[HTMLInputElement] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPasteCapture(value: js.Any): this.type = set("onPasteCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPause(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPauseCapture(value: js.Any): this.type = set("onPauseCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPlay(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPlayCapture(value: js.Any): this.type = set("onPlayCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPlaying(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPlayingCapture(value: js.Any): this.type = set("onPlayingCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerCancel(value: SyntheticPointerEvent[HTMLInputElement] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerCancelCapture(value: js.Any): this.type = set("onPointerCancelCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerDown(value: SyntheticPointerEvent[HTMLInputElement] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerDownCapture(value: js.Any): this.type = set("onPointerDownCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerEnter(value: SyntheticPointerEvent[HTMLInputElement] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerEnterCapture(value: js.Any): this.type = set("onPointerEnterCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerLeave(value: SyntheticPointerEvent[HTMLInputElement] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerLeaveCapture(value: js.Any): this.type = set("onPointerLeaveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerMove(value: SyntheticPointerEvent[HTMLInputElement] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerMoveCapture(value: js.Any): this.type = set("onPointerMoveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerOut(value: SyntheticPointerEvent[HTMLInputElement] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerOutCapture(value: js.Any): this.type = set("onPointerOutCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerOver(value: SyntheticPointerEvent[HTMLInputElement] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerOverCapture(value: js.Any): this.type = set("onPointerOverCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerUp(value: SyntheticPointerEvent[HTMLInputElement] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerUpCapture(value: js.Any): this.type = set("onPointerUpCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onProgress(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def onProgressCapture(value: js.Any): this.type = set("onProgressCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onRateChange(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onRateChangeCapture(value: js.Any): this.type = set("onRateChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onReset(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResetCapture(value: js.Any): this.type = set("onResetCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onScroll(value: SyntheticUIEvent[HTMLInputElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def onScrollCapture(value: js.Any): this.type = set("onScrollCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSeeked(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSeekedCapture(value: js.Any): this.type = set("onSeekedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSeeking(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSeekingCapture(value: js.Any): this.type = set("onSeekingCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSelect(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSelectCapture(value: js.Any): this.type = set("onSelectCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onStalled(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def onStalledCapture(value: js.Any): this.type = set("onStalledCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSubmit(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSubmitCapture(value: js.Any): this.type = set("onSubmitCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSuspend(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSuspendCapture(value: js.Any): this.type = set("onSuspendCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTimeUpdate(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTimeUpdateCapture(value: js.Any): this.type = set("onTimeUpdateCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchCancel(value: SyntheticTouchEvent[HTMLInputElement] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchCancelCapture(value: js.Any): this.type = set("onTouchCancelCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchEnd(value: SyntheticTouchEvent[HTMLInputElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchEndCapture(value: js.Any): this.type = set("onTouchEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchMove(value: SyntheticTouchEvent[HTMLInputElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchMoveCapture(value: js.Any): this.type = set("onTouchMoveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchStart(value: SyntheticTouchEvent[HTMLInputElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchStartCapture(value: js.Any): this.type = set("onTouchStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTransitionEnd(value: SyntheticTransitionEvent[HTMLInputElement] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTransitionEndCapture(value: js.Any): this.type = set("onTransitionEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onVolumeChange(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onVolumeChangeCapture(value: js.Any): this.type = set("onVolumeChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onWaiting(value: SyntheticEvent[Event, HTMLInputElement] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def onWaitingCapture(value: js.Any): this.type = set("onWaitingCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onWheel(value: SyntheticWheelEvent[HTMLInputElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onWheelCapture(value: js.Any): this.type = set("onWheelCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def optimum(value: Double): this.type = set("optimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def pattern(value: String): this.type = set("pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def playsInline(value: Boolean): this.type = set("playsInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def poster(value: String): this.type = set("poster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def preload(value: String): this.type = set("preload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rel(value: String): this.type = set("rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def reversed(value: Boolean): this.type = set("reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def sandbox(value: String): this.type = set("sandbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def scope(value: String): this.type = set("scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def scoped(value: Boolean): this.type = set("scoped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def scrolling(value: String): this.type = set("scrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def seamless(value: Boolean): this.type = set("seamless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def shape(value: String): this.type = set("shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def size(value: Sizes): this.type = set("size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def sizes(value: String): this.type = set("sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def span(value: Double): this.type = set("span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def srcDoc(value: String): this.type = set("srcDoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def srcLang(value: String): this.type = set("srcLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def srcSet(value: String): this.type = set("srcSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def start(value: Double): this.type = set("start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def step(value: Double | String): this.type = set("step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def summary(value: String): this.type = set("summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def useMap(value: String): this.type = set("useMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valid(value: ValidationStates): this.type = set("valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: String | js.Array[String] | Double): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valueVarargs(value: String*): this.type = set("value", js.Array(value :_*))
      
      @scala.inline
      def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def wmode(value: String): this.type = set("wmode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def wrap(value: String): this.type = set("wrap", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Input.type): typingsSlinky.storybookComponents.components.Form.Input.Builder = new typingsSlinky.storybookComponents.components.Form.Input.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PropsWithChildrenPickPick): typingsSlinky.storybookComponents.components.Form.Input.Builder = new typingsSlinky.storybookComponents.components.Form.Input.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Select {
    
    @JSImport("@storybook/components", "Form.Select")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[slinky.web.html.select.tag.type, js.Object] {
      
      @scala.inline
      def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def align(value: Alignments): this.type = set("align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-atomic`(value: Boolean): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-busy`(value: Boolean): this.type = set("aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-disabled`(value: Boolean): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-expanded`(value: Boolean): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-grabbed`(value: Boolean): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-hidden`(value: Boolean): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-modal`(value: Boolean): this.type = set("aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-multiline`(value: Boolean): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-multiselectable`(value: Boolean): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-readonly`(value: Boolean): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-required`(value: Boolean): this.type = set("aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-selected`(value: Boolean): this.type = set("aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def css(value: js.Any): this.type = set("css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value :_*))
      
      @scala.inline
      def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def form(value: String): this.type = set("form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inlist(value: js.Any): this.type = set("inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAbort(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAbortCapture(value: js.Any): this.type = set("onAbortCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAnimationEnd(value: SyntheticAnimationEvent[HTMLSelectElement] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAnimationEndCapture(value: js.Any): this.type = set("onAnimationEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAnimationIteration(value: SyntheticAnimationEvent[HTMLSelectElement] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAnimationIterationCapture(value: js.Any): this.type = set("onAnimationIterationCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAnimationStart(value: SyntheticAnimationEvent[HTMLSelectElement] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAnimationStartCapture(value: js.Any): this.type = set("onAnimationStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAuxClick(value: SyntheticMouseEvent[HTMLSelectElement] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAuxClickCapture(value: js.Any): this.type = set("onAuxClickCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onBeforeInput(value: SyntheticEvent[EventTarget with HTMLSelectElement, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def onBeforeInputCapture(value: js.Any): this.type = set("onBeforeInputCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onBlur(value: SyntheticFocusEvent[HTMLSelectElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def onBlurCapture(value: js.Any): this.type = set("onBlurCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCanPlay(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCanPlayCapture(value: js.Any): this.type = set("onCanPlayCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCanPlayThrough(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCanPlayThroughCapture(value: js.Any): this.type = set("onCanPlayThroughCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onChange(value: ChangeEvent[HTMLSelectElement] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onChangeCapture(value: js.Any): this.type = set("onChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onClick(value: SyntheticMouseEvent[HTMLSelectElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onClickCapture(value: js.Any): this.type = set("onClickCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCompositionEnd(value: SyntheticCompositionEvent[HTMLSelectElement] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCompositionEndCapture(value: js.Any): this.type = set("onCompositionEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCompositionStart(value: SyntheticCompositionEvent[HTMLSelectElement] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCompositionStartCapture(value: js.Any): this.type = set("onCompositionStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCompositionUpdate(value: SyntheticCompositionEvent[HTMLSelectElement] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCompositionUpdateCapture(value: js.Any): this.type = set("onCompositionUpdateCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onContextMenu(value: SyntheticMouseEvent[HTMLSelectElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def onContextMenuCapture(value: js.Any): this.type = set("onContextMenuCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCopy(value: SyntheticClipboardEvent[HTMLSelectElement] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCopyCapture(value: js.Any): this.type = set("onCopyCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCut(value: SyntheticClipboardEvent[HTMLSelectElement] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onCutCapture(value: js.Any): this.type = set("onCutCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDoubleClick(value: SyntheticMouseEvent[HTMLSelectElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDoubleClickCapture(value: js.Any): this.type = set("onDoubleClickCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDrag(value: DragEvent[HTMLSelectElement] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragCapture(value: js.Any): this.type = set("onDragCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragEnd(value: DragEvent[HTMLSelectElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragEndCapture(value: js.Any): this.type = set("onDragEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragEnter(value: DragEvent[HTMLSelectElement] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragEnterCapture(value: js.Any): this.type = set("onDragEnterCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragExit(value: DragEvent[HTMLSelectElement] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragExitCapture(value: js.Any): this.type = set("onDragExitCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragLeave(value: DragEvent[HTMLSelectElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragLeaveCapture(value: js.Any): this.type = set("onDragLeaveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragOver(value: DragEvent[HTMLSelectElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragOverCapture(value: js.Any): this.type = set("onDragOverCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragStart(value: DragEvent[HTMLSelectElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDragStartCapture(value: js.Any): this.type = set("onDragStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDrop(value: DragEvent[HTMLSelectElement] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDropCapture(value: js.Any): this.type = set("onDropCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDurationChange(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onDurationChangeCapture(value: js.Any): this.type = set("onDurationChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEmptied(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def onEmptiedCapture(value: js.Any): this.type = set("onEmptiedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEncrypted(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def onEncryptedCapture(value: js.Any): this.type = set("onEncryptedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEnded(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def onEndedCapture(value: js.Any): this.type = set("onEndedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onError(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def onErrorCapture(value: js.Any): this.type = set("onErrorCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onFocus(value: SyntheticFocusEvent[HTMLSelectElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def onFocusCapture(value: js.Any): this.type = set("onFocusCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onGotPointerCapture(value: js.Any): this.type = set("onGotPointerCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onGotPointerCaptureCapture(value: js.Any): this.type = set("onGotPointerCaptureCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onInput(value: SyntheticEvent[EventTarget with HTMLSelectElement, Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def onInputCapture(value: js.Any): this.type = set("onInputCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onInvalid(value: SyntheticEvent[EventTarget with HTMLSelectElement, Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def onInvalidCapture(value: js.Any): this.type = set("onInvalidCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onKeyDown(value: SyntheticKeyboardEvent[HTMLSelectElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyDownCapture(value: js.Any): this.type = set("onKeyDownCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onKeyPress(value: SyntheticKeyboardEvent[HTMLSelectElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyPressCapture(value: js.Any): this.type = set("onKeyPressCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onKeyUp(value: SyntheticKeyboardEvent[HTMLSelectElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyUpCapture(value: js.Any): this.type = set("onKeyUpCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoad(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadCapture(value: js.Any): this.type = set("onLoadCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoadStart(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadStartCapture(value: js.Any): this.type = set("onLoadStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoadedData(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadedDataCapture(value: js.Any): this.type = set("onLoadedDataCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoadedMetadata(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLoadedMetadataCapture(value: js.Any): this.type = set("onLoadedMetadataCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLostPointerCapture(value: js.Any): this.type = set("onLostPointerCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLostPointerCaptureCapture(value: js.Any): this.type = set("onLostPointerCaptureCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseDown(value: SyntheticMouseEvent[HTMLSelectElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseDownCapture(value: js.Any): this.type = set("onMouseDownCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseEnter(value: SyntheticMouseEvent[HTMLSelectElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseLeave(value: SyntheticMouseEvent[HTMLSelectElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseMove(value: SyntheticMouseEvent[HTMLSelectElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseMoveCapture(value: js.Any): this.type = set("onMouseMoveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseOut(value: SyntheticMouseEvent[HTMLSelectElement] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseOutCapture(value: js.Any): this.type = set("onMouseOutCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseOver(value: SyntheticMouseEvent[HTMLSelectElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseOverCapture(value: js.Any): this.type = set("onMouseOverCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseUp(value: SyntheticMouseEvent[HTMLSelectElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseUpCapture(value: js.Any): this.type = set("onMouseUpCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPaste(value: SyntheticClipboardEvent[HTMLSelectElement] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPasteCapture(value: js.Any): this.type = set("onPasteCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPause(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPauseCapture(value: js.Any): this.type = set("onPauseCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPlay(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPlayCapture(value: js.Any): this.type = set("onPlayCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPlaying(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPlayingCapture(value: js.Any): this.type = set("onPlayingCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerCancel(value: SyntheticPointerEvent[HTMLSelectElement] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerCancelCapture(value: js.Any): this.type = set("onPointerCancelCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerDown(value: SyntheticPointerEvent[HTMLSelectElement] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerDownCapture(value: js.Any): this.type = set("onPointerDownCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerEnter(value: SyntheticPointerEvent[HTMLSelectElement] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerEnterCapture(value: js.Any): this.type = set("onPointerEnterCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerLeave(value: SyntheticPointerEvent[HTMLSelectElement] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerLeaveCapture(value: js.Any): this.type = set("onPointerLeaveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerMove(value: SyntheticPointerEvent[HTMLSelectElement] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerMoveCapture(value: js.Any): this.type = set("onPointerMoveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerOut(value: SyntheticPointerEvent[HTMLSelectElement] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerOutCapture(value: js.Any): this.type = set("onPointerOutCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerOver(value: SyntheticPointerEvent[HTMLSelectElement] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerOverCapture(value: js.Any): this.type = set("onPointerOverCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerUp(value: SyntheticPointerEvent[HTMLSelectElement] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPointerUpCapture(value: js.Any): this.type = set("onPointerUpCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onProgress(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def onProgressCapture(value: js.Any): this.type = set("onProgressCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onRateChange(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onRateChangeCapture(value: js.Any): this.type = set("onRateChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onReset(value: SyntheticEvent[EventTarget with HTMLSelectElement, Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResetCapture(value: js.Any): this.type = set("onResetCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onScroll(value: SyntheticUIEvent[HTMLSelectElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def onScrollCapture(value: js.Any): this.type = set("onScrollCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSeeked(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSeekedCapture(value: js.Any): this.type = set("onSeekedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSeeking(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSeekingCapture(value: js.Any): this.type = set("onSeekingCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSelect(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSelectCapture(value: js.Any): this.type = set("onSelectCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onStalled(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def onStalledCapture(value: js.Any): this.type = set("onStalledCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSubmit(value: SyntheticEvent[EventTarget with HTMLSelectElement, Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSubmitCapture(value: js.Any): this.type = set("onSubmitCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSuspend(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSuspendCapture(value: js.Any): this.type = set("onSuspendCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTimeUpdate(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTimeUpdateCapture(value: js.Any): this.type = set("onTimeUpdateCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchCancel(value: SyntheticTouchEvent[HTMLSelectElement] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchCancelCapture(value: js.Any): this.type = set("onTouchCancelCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchEnd(value: SyntheticTouchEvent[HTMLSelectElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchEndCapture(value: js.Any): this.type = set("onTouchEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchMove(value: SyntheticTouchEvent[HTMLSelectElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchMoveCapture(value: js.Any): this.type = set("onTouchMoveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchStart(value: SyntheticTouchEvent[HTMLSelectElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchStartCapture(value: js.Any): this.type = set("onTouchStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTransitionEnd(value: SyntheticTransitionEvent[HTMLSelectElement] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTransitionEndCapture(value: js.Any): this.type = set("onTransitionEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onVolumeChange(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onVolumeChangeCapture(value: js.Any): this.type = set("onVolumeChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onWaiting(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def onWaitingCapture(value: js.Any): this.type = set("onWaitingCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onWheel(value: SyntheticWheelEvent[HTMLSelectElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onWheelCapture(value: js.Any): this.type = set("onWheelCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def size(value: Sizes): this.type = set("size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valid(value: ValidationStates): this.type = set("valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: String | js.Array[String] | Double): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valueVarargs(value: String*): this.type = set("value", js.Array(value :_*))
      
      @scala.inline
      def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Select.type): typingsSlinky.storybookComponents.components.Form.Select.Builder = new typingsSlinky.storybookComponents.components.Form.Select.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PropsWithChildrenPickSele): typingsSlinky.storybookComponents.components.Form.Select.Builder = new typingsSlinky.storybookComponents.components.Form.Select.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Textarea {
    
    @scala.inline
    def apply(children: js.UndefOr[js.Any] with js.UndefOr[ReactElement]): typingsSlinky.storybookComponents.components.Form.Textarea.Builder = {
      val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      new typingsSlinky.storybookComponents.components.Form.Textarea.Builder(js.Array(this.component, __props.asInstanceOf[PropsWithChildrenPickanyc]))
    }
    
    @JSImport("@storybook/components", "Form.Textarea")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def about(value: js.Any): this.type = set("about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessKey(value: js.Any): this.type = set("accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def align(value: Alignments): this.type = set("align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-activedescendant`(value: js.Any): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-atomic`(value: js.Any): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-autocomplete`(value: js.Any): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-busy`(value: js.Any): this.type = set("aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-checked`(value: js.Any): this.type = set("aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colcount`(value: js.Any): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colindex`(value: js.Any): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-colspan`(value: js.Any): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-controls`(value: js.Any): this.type = set("aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-current`(value: js.Any): this.type = set("aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-describedby`(value: js.Any): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-details`(value: js.Any): this.type = set("aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-disabled`(value: js.Any): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-dropeffect`(value: js.Any): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-errormessage`(value: js.Any): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-expanded`(value: js.Any): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-flowto`(value: js.Any): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-grabbed`(value: js.Any): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-haspopup`(value: js.Any): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-hidden`(value: js.Any): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-invalid`(value: js.Any): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-keyshortcuts`(value: js.Any): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-label`(value: js.Any): this.type = set("aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-labelledby`(value: js.Any): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-level`(value: js.Any): this.type = set("aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-live`(value: js.Any): this.type = set("aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-modal`(value: js.Any): this.type = set("aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-multiline`(value: js.Any): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-multiselectable`(value: js.Any): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-orientation`(value: js.Any): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-owns`(value: js.Any): this.type = set("aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-placeholder`(value: js.Any): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-posinset`(value: js.Any): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-pressed`(value: js.Any): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-readonly`(value: js.Any): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-relevant`(value: js.Any): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-required`(value: js.Any): this.type = set("aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-roledescription`(value: js.Any): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowcount`(value: js.Any): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowindex`(value: js.Any): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-rowspan`(value: js.Any): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-selected`(value: js.Any): this.type = set("aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-setsize`(value: js.Any): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-sort`(value: js.Any): this.type = set("aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuemax`(value: js.Any): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuemin`(value: js.Any): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuenow`(value: js.Any): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `aria-valuetext`(value: js.Any): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoCapitalize(value: js.Any): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoComplete(value: js.Any): this.type = set("autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoCorrect(value: js.Any): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoFocus(value: js.Any): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoSave(value: js.Any): this.type = set("autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def cacheMeasurements(value: js.Any): this.type = set("cacheMeasurements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def className(value: js.Any): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def color(value: js.Any): this.type = set("color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def cols(value: js.Any): this.type = set("cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def contentEditable(value: js.Any): this.type = set("contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def contextMenu(value: js.Any): this.type = set("contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def css(value: js.Any): this.type = set("css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dangerouslySetInnerHTML(value: js.Any): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def datatype(value: js.Any): this.type = set("datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultChecked(value: js.Any): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValue(value: js.Any): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dir(value: js.Any): this.type = set("dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dirName(value: js.Any): this.type = set("dirName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabled(value: js.Any): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def draggable(value: js.Any): this.type = set("draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def form(value: js.Any): this.type = set("form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hidden(value: js.Any): this.type = set("hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def id(value: js.Any): this.type = set("id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inlist(value: js.Any): this.type = set("inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inputMode(value: js.Any): this.type = set("inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def is(value: js.Any): this.type = set("is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemID(value: js.Any): this.type = set("itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemProp(value: js.Any): this.type = set("itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemRef(value: js.Any): this.type = set("itemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemScope(value: js.Any): this.type = set("itemScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def itemType(value: js.Any): this.type = set("itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def lang(value: js.Any): this.type = set("lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def maxLength(value: js.Any): this.type = set("maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def maxRows(value: js.Any): this.type = set("maxRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def minLength(value: js.Any): this.type = set("minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def minRows(value: js.Any): this.type = set("minRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def name(value: js.Any): this.type = set("name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAbort(value: js.Any): this.type = set("onAbort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAbortCapture(value: js.Any): this.type = set("onAbortCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAnimationEnd(value: js.Any): this.type = set("onAnimationEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAnimationEndCapture(value: js.Any): this.type = set("onAnimationEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAnimationIteration(value: js.Any): this.type = set("onAnimationIteration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAnimationIterationCapture(value: js.Any): this.type = set("onAnimationIterationCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAnimationStart(value: js.Any): this.type = set("onAnimationStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAnimationStartCapture(value: js.Any): this.type = set("onAnimationStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAuxClick(value: js.Any): this.type = set("onAuxClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAuxClickCapture(value: js.Any): this.type = set("onAuxClickCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onBeforeInput(value: js.Any): this.type = set("onBeforeInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onBeforeInputCapture(value: js.Any): this.type = set("onBeforeInputCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onBlur(value: js.Any): this.type = set("onBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onBlurCapture(value: js.Any): this.type = set("onBlurCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCanPlay(value: js.Any): this.type = set("onCanPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCanPlayCapture(value: js.Any): this.type = set("onCanPlayCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCanPlayThrough(value: js.Any): this.type = set("onCanPlayThrough", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCanPlayThroughCapture(value: js.Any): this.type = set("onCanPlayThroughCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onChange(value: js.Any): this.type = set("onChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onChangeCapture(value: js.Any): this.type = set("onChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onClick(value: js.Any): this.type = set("onClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onClickCapture(value: js.Any): this.type = set("onClickCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCompositionEnd(value: js.Any): this.type = set("onCompositionEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCompositionEndCapture(value: js.Any): this.type = set("onCompositionEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCompositionStart(value: js.Any): this.type = set("onCompositionStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCompositionStartCapture(value: js.Any): this.type = set("onCompositionStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCompositionUpdate(value: js.Any): this.type = set("onCompositionUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCompositionUpdateCapture(value: js.Any): this.type = set("onCompositionUpdateCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onContextMenu(value: js.Any): this.type = set("onContextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onContextMenuCapture(value: js.Any): this.type = set("onContextMenuCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCopy(value: js.Any): this.type = set("onCopy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCopyCapture(value: js.Any): this.type = set("onCopyCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCut(value: js.Any): this.type = set("onCut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onCutCapture(value: js.Any): this.type = set("onCutCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDoubleClick(value: js.Any): this.type = set("onDoubleClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDoubleClickCapture(value: js.Any): this.type = set("onDoubleClickCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDrag(value: js.Any): this.type = set("onDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragCapture(value: js.Any): this.type = set("onDragCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragEnd(value: js.Any): this.type = set("onDragEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragEndCapture(value: js.Any): this.type = set("onDragEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragEnter(value: js.Any): this.type = set("onDragEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragEnterCapture(value: js.Any): this.type = set("onDragEnterCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragExit(value: js.Any): this.type = set("onDragExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragExitCapture(value: js.Any): this.type = set("onDragExitCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragLeave(value: js.Any): this.type = set("onDragLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragLeaveCapture(value: js.Any): this.type = set("onDragLeaveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragOver(value: js.Any): this.type = set("onDragOver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragOverCapture(value: js.Any): this.type = set("onDragOverCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragStart(value: js.Any): this.type = set("onDragStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDragStartCapture(value: js.Any): this.type = set("onDragStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDrop(value: js.Any): this.type = set("onDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDropCapture(value: js.Any): this.type = set("onDropCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDurationChange(value: js.Any): this.type = set("onDurationChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onDurationChangeCapture(value: js.Any): this.type = set("onDurationChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEmptied(value: js.Any): this.type = set("onEmptied", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEmptiedCapture(value: js.Any): this.type = set("onEmptiedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEncrypted(value: js.Any): this.type = set("onEncrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEncryptedCapture(value: js.Any): this.type = set("onEncryptedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEnded(value: js.Any): this.type = set("onEnded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onEndedCapture(value: js.Any): this.type = set("onEndedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onError(value: js.Any): this.type = set("onError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onErrorCapture(value: js.Any): this.type = set("onErrorCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onFocus(value: js.Any): this.type = set("onFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onFocusCapture(value: js.Any): this.type = set("onFocusCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onGotPointerCapture(value: js.Any): this.type = set("onGotPointerCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onGotPointerCaptureCapture(value: js.Any): this.type = set("onGotPointerCaptureCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onHeightChange(value: js.Any): this.type = set("onHeightChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onInput(value: js.Any): this.type = set("onInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onInputCapture(value: js.Any): this.type = set("onInputCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onInvalid(value: js.Any): this.type = set("onInvalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onInvalidCapture(value: js.Any): this.type = set("onInvalidCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onKeyDown(value: js.Any): this.type = set("onKeyDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onKeyDownCapture(value: js.Any): this.type = set("onKeyDownCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onKeyPress(value: js.Any): this.type = set("onKeyPress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onKeyPressCapture(value: js.Any): this.type = set("onKeyPressCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onKeyUp(value: js.Any): this.type = set("onKeyUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onKeyUpCapture(value: js.Any): this.type = set("onKeyUpCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoad(value: js.Any): this.type = set("onLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoadCapture(value: js.Any): this.type = set("onLoadCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoadStart(value: js.Any): this.type = set("onLoadStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoadStartCapture(value: js.Any): this.type = set("onLoadStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoadedData(value: js.Any): this.type = set("onLoadedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoadedDataCapture(value: js.Any): this.type = set("onLoadedDataCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoadedMetadata(value: js.Any): this.type = set("onLoadedMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLoadedMetadataCapture(value: js.Any): this.type = set("onLoadedMetadataCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLostPointerCapture(value: js.Any): this.type = set("onLostPointerCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onLostPointerCaptureCapture(value: js.Any): this.type = set("onLostPointerCaptureCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseDown(value: js.Any): this.type = set("onMouseDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseDownCapture(value: js.Any): this.type = set("onMouseDownCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseEnter(value: js.Any): this.type = set("onMouseEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseLeave(value: js.Any): this.type = set("onMouseLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseMove(value: js.Any): this.type = set("onMouseMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseMoveCapture(value: js.Any): this.type = set("onMouseMoveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseOut(value: js.Any): this.type = set("onMouseOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseOutCapture(value: js.Any): this.type = set("onMouseOutCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseOver(value: js.Any): this.type = set("onMouseOver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseOverCapture(value: js.Any): this.type = set("onMouseOverCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseUp(value: js.Any): this.type = set("onMouseUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onMouseUpCapture(value: js.Any): this.type = set("onMouseUpCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPaste(value: js.Any): this.type = set("onPaste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPasteCapture(value: js.Any): this.type = set("onPasteCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPause(value: js.Any): this.type = set("onPause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPauseCapture(value: js.Any): this.type = set("onPauseCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPlay(value: js.Any): this.type = set("onPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPlayCapture(value: js.Any): this.type = set("onPlayCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPlaying(value: js.Any): this.type = set("onPlaying", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPlayingCapture(value: js.Any): this.type = set("onPlayingCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerCancel(value: js.Any): this.type = set("onPointerCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerCancelCapture(value: js.Any): this.type = set("onPointerCancelCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerDown(value: js.Any): this.type = set("onPointerDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerDownCapture(value: js.Any): this.type = set("onPointerDownCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerEnter(value: js.Any): this.type = set("onPointerEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerEnterCapture(value: js.Any): this.type = set("onPointerEnterCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerLeave(value: js.Any): this.type = set("onPointerLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerLeaveCapture(value: js.Any): this.type = set("onPointerLeaveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerMove(value: js.Any): this.type = set("onPointerMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerMoveCapture(value: js.Any): this.type = set("onPointerMoveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerOut(value: js.Any): this.type = set("onPointerOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerOutCapture(value: js.Any): this.type = set("onPointerOutCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerOver(value: js.Any): this.type = set("onPointerOver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerOverCapture(value: js.Any): this.type = set("onPointerOverCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerUp(value: js.Any): this.type = set("onPointerUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onPointerUpCapture(value: js.Any): this.type = set("onPointerUpCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onProgress(value: js.Any): this.type = set("onProgress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onProgressCapture(value: js.Any): this.type = set("onProgressCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onRateChange(value: js.Any): this.type = set("onRateChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onRateChangeCapture(value: js.Any): this.type = set("onRateChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onReset(value: js.Any): this.type = set("onReset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onResetCapture(value: js.Any): this.type = set("onResetCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onScroll(value: js.Any): this.type = set("onScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onScrollCapture(value: js.Any): this.type = set("onScrollCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSeeked(value: js.Any): this.type = set("onSeeked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSeekedCapture(value: js.Any): this.type = set("onSeekedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSeeking(value: js.Any): this.type = set("onSeeking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSeekingCapture(value: js.Any): this.type = set("onSeekingCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSelect(value: js.Any): this.type = set("onSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSelectCapture(value: js.Any): this.type = set("onSelectCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onStalled(value: js.Any): this.type = set("onStalled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onStalledCapture(value: js.Any): this.type = set("onStalledCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSubmit(value: js.Any): this.type = set("onSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSubmitCapture(value: js.Any): this.type = set("onSubmitCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSuspend(value: js.Any): this.type = set("onSuspend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onSuspendCapture(value: js.Any): this.type = set("onSuspendCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTimeUpdate(value: js.Any): this.type = set("onTimeUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTimeUpdateCapture(value: js.Any): this.type = set("onTimeUpdateCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchCancel(value: js.Any): this.type = set("onTouchCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchCancelCapture(value: js.Any): this.type = set("onTouchCancelCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchEnd(value: js.Any): this.type = set("onTouchEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchEndCapture(value: js.Any): this.type = set("onTouchEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchMove(value: js.Any): this.type = set("onTouchMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchMoveCapture(value: js.Any): this.type = set("onTouchMoveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchStart(value: js.Any): this.type = set("onTouchStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTouchStartCapture(value: js.Any): this.type = set("onTouchStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTransitionEnd(value: js.Any): this.type = set("onTransitionEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onTransitionEndCapture(value: js.Any): this.type = set("onTransitionEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onVolumeChange(value: js.Any): this.type = set("onVolumeChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onVolumeChangeCapture(value: js.Any): this.type = set("onVolumeChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onWaiting(value: js.Any): this.type = set("onWaiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onWaitingCapture(value: js.Any): this.type = set("onWaitingCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onWheel(value: js.Any): this.type = set("onWheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onWheelCapture(value: js.Any): this.type = set("onWheelCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def placeholder(value: js.Any): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefix(value: js.Any): this.type = set("prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def property(value: js.Any): this.type = set("property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def radioGroup(value: js.Any): this.type = set("radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def readOnly(value: js.Any): this.type = set("readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def required(value: js.Any): this.type = set("required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def resource(value: js.Any): this.type = set("resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def results(value: js.Any): this.type = set("results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def role(value: js.Any): this.type = set("role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rows(value: js.Any): this.type = set("rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def security(value: js.Any): this.type = set("security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def size(value: Sizes): this.type = set("size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def slot(value: js.Any): this.type = set("slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def spellCheck(value: js.Any): this.type = set("spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suppressContentEditableWarning(value: js.Any): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suppressHydrationWarning(value: js.Any): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tabIndex(value: js.Any): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def title(value: js.Any): this.type = set("title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def translate(value: js.Any): this.type = set("translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def typeof(value: js.Any): this.type = set("typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def unselectable(value: js.Any): this.type = set("unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valid(value: ValidationStates): this.type = set("valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def vocab(value: js.Any): this.type = set("vocab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def wrap(value: js.Any): this.type = set("wrap", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: PropsWithChildrenPickanyc): typingsSlinky.storybookComponents.components.Form.Textarea.Builder = new typingsSlinky.storybookComponents.components.Form.Textarea.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@storybook/components", "Form")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[slinky.web.html.form.tag.type, HTMLFormElement] {
    
    @scala.inline
    def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def acceptCharset(value: String): this.type = set("acceptCharset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def action(value: String): this.type = set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-atomic`(value: Boolean): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-busy`(value: Boolean): this.type = set("aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-disabled`(value: Boolean): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-expanded`(value: Boolean): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-grabbed`(value: Boolean): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-hidden`(value: Boolean): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-modal`(value: Boolean): this.type = set("aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-multiline`(value: Boolean): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-multiselectable`(value: Boolean): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-readonly`(value: Boolean): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-required`(value: Boolean): this.type = set("aria-required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-selected`(value: Boolean): this.type = set("aria-selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def css(value: js.Any): this.type = set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def encType(value: String): this.type = set("encType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inlist(value: js.Any): this.type = set("inlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def method(value: String): this.type = set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noValidate(value: Boolean): this.type = set("noValidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAbort(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAbortCapture(value: js.Any): this.type = set("onAbortCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAnimationEnd(value: SyntheticAnimationEvent[HTMLFormElement] => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationEndCapture(value: js.Any): this.type = set("onAnimationEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAnimationIteration(value: SyntheticAnimationEvent[HTMLFormElement] => Unit): this.type = set("onAnimationIteration", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationIterationCapture(value: js.Any): this.type = set("onAnimationIterationCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAnimationStart(value: SyntheticAnimationEvent[HTMLFormElement] => Unit): this.type = set("onAnimationStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAnimationStartCapture(value: js.Any): this.type = set("onAnimationStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAuxClick(value: SyntheticMouseEvent[HTMLFormElement] => Unit): this.type = set("onAuxClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAuxClickCapture(value: js.Any): this.type = set("onAuxClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBeforeInput(value: SyntheticEvent[EventTarget with HTMLFormElement, Event] => Unit): this.type = set("onBeforeInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBeforeInputCapture(value: js.Any): this.type = set("onBeforeInputCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[HTMLFormElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBlurCapture(value: js.Any): this.type = set("onBlurCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCanPlay(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onCanPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCanPlayCapture(value: js.Any): this.type = set("onCanPlayCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCanPlayThrough(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCanPlayThroughCapture(value: js.Any): this.type = set("onCanPlayThroughCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: SyntheticEvent[EventTarget with HTMLFormElement, Event] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChangeCapture(value: js.Any): this.type = set("onChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLFormElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClickCapture(value: js.Any): this.type = set("onClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCompositionEnd(value: SyntheticCompositionEvent[HTMLFormElement] => Unit): this.type = set("onCompositionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionEndCapture(value: js.Any): this.type = set("onCompositionEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCompositionStart(value: SyntheticCompositionEvent[HTMLFormElement] => Unit): this.type = set("onCompositionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionStartCapture(value: js.Any): this.type = set("onCompositionStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCompositionUpdate(value: SyntheticCompositionEvent[HTMLFormElement] => Unit): this.type = set("onCompositionUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompositionUpdateCapture(value: js.Any): this.type = set("onCompositionUpdateCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onContextMenu(value: SyntheticMouseEvent[HTMLFormElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def onContextMenuCapture(value: js.Any): this.type = set("onContextMenuCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCopy(value: SyntheticClipboardEvent[HTMLFormElement] => Unit): this.type = set("onCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCopyCapture(value: js.Any): this.type = set("onCopyCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCut(value: SyntheticClipboardEvent[HTMLFormElement] => Unit): this.type = set("onCut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCutCapture(value: js.Any): this.type = set("onCutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDoubleClick(value: SyntheticMouseEvent[HTMLFormElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDoubleClickCapture(value: js.Any): this.type = set("onDoubleClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDrag(value: DragEvent[HTMLFormElement] => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragCapture(value: js.Any): this.type = set("onDragCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragEnd(value: DragEvent[HTMLFormElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEndCapture(value: js.Any): this.type = set("onDragEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragEnter(value: DragEvent[HTMLFormElement] => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEnterCapture(value: js.Any): this.type = set("onDragEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragExit(value: DragEvent[HTMLFormElement] => Unit): this.type = set("onDragExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragExitCapture(value: js.Any): this.type = set("onDragExitCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragLeave(value: DragEvent[HTMLFormElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragLeaveCapture(value: js.Any): this.type = set("onDragLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragOver(value: DragEvent[HTMLFormElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragOverCapture(value: js.Any): this.type = set("onDragOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragStart(value: DragEvent[HTMLFormElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragStartCapture(value: js.Any): this.type = set("onDragStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDrop(value: DragEvent[HTMLFormElement] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDropCapture(value: js.Any): this.type = set("onDropCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDurationChange(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDurationChangeCapture(value: js.Any): this.type = set("onDurationChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEmptied(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onEmptied", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEmptiedCapture(value: js.Any): this.type = set("onEmptiedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEncrypted(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onEncrypted", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEncryptedCapture(value: js.Any): this.type = set("onEncryptedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEnded(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEndedCapture(value: js.Any): this.type = set("onEndedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onError(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onErrorCapture(value: js.Any): this.type = set("onErrorCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLFormElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocusCapture(value: js.Any): this.type = set("onFocusCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onGotPointerCapture(value: js.Any): this.type = set("onGotPointerCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onGotPointerCaptureCapture(value: js.Any): this.type = set("onGotPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onInput(value: SyntheticEvent[EventTarget with HTMLFormElement, Event] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInputCapture(value: js.Any): this.type = set("onInputCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onInvalid(value: SyntheticEvent[EventTarget with HTMLFormElement, Event] => Unit): this.type = set("onInvalid", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInvalidCapture(value: js.Any): this.type = set("onInvalidCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[HTMLFormElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDownCapture(value: js.Any): this.type = set("onKeyDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onKeyPress(value: SyntheticKeyboardEvent[HTMLFormElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyPressCapture(value: js.Any): this.type = set("onKeyPressCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onKeyUp(value: SyntheticKeyboardEvent[HTMLFormElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyUpCapture(value: js.Any): this.type = set("onKeyUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLoad(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadCapture(value: js.Any): this.type = set("onLoadCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLoadStart(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onLoadStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadStartCapture(value: js.Any): this.type = set("onLoadStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLoadedData(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onLoadedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadedDataCapture(value: js.Any): this.type = set("onLoadedDataCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLoadedMetadata(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadedMetadataCapture(value: js.Any): this.type = set("onLoadedMetadataCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLostPointerCapture(value: js.Any): this.type = set("onLostPointerCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLostPointerCaptureCapture(value: js.Any): this.type = set("onLostPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseDown(value: SyntheticMouseEvent[HTMLFormElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseDownCapture(value: js.Any): this.type = set("onMouseDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLFormElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLFormElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseMove(value: SyntheticMouseEvent[HTMLFormElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseMoveCapture(value: js.Any): this.type = set("onMouseMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseOut(value: SyntheticMouseEvent[HTMLFormElement] => Unit): this.type = set("onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOutCapture(value: js.Any): this.type = set("onMouseOutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseOver(value: SyntheticMouseEvent[HTMLFormElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOverCapture(value: js.Any): this.type = set("onMouseOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseUp(value: SyntheticMouseEvent[HTMLFormElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseUpCapture(value: js.Any): this.type = set("onMouseUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPaste(value: SyntheticClipboardEvent[HTMLFormElement] => Unit): this.type = set("onPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPasteCapture(value: js.Any): this.type = set("onPasteCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPause(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPauseCapture(value: js.Any): this.type = set("onPauseCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPlay(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlayCapture(value: js.Any): this.type = set("onPlayCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPlaying(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onPlaying", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlayingCapture(value: js.Any): this.type = set("onPlayingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerCancel(value: SyntheticPointerEvent[HTMLFormElement] => Unit): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerCancelCapture(value: js.Any): this.type = set("onPointerCancelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerDown(value: SyntheticPointerEvent[HTMLFormElement] => Unit): this.type = set("onPointerDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerDownCapture(value: js.Any): this.type = set("onPointerDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerEnter(value: SyntheticPointerEvent[HTMLFormElement] => Unit): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerEnterCapture(value: js.Any): this.type = set("onPointerEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerLeave(value: SyntheticPointerEvent[HTMLFormElement] => Unit): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerLeaveCapture(value: js.Any): this.type = set("onPointerLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerMove(value: SyntheticPointerEvent[HTMLFormElement] => Unit): this.type = set("onPointerMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerMoveCapture(value: js.Any): this.type = set("onPointerMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerOut(value: SyntheticPointerEvent[HTMLFormElement] => Unit): this.type = set("onPointerOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerOutCapture(value: js.Any): this.type = set("onPointerOutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerOver(value: SyntheticPointerEvent[HTMLFormElement] => Unit): this.type = set("onPointerOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerOverCapture(value: js.Any): this.type = set("onPointerOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerUp(value: SyntheticPointerEvent[HTMLFormElement] => Unit): this.type = set("onPointerUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerUpCapture(value: js.Any): this.type = set("onPointerUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onProgress(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onProgressCapture(value: js.Any): this.type = set("onProgressCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onRateChange(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRateChangeCapture(value: js.Any): this.type = set("onRateChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onReset(value: SyntheticEvent[EventTarget with HTMLFormElement, Event] => Unit): this.type = set("onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResetCapture(value: js.Any): this.type = set("onResetCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onScroll(value: SyntheticUIEvent[HTMLFormElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScrollCapture(value: js.Any): this.type = set("onScrollCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSeeked(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeekedCapture(value: js.Any): this.type = set("onSeekedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSeeking(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeekingCapture(value: js.Any): this.type = set("onSeekingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSelect(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelectCapture(value: js.Any): this.type = set("onSelectCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onStalled(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onStalled", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStalledCapture(value: js.Any): this.type = set("onStalledCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSubmit(value: SyntheticEvent[EventTarget with HTMLFormElement, Event] => Unit): this.type = set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSubmitCapture(value: js.Any): this.type = set("onSubmitCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSuspend(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onSuspend", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSuspendCapture(value: js.Any): this.type = set("onSuspendCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTimeUpdate(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTimeUpdateCapture(value: js.Any): this.type = set("onTimeUpdateCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchCancel(value: SyntheticTouchEvent[HTMLFormElement] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchCancelCapture(value: js.Any): this.type = set("onTouchCancelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchEnd(value: SyntheticTouchEvent[HTMLFormElement] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchEndCapture(value: js.Any): this.type = set("onTouchEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchMove(value: SyntheticTouchEvent[HTMLFormElement] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchMoveCapture(value: js.Any): this.type = set("onTouchMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchStart(value: SyntheticTouchEvent[HTMLFormElement] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchStartCapture(value: js.Any): this.type = set("onTouchStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTransitionEnd(value: SyntheticTransitionEvent[HTMLFormElement] => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTransitionEndCapture(value: js.Any): this.type = set("onTransitionEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onVolumeChange(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onVolumeChangeCapture(value: js.Any): this.type = set("onVolumeChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onWaiting(value: SyntheticEvent[Event, HTMLFormElement] => Unit): this.type = set("onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def onWaitingCapture(value: js.Any): this.type = set("onWaitingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onWheel(value: SyntheticWheelEvent[HTMLFormElement] => Unit): this.type = set("onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onWheelCapture(value: js.Any): this.type = set("onWheelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Form.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithChildrenDetailed): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
