package typingsSlinky.storybookUi.components

import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.facade.ReactRef
import slinky.web.svg.svg.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.storybookComponents.iconsMod.IconKey
import typingsSlinky.storybookTheming.typesMod.Theme
import typingsSlinky.storybookUi.anon.PickPropsWithChildrenIcon
import typingsSlinky.storybookUi.anon.ValidString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SuccessIcon {
  
  @scala.inline
  def apply(icon: IconKey, valid: String): Builder = {
    val __props = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PickPropsWithChildrenIcon with (Omit[ValidString, theme]) with `0`[Theme]]))
  }
  
  @JSImport("@storybook/ui/dist/settings/shortcuts", "SuccessIcon")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def accentHeight(value: js.Any): this.type = set("accentHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accumulate(value: js.Any): this.type = set("accumulate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def additive(value: js.Any): this.type = set("additive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alignmentBaseline(value: js.Any): this.type = set("alignmentBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowReorder(value: js.Any): this.type = set("allowReorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def alphabetic(value: js.Any): this.type = set("alphabetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def amplitude(value: js.Any): this.type = set("amplitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arabicForm(value: js.Any): this.type = set("arabicForm", value.asInstanceOf[js.Any])
    
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
    def ascent(value: js.Any): this.type = set("ascent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def attributeName(value: js.Any): this.type = set("attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def attributeType(value: js.Any): this.type = set("attributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoReverse(value: js.Any): this.type = set("autoReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def azimuth(value: js.Any): this.type = set("azimuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def baseFrequency(value: js.Any): this.type = set("baseFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def baseProfile(value: js.Any): this.type = set("baseProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def baselineShift(value: js.Any): this.type = set("baselineShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bbox(value: js.Any): this.type = set("bbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def begin(value: js.Any): this.type = set("begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bias(value: js.Any): this.type = set("bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def by(value: js.Any): this.type = set("by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def calcMode(value: js.Any): this.type = set("calcMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def capHeight(value: js.Any): this.type = set("capHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: js.Any): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clip(value: js.Any): this.type = set("clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clipPath(value: js.Any): this.type = set("clipPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clipPathUnits(value: js.Any): this.type = set("clipPathUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clipRule(value: js.Any): this.type = set("clipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: js.Any): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorInterpolation(value: js.Any): this.type = set("colorInterpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorInterpolationFilters(value: js.Any): this.type = set("colorInterpolationFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorProfile(value: js.Any): this.type = set("colorProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorRendering(value: js.Any): this.type = set("colorRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentScriptType(value: js.Any): this.type = set("contentScriptType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentStyleType(value: js.Any): this.type = set("contentStyleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def crossOrigin(value: js.Any): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def css(value: js.Any): this.type = set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cursor(value: js.Any): this.type = set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cx(value: js.Any): this.type = set("cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cy(value: js.Any): this.type = set("cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def d(value: js.Any): this.type = set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dangerouslySetInnerHTML(value: js.Any): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def decelerate(value: js.Any): this.type = set("decelerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def descent(value: js.Any): this.type = set("descent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def diffuseConstant(value: js.Any): this.type = set("diffuseConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: js.Any): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def display(value: js.Any): this.type = set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def divisor(value: js.Any): this.type = set("divisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dominantBaseline(value: js.Any): this.type = set("dominantBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dur(value: js.Any): this.type = set("dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dx(value: js.Any): this.type = set("dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dy(value: js.Any): this.type = set("dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def edgeMode(value: js.Any): this.type = set("edgeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def elevation(value: js.Any): this.type = set("elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableBackground(value: js.Any): this.type = set("enableBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def end(value: js.Any): this.type = set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def exponent(value: js.Any): this.type = set("exponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def externalResourcesRequired(value: js.Any): this.type = set("externalResourcesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fill(value: js.Any): this.type = set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillOpacity(value: js.Any): this.type = set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fillRule(value: js.Any): this.type = set("fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filter(value: js.Any): this.type = set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterRes(value: js.Any): this.type = set("filterRes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterUnits(value: js.Any): this.type = set("filterUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floodColor(value: js.Any): this.type = set("floodColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floodOpacity(value: js.Any): this.type = set("floodOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusable(value: js.Any): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontFamily(value: js.Any): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontSize(value: js.Any): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontSizeAdjust(value: js.Any): this.type = set("fontSizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontStretch(value: js.Any): this.type = set("fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontStyle(value: js.Any): this.type = set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontVariant(value: js.Any): this.type = set("fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontWeight(value: js.Any): this.type = set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def format(value: js.Any): this.type = set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def from(value: js.Any): this.type = set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fx(value: js.Any): this.type = set("fx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fy(value: js.Any): this.type = set("fy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def g1(value: js.Any): this.type = set("g1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def g2(value: js.Any): this.type = set("g2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def glyphName(value: js.Any): this.type = set("glyphName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def glyphOrientationHorizontal(value: js.Any): this.type = set("glyphOrientationHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def glyphOrientationVertical(value: js.Any): this.type = set("glyphOrientationVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def glyphRef(value: js.Any): this.type = set("glyphRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gradientTransform(value: js.Any): this.type = set("gradientTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gradientUnits(value: js.Any): this.type = set("gradientUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hanging(value: js.Any): this.type = set("hanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: js.Any): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def horizAdvX(value: js.Any): this.type = set("horizAdvX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def horizOriginX(value: js.Any): this.type = set("horizOriginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def href(value: js.Any): this.type = set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: js.Any): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ideographic(value: js.Any): this.type = set("ideographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def imageRendering(value: js.Any): this.type = set("imageRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def in(value: js.Any): this.type = set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def in2(value: js.Any): this.type = set("in2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `inline`(value: js.Any): this.type = set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def intercept(value: js.Any): this.type = set("intercept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def k(value: js.Any): this.type = set("k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def k1(value: js.Any): this.type = set("k1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def k2(value: js.Any): this.type = set("k2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def k3(value: js.Any): this.type = set("k3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def k4(value: js.Any): this.type = set("k4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def kernelMatrix(value: js.Any): this.type = set("kernelMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def kernelUnitLength(value: js.Any): this.type = set("kernelUnitLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def kerning(value: js.Any): this.type = set("kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyPoints(value: js.Any): this.type = set("keyPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keySplines(value: js.Any): this.type = set("keySplines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyTimes(value: js.Any): this.type = set("keyTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lang(value: js.Any): this.type = set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lengthAdjust(value: js.Any): this.type = set("lengthAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def letterSpacing(value: js.Any): this.type = set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lightingColor(value: js.Any): this.type = set("lightingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def limitingConeAngle(value: js.Any): this.type = set("limitingConeAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def local(value: js.Any): this.type = set("local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def markerEnd(value: js.Any): this.type = set("markerEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def markerHeight(value: js.Any): this.type = set("markerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def markerMid(value: js.Any): this.type = set("markerMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def markerStart(value: js.Any): this.type = set("markerStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def markerUnits(value: js.Any): this.type = set("markerUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def markerWidth(value: js.Any): this.type = set("markerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mask(value: js.Any): this.type = set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskContentUnits(value: js.Any): this.type = set("maskContentUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskUnits(value: js.Any): this.type = set("maskUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mathematical(value: js.Any): this.type = set("mathematical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def max(value: js.Any): this.type = set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def media(value: js.Any): this.type = set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def method(value: js.Any): this.type = set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def min(value: js.Any): this.type = set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mode(value: js.Any): this.type = set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: js.Any): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def numOctaves(value: js.Any): this.type = set("numOctaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offset(value: js.Any): this.type = set("offset", value.asInstanceOf[js.Any])
    
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
    def opacity(value: js.Any): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def operator(value: js.Any): this.type = set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def order(value: js.Any): this.type = set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def orient(value: js.Any): this.type = set("orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def orientation(value: js.Any): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def origin(value: js.Any): this.type = set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflow(value: js.Any): this.type = set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlinePosition(value: js.Any): this.type = set("overlinePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlineThickness(value: js.Any): this.type = set("overlineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def paintOrder(value: js.Any): this.type = set("paintOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def panose1(value: js.Any): this.type = set("panose1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def path(value: js.Any): this.type = set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pathLength(value: js.Any): this.type = set("pathLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def patternContentUnits(value: js.Any): this.type = set("patternContentUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def patternTransform(value: js.Any): this.type = set("patternTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def patternUnits(value: js.Any): this.type = set("patternUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pointerEvents(value: js.Any): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def points(value: js.Any): this.type = set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pointsAtX(value: js.Any): this.type = set("pointsAtX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pointsAtY(value: js.Any): this.type = set("pointsAtY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pointsAtZ(value: js.Any): this.type = set("pointsAtZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def preserveAlpha(value: js.Any): this.type = set("preserveAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def preserveAspectRatio(value: js.Any): this.type = set("preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def primitiveUnits(value: js.Any): this.type = set("primitiveUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def r(value: js.Any): this.type = set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radius(value: js.Any): this.type = set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ref(value: (js.Function1[/* instance */ SVGSVGElement, Unit]) | ReactRef[SVGSVGElement]): this.type = set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def refFunction1(value: /* instance */ SVGSVGElement => Unit): this.type = set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def refRefObject(value: ReactRef[SVGSVGElement]): this.type = set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def refX(value: js.Any): this.type = set("refX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def refY(value: js.Any): this.type = set("refY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderingIntent(value: js.Any): this.type = set("renderingIntent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def repeatCount(value: js.Any): this.type = set("repeatCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def repeatDur(value: js.Any): this.type = set("repeatDur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def requiredExtensions(value: js.Any): this.type = set("requiredExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def requiredFeatures(value: js.Any): this.type = set("requiredFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def restart(value: js.Any): this.type = set("restart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def result(value: js.Any): this.type = set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def role(value: js.Any): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rotate(value: js.Any): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rx(value: js.Any): this.type = set("rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ry(value: js.Any): this.type = set("ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scale(value: js.Any): this.type = set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def seed(value: js.Any): this.type = set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shapeRendering(value: js.Any): this.type = set("shapeRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def slope(value: js.Any): this.type = set("slope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def spacing(value: js.Any): this.type = set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def specularConstant(value: js.Any): this.type = set("specularConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def specularExponent(value: js.Any): this.type = set("specularExponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def speed(value: js.Any): this.type = set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def spreadMethod(value: js.Any): this.type = set("spreadMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startOffset(value: js.Any): this.type = set("startOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stdDeviation(value: js.Any): this.type = set("stdDeviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stemh(value: js.Any): this.type = set("stemh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stemv(value: js.Any): this.type = set("stemv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stitchTiles(value: js.Any): this.type = set("stitchTiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stopColor(value: js.Any): this.type = set("stopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stopOpacity(value: js.Any): this.type = set("stopOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strikethroughPosition(value: js.Any): this.type = set("strikethroughPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strikethroughThickness(value: js.Any): this.type = set("strikethroughThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def string(value: js.Any): this.type = set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stroke(value: js.Any): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeDasharray(value: js.Any): this.type = set("strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeDashoffset(value: js.Any): this.type = set("strokeDashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeLinecap(value: js.Any): this.type = set("strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeLinejoin(value: js.Any): this.type = set("strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeMiterlimit(value: js.Any): this.type = set("strokeMiterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeOpacity(value: js.Any): this.type = set("strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strokeWidth(value: js.Any): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def surfaceScale(value: js.Any): this.type = set("surfaceScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def systemLanguage(value: js.Any): this.type = set("systemLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: js.Any): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableValues(value: js.Any): this.type = set("tableValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def target(value: js.Any): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetX(value: js.Any): this.type = set("targetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetY(value: js.Any): this.type = set("targetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textAnchor(value: js.Any): this.type = set("textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textDecoration(value: js.Any): this.type = set("textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textLength(value: js.Any): this.type = set("textLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textRendering(value: js.Any): this.type = set("textRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: js.Any): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def to(value: js.Any): this.type = set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transform(value: js.Any): this.type = set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: js.Any): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def u1(value: js.Any): this.type = set("u1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def u2(value: js.Any): this.type = set("u2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underlinePosition(value: js.Any): this.type = set("underlinePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underlineThickness(value: js.Any): this.type = set("underlineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unicode(value: js.Any): this.type = set("unicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unicodeBidi(value: js.Any): this.type = set("unicodeBidi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unicodeRange(value: js.Any): this.type = set("unicodeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unitsPerEm(value: js.Any): this.type = set("unitsPerEm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vAlphabetic(value: js.Any): this.type = set("vAlphabetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vHanging(value: js.Any): this.type = set("vHanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vIdeographic(value: js.Any): this.type = set("vIdeographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vMathematical(value: js.Any): this.type = set("vMathematical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def values(value: js.Any): this.type = set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vectorEffect(value: js.Any): this.type = set("vectorEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def version(value: js.Any): this.type = set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vertAdvY(value: js.Any): this.type = set("vertAdvY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vertOriginX(value: js.Any): this.type = set("vertOriginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vertOriginY(value: js.Any): this.type = set("vertOriginY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def viewBox(value: js.Any): this.type = set("viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def viewTarget(value: js.Any): this.type = set("viewTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visibility(value: js.Any): this.type = set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: js.Any): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def widths(value: js.Any): this.type = set("widths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wordSpacing(value: js.Any): this.type = set("wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def writingMode(value: js.Any): this.type = set("writingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def x(value: js.Any): this.type = set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def x1(value: js.Any): this.type = set("x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def x2(value: js.Any): this.type = set("x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xChannelSelector(value: js.Any): this.type = set("xChannelSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xHeight(value: js.Any): this.type = set("xHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xlinkActuate(value: js.Any): this.type = set("xlinkActuate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xlinkArcrole(value: js.Any): this.type = set("xlinkArcrole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xlinkHref(value: js.Any): this.type = set("xlinkHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xlinkRole(value: js.Any): this.type = set("xlinkRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xlinkShow(value: js.Any): this.type = set("xlinkShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xlinkTitle(value: js.Any): this.type = set("xlinkTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xlinkType(value: js.Any): this.type = set("xlinkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xmlBase(value: js.Any): this.type = set("xmlBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xmlLang(value: js.Any): this.type = set("xmlLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xmlSpace(value: js.Any): this.type = set("xmlSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xmlns(value: js.Any): this.type = set("xmlns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xmlnsXlink(value: js.Any): this.type = set("xmlnsXlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def y(value: js.Any): this.type = set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def y1(value: js.Any): this.type = set("y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def y2(value: js.Any): this.type = set("y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yChannelSelector(value: js.Any): this.type = set("yChannelSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def z(value: js.Any): this.type = set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zoomAndPan(value: js.Any): this.type = set("zoomAndPan", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PickPropsWithChildrenIcon with (Omit[ValidString, theme]) with `0`[Theme]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
