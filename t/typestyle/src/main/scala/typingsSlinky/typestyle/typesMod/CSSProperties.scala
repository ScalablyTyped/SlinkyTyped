package typingsSlinky.typestyle.typesMod

import typingsSlinky.csstype.mod.AlignmentBaselineProperty
import typingsSlinky.csstype.mod.AnimationDirectionProperty
import typingsSlinky.csstype.mod.AnimationFillModeProperty
import typingsSlinky.csstype.mod.AnimationIterationCountProperty
import typingsSlinky.csstype.mod.AnimationNameProperty
import typingsSlinky.csstype.mod.AnimationPlayStateProperty
import typingsSlinky.csstype.mod.AnimationProperty
import typingsSlinky.csstype.mod.AnimationTimingFunctionProperty
import typingsSlinky.csstype.mod.BackgroundClipProperty
import typingsSlinky.csstype.mod.BackgroundOriginProperty
import typingsSlinky.csstype.mod.BackgroundSizeProperty
import typingsSlinky.csstype.mod.BaselineShiftProperty
import typingsSlinky.csstype.mod.BorderBottomLeftRadiusProperty
import typingsSlinky.csstype.mod.BorderBottomRightRadiusProperty
import typingsSlinky.csstype.mod.BorderImageProperty
import typingsSlinky.csstype.mod.BorderRadiusProperty
import typingsSlinky.csstype.mod.BorderTopLeftRadiusProperty
import typingsSlinky.csstype.mod.BorderTopRightRadiusProperty
import typingsSlinky.csstype.mod.BoxAlignProperty
import typingsSlinky.csstype.mod.BoxDecorationBreakProperty
import typingsSlinky.csstype.mod.BoxDirectionProperty
import typingsSlinky.csstype.mod.BoxLinesProperty
import typingsSlinky.csstype.mod.BoxOrientProperty
import typingsSlinky.csstype.mod.BoxPackProperty
import typingsSlinky.csstype.mod.BoxShadowProperty
import typingsSlinky.csstype.mod.ClipProperty
import typingsSlinky.csstype.mod.ClipRuleProperty
import typingsSlinky.csstype.mod.ColorInterpolationProperty
import typingsSlinky.csstype.mod.ColorRenderingProperty
import typingsSlinky.csstype.mod.DominantBaselineProperty
import typingsSlinky.csstype.mod.FillProperty
import typingsSlinky.csstype.mod.FillRuleProperty
import typingsSlinky.csstype.mod.FloodColorProperty
import typingsSlinky.csstype.mod.FontVariantAlternatesProperty
import typingsSlinky.csstype.mod.GlobalsNumber
import typingsSlinky.csstype.mod.GlobalsString
import typingsSlinky.csstype.mod.GlyphOrientationVerticalProperty
import typingsSlinky.csstype.mod.GridColumnGapProperty
import typingsSlinky.csstype.mod.GridGapProperty
import typingsSlinky.csstype.mod.GridRowGapProperty
import typingsSlinky.csstype.mod.ImeModeProperty
import typingsSlinky.csstype.mod.InsetBlockEndProperty
import typingsSlinky.csstype.mod.InsetBlockProperty
import typingsSlinky.csstype.mod.InsetBlockStartProperty
import typingsSlinky.csstype.mod.InsetInlineEndProperty
import typingsSlinky.csstype.mod.InsetInlineProperty
import typingsSlinky.csstype.mod.InsetInlineStartProperty
import typingsSlinky.csstype.mod.LightingColorProperty
import typingsSlinky.csstype.mod.LineBreakProperty
import typingsSlinky.csstype.mod.MarkerEndProperty
import typingsSlinky.csstype.mod.MarkerMidProperty
import typingsSlinky.csstype.mod.MarkerProperty
import typingsSlinky.csstype.mod.MarkerStartProperty
import typingsSlinky.csstype.mod.MozBindingProperty
import typingsSlinky.csstype.mod.MozOutlineRadiusProperty
import typingsSlinky.csstype.mod.MozTextBlinkProperty
import typingsSlinky.csstype.mod.MozUserInputProperty
import typingsSlinky.csstype.mod.MozWindowShadowProperty
import typingsSlinky.csstype.mod.OutlineColorProperty
import typingsSlinky.csstype.mod.OutlineProperty
import typingsSlinky.csstype.mod.OutlineStyleProperty
import typingsSlinky.csstype.mod.OutlineWidthProperty
import typingsSlinky.csstype.mod.ScrollSnapCoordinateProperty
import typingsSlinky.csstype.mod.ScrollSnapDestinationProperty
import typingsSlinky.csstype.mod.ScrollSnapPointsXProperty
import typingsSlinky.csstype.mod.ScrollSnapPointsYProperty
import typingsSlinky.csstype.mod.ScrollSnapTypeXProperty
import typingsSlinky.csstype.mod.ScrollSnapTypeYProperty
import typingsSlinky.csstype.mod.ShapeRenderingProperty
import typingsSlinky.csstype.mod.StandardLonghandPropertiesFallback
import typingsSlinky.csstype.mod.StandardShorthandPropertiesFallback
import typingsSlinky.csstype.mod.StopColorProperty
import typingsSlinky.csstype.mod.StrokeDasharrayProperty
import typingsSlinky.csstype.mod.StrokeDashoffsetProperty
import typingsSlinky.csstype.mod.StrokeLinecapProperty
import typingsSlinky.csstype.mod.StrokeLinejoinProperty
import typingsSlinky.csstype.mod.StrokeProperty
import typingsSlinky.csstype.mod.StrokeWidthProperty
import typingsSlinky.csstype.mod.TextAlignLastProperty
import typingsSlinky.csstype.mod.TextAnchorProperty
import typingsSlinky.csstype.mod.TextCombineUprightProperty
import typingsSlinky.csstype.mod.TextDecorationColorProperty
import typingsSlinky.csstype.mod.TextDecorationLineProperty
import typingsSlinky.csstype.mod.TextDecorationStyleProperty
import typingsSlinky.csstype.mod.TransformProperty
import typingsSlinky.csstype.mod.TransitionProperty
import typingsSlinky.csstype.mod.TransitionPropertyProperty
import typingsSlinky.csstype.mod.TransitionTimingFunctionProperty
import typingsSlinky.csstype.mod.UserSelectProperty
import typingsSlinky.csstype.mod.VectorEffectProperty
import typingsSlinky.csstype.mod.VendorLonghandPropertiesHyphenFallback
import typingsSlinky.csstype.mod.VendorShorthandPropertiesHyphenFallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.csstype.mod.ObsoletePropertiesFallback because var conflicts: clip. Inlined KhtmlBoxAlign, KhtmlBoxDirection, KhtmlBoxFlex, KhtmlBoxFlexGroup, KhtmlBoxLines, KhtmlBoxOrdinalGroup, KhtmlBoxOrient, KhtmlBoxPack, KhtmlLineBreak, KhtmlOpacity, KhtmlUserSelect, MozBackgroundClip, MozBackgroundInlinePolicy, MozBackgroundOrigin, MozBackgroundSize, MozBinding, MozBorderRadius, MozBorderRadiusBottomleft, MozBorderRadiusBottomright, MozBorderRadiusTopleft, MozBorderRadiusTopright, MozBoxAlign, MozBoxDirection, MozBoxFlex, MozBoxOrdinalGroup, MozBoxOrient, MozBoxPack, MozBoxShadow, MozOpacity, MozOutline, MozOutlineColor, MozOutlineRadius, MozOutlineStyle, MozOutlineWidth, MozTextAlignLast, MozTextBlink, MozTextDecorationColor, MozTextDecorationLine, MozTextDecorationStyle, MozUserInput, MozWindowShadow, OAnimation, OAnimationDelay, OAnimationDirection, OAnimationDuration, OAnimationFillMode, OAnimationIterationCount, OAnimationName, OAnimationPlayState, OAnimationTimingFunction, OBackgroundSize, OBorderImage, OTransform, OTransition, OTransitionDelay, OTransitionDuration, OTransitionProperty, OTransitionTimingFunction, WebkitBoxAlign, WebkitBoxDirection, WebkitBoxFlex, WebkitBoxFlexGroup, WebkitBoxLines, WebkitBoxOrdinalGroup, WebkitBoxOrient, WebkitBoxPack, WebkitScrollSnapPointsX, WebkitScrollSnapPointsY, boxAlign, boxDirection, boxFlex, boxFlexGroup, boxLines, boxOrdinalGroup, boxOrient, boxPack, fontVariantAlternates, gridColumnGap, gridGap, gridRowGap, imeMode, msImeMode, offsetBlock, offsetBlockEnd, offsetBlockStart, offsetInline, offsetInlineEnd, offsetInlineStart, scrollSnapCoordinate, scrollSnapDestination, scrollSnapPointsX, scrollSnapPointsY, scrollSnapTypeX, scrollSnapTypeY, textCombineHorizontal
- typingsSlinky.csstype.mod.SvgPropertiesFallback because var conflicts: clipPath, color, cursor, direction, display, filter, font, fontFamily, fontSize, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, imageRendering, letterSpacing, lineHeight, mask, opacity, overflow, paintOrder, pointerEvents, textDecoration, textRendering, unicodeBidi, visibility, whiteSpace, wordSpacing, writingMode. Inlined alignmentBaseline, baselineShift, clip, clipRule, colorInterpolation, colorRendering, dominantBaseline, fill, fillOpacity, fillRule, floodColor, floodOpacity, glyphOrientationVertical, lightingColor, marker, markerEnd, markerMid, markerStart, shapeRendering, stopColor, stopOpacity, stroke, strokeDasharray, strokeDashoffset, strokeLinecap, strokeLinejoin, strokeMiterlimit, strokeOpacity, strokeWidth, textAnchor, vectorEffect */ @js.native
trait CSSProperties
  extends StandardLonghandPropertiesFallback[TLength]
     with StandardShorthandPropertiesFallback[TLength]
     with VendorLonghandPropertiesHyphenFallback[TLength]
     with VendorShorthandPropertiesHyphenFallback[TLength] {
  /**
    * Typestyle configuration options
    **/
  /**
    * The generated CSS selector gets its own unique location in the generated CSS (disables deduping).
    * So instead of `.classA,.classB{same properties}`
    * you get `.classA {same properties} .classB {same properties}`
    * This is needed for certain browser edge cases like placeholder styling
    **/
  @JSName("$unique")
  var $unique: js.UndefOr[Boolean] = js.native
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var KhtmlBoxAlign: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.native
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var KhtmlBoxDirection: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.native
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var KhtmlBoxFlex: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var KhtmlBoxFlexGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var KhtmlBoxLines: js.UndefOr[BoxLinesProperty | js.Array[BoxLinesProperty]] = js.native
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var KhtmlBoxOrdinalGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var KhtmlBoxOrient: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.native
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var KhtmlBoxPack: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.native
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var KhtmlLineBreak: js.UndefOr[LineBreakProperty | js.Array[LineBreakProperty]] = js.native
  /**
    * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
    *
    * **Initial value**: `1.0`
    *
    * @deprecated
    */
  var KhtmlOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var KhtmlUserSelect: js.UndefOr[UserSelectProperty | js.Array[UserSelectProperty]] = js.native
  /**
    * The **`background-clip`** CSS property sets whether an element's background `<color>` or `<image>` extends underneath its border.
    *
    * **Initial value**: `border-box`
    *
    * @deprecated
    */
  var MozBackgroundClip: js.UndefOr[BackgroundClipProperty | js.Array[BackgroundClipProperty]] = js.native
  /**
    * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
    *
    * **Initial value**: `slice`
    *
    * @deprecated
    */
  var MozBackgroundInlinePolicy: js.UndefOr[BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]] = js.native
  /**
    * The **`background-origin`** CSS property sets the _background positioning area_. In other words, it sets the origin position of an image set with the `background-image` property.
    *
    * **Initial value**: `padding-box`
    *
    * @deprecated
    */
  var MozBackgroundOrigin: js.UndefOr[BackgroundOriginProperty | js.Array[BackgroundOriginProperty]] = js.native
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Initial value**: `auto auto`
    *
    * @deprecated
    */
  var MozBackgroundSize: js.UndefOr[BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]] = js.native
  /**
    * The **`-moz-binding`** CSS property is used by Mozilla-based applications to attach an XBL binding to a DOM element.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozBinding: js.UndefOr[MozBindingProperty | js.Array[MozBindingProperty]] = js.native
  /**
    * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
    *
    * @deprecated
    */
  var MozBorderRadius: js.UndefOr[BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]]] = js.native
  /**
    * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusBottomleft: js.UndefOr[
    BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]]
  ] = js.native
  /**
    * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusBottomright: js.UndefOr[
    BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]]
  ] = js.native
  /**
    * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusTopleft: js.UndefOr[
    BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]]
  ] = js.native
  /**
    * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusTopright: js.UndefOr[
    BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]]
  ] = js.native
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var MozBoxAlign: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.native
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var MozBoxDirection: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.native
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBoxFlex: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var MozBoxOrdinalGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var MozBoxOrient: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.native
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var MozBoxPack: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.native
  /**
    * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozBoxShadow: js.UndefOr[BoxShadowProperty | js.Array[BoxShadowProperty]] = js.native
  /**
    * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
    *
    * **Initial value**: `1.0`
    *
    * @deprecated
    */
  var MozOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`outline`** CSS property is a shorthand to set various outline properties in a single declaration: `outline-style`, `outline-width`, and `outline-color`.
    *
    * @deprecated
    */
  var MozOutline: js.UndefOr[OutlineProperty[TLength] | js.Array[OutlineProperty[TLength]]] = js.native
  /**
    * The **`outline-color`** CSS property sets the color of an element's outline.
    *
    * **Initial value**: `invert`, for browsers supporting it, `currentColor` for the other
    *
    * @deprecated
    */
  var MozOutlineColor: js.UndefOr[OutlineColorProperty | js.Array[OutlineColorProperty]] = js.native
  /**
    * In Mozilla applications like Firefox, the **`-moz-outline-radius`** CSS property can be used to give an element's `outline` rounded corners.
    *
    * @deprecated
    */
  var MozOutlineRadius: js.UndefOr[MozOutlineRadiusProperty[TLength] | js.Array[MozOutlineRadiusProperty[TLength]]] = js.native
  /**
    * The **`outline-style`** CSS property sets the style of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozOutlineStyle: js.UndefOr[OutlineStyleProperty | js.Array[OutlineStyleProperty]] = js.native
  /**
    * The **`outline-width`** CSS property sets the thickness of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Initial value**: `medium`
    *
    * @deprecated
    */
  var MozOutlineWidth: js.UndefOr[OutlineWidthProperty[TLength] | js.Array[OutlineWidthProperty[TLength]]] = js.native
  /**
    * The **`text-align-last`** CSS property sets how the last line of a block or a line, right before a forced line break, is aligned.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var MozTextAlignLast: js.UndefOr[TextAlignLastProperty | js.Array[TextAlignLastProperty]] = js.native
  /**
    * The **`-moz-text-blink`** non-standard Mozilla CSS extension specifies the blink mode.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozTextBlink: js.UndefOr[MozTextBlinkProperty | js.Array[MozTextBlinkProperty]] = js.native
  /**
    * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
    *
    * **Initial value**: `currentcolor`
    *
    * @deprecated
    */
  var MozTextDecorationColor: js.UndefOr[TextDecorationColorProperty | js.Array[TextDecorationColorProperty]] = js.native
  /**
    * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozTextDecorationLine: js.UndefOr[TextDecorationLineProperty | js.Array[TextDecorationLineProperty]] = js.native
  /**
    * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
    *
    * **Initial value**: `solid`
    *
    * @deprecated
    */
  var MozTextDecorationStyle: js.UndefOr[TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]] = js.native
  /**
    * In Mozilla applications, **`-moz-user-input`** determines if an element will accept user input.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var MozUserInput: js.UndefOr[MozUserInputProperty | js.Array[MozUserInputProperty]] = js.native
  /**
    * The **`-moz-window-shadow`** CSS property specifies whether a window will have a shadow. It only works on Mac OS X.
    *
    * **Initial value**: `default`
    *
    * @deprecated
    */
  var MozWindowShadow: js.UndefOr[MozWindowShadowProperty | js.Array[MozWindowShadowProperty]] = js.native
  /**
    * The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * @deprecated
    */
  var OAnimation: js.UndefOr[AnimationProperty | js.Array[AnimationProperty]] = js.native
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OAnimationDelay: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var OAnimationDirection: js.UndefOr[AnimationDirectionProperty | js.Array[AnimationDirectionProperty]] = js.native
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OAnimationDuration: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var OAnimationFillMode: js.UndefOr[AnimationFillModeProperty | js.Array[AnimationFillModeProperty]] = js.native
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var OAnimationIterationCount: js.UndefOr[AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]] = js.native
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var OAnimationName: js.UndefOr[AnimationNameProperty | js.Array[AnimationNameProperty]] = js.native
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Initial value**: `running`
    *
    * @deprecated
    */
  var OAnimationPlayState: js.UndefOr[AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]] = js.native
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Initial value**: `ease`
    *
    * @deprecated
    */
  var OAnimationTimingFunction: js.UndefOr[AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]] = js.native
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Initial value**: `auto auto`
    *
    * @deprecated
    */
  var OBackgroundSize: js.UndefOr[BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]] = js.native
  /**
    * The **`border-image`** CSS property draws an image in place of an element's `border-style`.
    *
    * @deprecated
    */
  var OBorderImage: js.UndefOr[BorderImageProperty | js.Array[BorderImageProperty]] = js.native
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var OTransform: js.UndefOr[TransformProperty | js.Array[TransformProperty]] = js.native
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * @deprecated
    */
  var OTransition: js.UndefOr[TransitionProperty | js.Array[TransitionProperty]] = js.native
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OTransitionDelay: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OTransitionDuration: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Initial value**: all
    *
    * @deprecated
    */
  var OTransitionProperty: js.UndefOr[TransitionPropertyProperty | js.Array[TransitionPropertyProperty]] = js.native
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Initial value**: `ease`
    *
    * @deprecated
    */
  var OTransitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]] = js.native
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var WebkitBoxAlign: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.native
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var WebkitBoxDirection: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.native
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var WebkitBoxFlex: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var WebkitBoxFlexGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var WebkitBoxLines: js.UndefOr[BoxLinesProperty | js.Array[BoxLinesProperty]] = js.native
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var WebkitBoxOrdinalGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var WebkitBoxOrient: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.native
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var WebkitBoxPack: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.native
  /**
    * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var WebkitScrollSnapPointsX: js.UndefOr[ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty]] = js.native
  /**
    * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var WebkitScrollSnapPointsY: js.UndefOr[ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty]] = js.native
  var alignmentBaseline: js.UndefOr[AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty]] = js.native
  var baselineShift: js.UndefOr[BaselineShiftProperty[TLength] | js.Array[BaselineShiftProperty[TLength]]] = js.native
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var boxAlign: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.native
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var boxDirection: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.native
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var boxFlex: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var boxFlexGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var boxLines: js.UndefOr[BoxLinesProperty | js.Array[BoxLinesProperty]] = js.native
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var boxOrdinalGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var boxOrient: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.native
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var boxPack: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.native
  var clip: js.UndefOr[ClipProperty | js.Array[ClipProperty]] = js.native
  var clipRule: js.UndefOr[ClipRuleProperty | js.Array[ClipRuleProperty]] = js.native
  var colorInterpolation: js.UndefOr[ColorInterpolationProperty | js.Array[ColorInterpolationProperty]] = js.native
  var colorRendering: js.UndefOr[ColorRenderingProperty | js.Array[ColorRenderingProperty]] = js.native
  var dominantBaseline: js.UndefOr[DominantBaselineProperty | js.Array[DominantBaselineProperty]] = js.native
  var fill: js.UndefOr[FillProperty | js.Array[FillProperty]] = js.native
  var fillOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  var fillRule: js.UndefOr[FillRuleProperty | js.Array[FillRuleProperty]] = js.native
  var floodColor: js.UndefOr[FloodColorProperty | js.Array[FloodColorProperty]] = js.native
  var floodOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  /**
    * The **`font-variant-alternates`** CSS property controls the usage of alternate glyphs. These alternate glyphs may be referenced by alternative names defined in `@font-feature-values`.
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var fontVariantAlternates: js.UndefOr[FontVariantAlternatesProperty | js.Array[FontVariantAlternatesProperty]] = js.native
  var glyphOrientationVertical: js.UndefOr[GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty]] = js.native
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var gridColumnGap: js.UndefOr[GridColumnGapProperty[TLength] | js.Array[GridColumnGapProperty[TLength]]] = js.native
  /**
    * The **`gap`** CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for `row-gap` and `column-gap`.
    *
    * @deprecated
    */
  var gridGap: js.UndefOr[GridGapProperty[TLength] | js.Array[GridGapProperty[TLength]]] = js.native
  /**
    * The **`row-gap`** CSS property sets the size of the gap (gutter) between an element's grid rows.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var gridRowGap: js.UndefOr[GridRowGapProperty[TLength] | js.Array[GridRowGapProperty[TLength]]] = js.native
  /**
    * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var imeMode: js.UndefOr[ImeModeProperty | js.Array[ImeModeProperty]] = js.native
  var lightingColor: js.UndefOr[LightingColorProperty | js.Array[LightingColorProperty]] = js.native
  var marker: js.UndefOr[MarkerProperty | js.Array[MarkerProperty]] = js.native
  var markerEnd: js.UndefOr[MarkerEndProperty | js.Array[MarkerEndProperty]] = js.native
  var markerMid: js.UndefOr[MarkerMidProperty | js.Array[MarkerMidProperty]] = js.native
  var markerStart: js.UndefOr[MarkerStartProperty | js.Array[MarkerStartProperty]] = js.native
  /**
    * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var msImeMode: js.UndefOr[ImeModeProperty | js.Array[ImeModeProperty]] = js.native
  /**
    * The **`inset-block`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetBlock: js.UndefOr[InsetBlockProperty[TLength] | js.Array[InsetBlockProperty[TLength]]] = js.native
  /**
    * The **`inset-block-end`** CSS property defines the logical block end offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetBlockEnd: js.UndefOr[InsetBlockEndProperty[TLength] | js.Array[InsetBlockEndProperty[TLength]]] = js.native
  /**
    * The **`inset-block-start`** CSS property defines the logical block start offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetBlockStart: js.UndefOr[InsetBlockStartProperty[TLength] | js.Array[InsetBlockStartProperty[TLength]]] = js.native
  /**
    * The **`inset-inline`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetInline: js.UndefOr[InsetInlineProperty[TLength] | js.Array[InsetInlineProperty[TLength]]] = js.native
  /**
    * The **`inset-inline-end`** CSS property defines the logical inline end inset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetInlineEnd: js.UndefOr[InsetInlineEndProperty[TLength] | js.Array[InsetInlineEndProperty[TLength]]] = js.native
  /**
    * The **`inset-inline-start`** CSS property defines the logical inline start inset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetInlineStart: js.UndefOr[InsetInlineStartProperty[TLength] | js.Array[InsetInlineStartProperty[TLength]]] = js.native
  /**
    * The **`scroll-snap-coordinate`** CSS property defines the x and y coordinate positions within an element that will align with its nearest ancestor scroll container's `scroll-snap-destination` for each respective axis.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapCoordinate: js.UndefOr[
    ScrollSnapCoordinateProperty[TLength] | js.Array[ScrollSnapCoordinateProperty[TLength]]
  ] = js.native
  /**
    * The **`scroll-snap-destination`** CSS property defines the position in x and y coordinates within the scroll container's visual viewport which element snap points align with.
    *
    * **Initial value**: `0px 0px`
    *
    * @deprecated
    */
  var scrollSnapDestination: js.UndefOr[
    ScrollSnapDestinationProperty[TLength] | js.Array[ScrollSnapDestinationProperty[TLength]]
  ] = js.native
  /**
    * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapPointsX: js.UndefOr[ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty]] = js.native
  /**
    * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapPointsY: js.UndefOr[ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty]] = js.native
  /**
    * The **`scroll-snap-type-x`** CSS property defines how strictly snap points are enforced on the horizontal axis of the scroll container in case there is one.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapTypeX: js.UndefOr[ScrollSnapTypeXProperty | js.Array[ScrollSnapTypeXProperty]] = js.native
  /**
    * The **`scroll-snap-type-y`** CSS property defines how strictly snap points are enforced on the vertical axis of the scroll container in case there is one.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapTypeY: js.UndefOr[ScrollSnapTypeYProperty | js.Array[ScrollSnapTypeYProperty]] = js.native
  var shapeRendering: js.UndefOr[ShapeRenderingProperty | js.Array[ShapeRenderingProperty]] = js.native
  var stopColor: js.UndefOr[StopColorProperty | js.Array[StopColorProperty]] = js.native
  var stopOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  var stroke: js.UndefOr[StrokeProperty | js.Array[StrokeProperty]] = js.native
  var strokeDasharray: js.UndefOr[StrokeDasharrayProperty[TLength] | js.Array[StrokeDasharrayProperty[TLength]]] = js.native
  var strokeDashoffset: js.UndefOr[StrokeDashoffsetProperty[TLength] | js.Array[StrokeDashoffsetProperty[TLength]]] = js.native
  var strokeLinecap: js.UndefOr[StrokeLinecapProperty | js.Array[StrokeLinecapProperty]] = js.native
  var strokeLinejoin: js.UndefOr[StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty]] = js.native
  var strokeMiterlimit: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  var strokeOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  var strokeWidth: js.UndefOr[StrokeWidthProperty[TLength] | js.Array[StrokeWidthProperty[TLength]]] = js.native
  var textAnchor: js.UndefOr[TextAnchorProperty | js.Array[TextAnchorProperty]] = js.native
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var textCombineHorizontal: js.UndefOr[TextCombineUprightProperty | js.Array[TextCombineUprightProperty]] = js.native
  var vectorEffect: js.UndefOr[VectorEffectProperty | js.Array[VectorEffectProperty]] = js.native
}

object CSSProperties {
  @scala.inline
  def apply(): CSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSProperties]
  }
  @scala.inline
  implicit class CSSPropertiesOps[Self <: CSSProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$unique(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$unique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$unique: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$unique")(js.undefined)
        ret
    }
    @scala.inline
    def withKhtmlBoxAlign(value: BoxAlignProperty | js.Array[BoxAlignProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KhtmlBoxAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKhtmlBoxAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KhtmlBoxAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withKhtmlBoxDirection(value: BoxDirectionProperty | js.Array[BoxDirectionProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KhtmlBoxDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKhtmlBoxDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KhtmlBoxDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withKhtmlBoxFlex(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KhtmlBoxFlex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKhtmlBoxFlex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KhtmlBoxFlex")(js.undefined)
        ret
    }
    @scala.inline
    def withKhtmlBoxFlexGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KhtmlBoxFlexGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKhtmlBoxFlexGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KhtmlBoxFlexGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withKhtmlBoxLines(value: BoxLinesProperty | js.Array[BoxLinesProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KhtmlBoxLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKhtmlBoxLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KhtmlBoxLines")(js.undefined)
        ret
    }
    @scala.inline
    def withKhtmlBoxOrdinalGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KhtmlBoxOrdinalGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKhtmlBoxOrdinalGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KhtmlBoxOrdinalGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withKhtmlBoxOrient(value: BoxOrientProperty | js.Array[BoxOrientProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KhtmlBoxOrient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKhtmlBoxOrient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KhtmlBoxOrient")(js.undefined)
        ret
    }
    @scala.inline
    def withKhtmlBoxPack(value: BoxPackProperty | js.Array[BoxPackProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KhtmlBoxPack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKhtmlBoxPack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KhtmlBoxPack")(js.undefined)
        ret
    }
    @scala.inline
    def withKhtmlLineBreak(value: LineBreakProperty | js.Array[LineBreakProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KhtmlLineBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKhtmlLineBreak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KhtmlLineBreak")(js.undefined)
        ret
    }
    @scala.inline
    def withKhtmlOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KhtmlOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKhtmlOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KhtmlOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withKhtmlUserSelect(value: UserSelectProperty | js.Array[UserSelectProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KhtmlUserSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKhtmlUserSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KhtmlUserSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withMozBackgroundClip(value: BackgroundClipProperty | js.Array[BackgroundClipProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBackgroundClip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozBackgroundClip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBackgroundClip")(js.undefined)
        ret
    }
    @scala.inline
    def withMozBackgroundInlinePolicy(value: BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBackgroundInlinePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozBackgroundInlinePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBackgroundInlinePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withMozBackgroundOrigin(value: BackgroundOriginProperty | js.Array[BackgroundOriginProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBackgroundOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozBackgroundOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBackgroundOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withMozBackgroundSize(value: BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBackgroundSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozBackgroundSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBackgroundSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMozBinding(value: MozBindingProperty | js.Array[MozBindingProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBinding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBinding")(js.undefined)
        ret
    }
    @scala.inline
    def withMozBorderRadius(value: BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBorderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBorderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withMozBorderRadiusBottomleft(value: BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBorderRadiusBottomleft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozBorderRadiusBottomleft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBorderRadiusBottomleft")(js.undefined)
        ret
    }
    @scala.inline
    def withMozBorderRadiusBottomright(
      value: BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBorderRadiusBottomright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozBorderRadiusBottomright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBorderRadiusBottomright")(js.undefined)
        ret
    }
    @scala.inline
    def withMozBorderRadiusTopleft(value: BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBorderRadiusTopleft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozBorderRadiusTopleft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBorderRadiusTopleft")(js.undefined)
        ret
    }
    @scala.inline
    def withMozBorderRadiusTopright(value: BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBorderRadiusTopright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozBorderRadiusTopright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBorderRadiusTopright")(js.undefined)
        ret
    }
    @scala.inline
    def withMozBoxAlign(value: BoxAlignProperty | js.Array[BoxAlignProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBoxAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozBoxAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBoxAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withMozBoxDirection(value: BoxDirectionProperty | js.Array[BoxDirectionProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBoxDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozBoxDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBoxDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withMozBoxFlex(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBoxFlex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozBoxFlex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBoxFlex")(js.undefined)
        ret
    }
    @scala.inline
    def withMozBoxOrdinalGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBoxOrdinalGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozBoxOrdinalGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBoxOrdinalGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withMozBoxOrient(value: BoxOrientProperty | js.Array[BoxOrientProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBoxOrient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozBoxOrient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBoxOrient")(js.undefined)
        ret
    }
    @scala.inline
    def withMozBoxPack(value: BoxPackProperty | js.Array[BoxPackProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBoxPack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozBoxPack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBoxPack")(js.undefined)
        ret
    }
    @scala.inline
    def withMozBoxShadow(value: BoxShadowProperty | js.Array[BoxShadowProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBoxShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozBoxShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozBoxShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withMozOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withMozOutline(value: OutlineProperty[TLength] | js.Array[OutlineProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withMozOutlineColor(value: OutlineColorProperty | js.Array[OutlineColorProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozOutlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozOutlineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozOutlineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMozOutlineRadius(value: MozOutlineRadiusProperty[TLength] | js.Array[MozOutlineRadiusProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozOutlineRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozOutlineRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozOutlineRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withMozOutlineStyle(value: OutlineStyleProperty | js.Array[OutlineStyleProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozOutlineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozOutlineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozOutlineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMozOutlineWidth(value: OutlineWidthProperty[TLength] | js.Array[OutlineWidthProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozOutlineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozOutlineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozOutlineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMozTextAlignLast(value: TextAlignLastProperty | js.Array[TextAlignLastProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozTextAlignLast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozTextAlignLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozTextAlignLast")(js.undefined)
        ret
    }
    @scala.inline
    def withMozTextBlink(value: MozTextBlinkProperty | js.Array[MozTextBlinkProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozTextBlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozTextBlink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozTextBlink")(js.undefined)
        ret
    }
    @scala.inline
    def withMozTextDecorationColor(value: TextDecorationColorProperty | js.Array[TextDecorationColorProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozTextDecorationColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozTextDecorationColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozTextDecorationColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMozTextDecorationLine(value: TextDecorationLineProperty | js.Array[TextDecorationLineProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozTextDecorationLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozTextDecorationLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozTextDecorationLine")(js.undefined)
        ret
    }
    @scala.inline
    def withMozTextDecorationStyle(value: TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozTextDecorationStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozTextDecorationStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozTextDecorationStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMozUserInput(value: MozUserInputProperty | js.Array[MozUserInputProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozUserInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozUserInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozUserInput")(js.undefined)
        ret
    }
    @scala.inline
    def withMozWindowShadow(value: MozWindowShadowProperty | js.Array[MozWindowShadowProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozWindowShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozWindowShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozWindowShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withOAnimation(value: AnimationProperty | js.Array[AnimationProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withOAnimationDelay(value: GlobalsString | js.Array[GlobalsString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OAnimationDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOAnimationDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OAnimationDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withOAnimationDirection(value: AnimationDirectionProperty | js.Array[AnimationDirectionProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OAnimationDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOAnimationDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OAnimationDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withOAnimationDuration(value: GlobalsString | js.Array[GlobalsString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OAnimationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OAnimationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withOAnimationFillMode(value: AnimationFillModeProperty | js.Array[AnimationFillModeProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OAnimationFillMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOAnimationFillMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OAnimationFillMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOAnimationIterationCount(value: AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OAnimationIterationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOAnimationIterationCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OAnimationIterationCount")(js.undefined)
        ret
    }
    @scala.inline
    def withOAnimationName(value: AnimationNameProperty | js.Array[AnimationNameProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OAnimationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOAnimationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OAnimationName")(js.undefined)
        ret
    }
    @scala.inline
    def withOAnimationPlayState(value: AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OAnimationPlayState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOAnimationPlayState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OAnimationPlayState")(js.undefined)
        ret
    }
    @scala.inline
    def withOAnimationTimingFunction(value: AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OAnimationTimingFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOAnimationTimingFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OAnimationTimingFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withOBackgroundSize(value: BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBackgroundSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOBackgroundSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBackgroundSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOBorderImage(value: BorderImageProperty | js.Array[BorderImageProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBorderImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOBorderImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OBorderImage")(js.undefined)
        ret
    }
    @scala.inline
    def withOTransform(value: TransformProperty | js.Array[TransformProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withOTransition(value: TransitionProperty | js.Array[TransitionProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withOTransitionDelay(value: GlobalsString | js.Array[GlobalsString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OTransitionDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOTransitionDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OTransitionDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withOTransitionDuration(value: GlobalsString | js.Array[GlobalsString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OTransitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OTransitionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withOTransitionProperty(value: TransitionPropertyProperty | js.Array[TransitionPropertyProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OTransitionProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOTransitionProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OTransitionProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withOTransitionTimingFunction(value: TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OTransitionTimingFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOTransitionTimingFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OTransitionTimingFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withWebkitBoxAlign(value: BoxAlignProperty | js.Array[BoxAlignProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitBoxAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebkitBoxAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitBoxAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withWebkitBoxDirection(value: BoxDirectionProperty | js.Array[BoxDirectionProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitBoxDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebkitBoxDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitBoxDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withWebkitBoxFlex(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitBoxFlex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebkitBoxFlex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitBoxFlex")(js.undefined)
        ret
    }
    @scala.inline
    def withWebkitBoxFlexGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitBoxFlexGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebkitBoxFlexGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitBoxFlexGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withWebkitBoxLines(value: BoxLinesProperty | js.Array[BoxLinesProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitBoxLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebkitBoxLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitBoxLines")(js.undefined)
        ret
    }
    @scala.inline
    def withWebkitBoxOrdinalGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitBoxOrdinalGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebkitBoxOrdinalGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitBoxOrdinalGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withWebkitBoxOrient(value: BoxOrientProperty | js.Array[BoxOrientProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitBoxOrient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebkitBoxOrient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitBoxOrient")(js.undefined)
        ret
    }
    @scala.inline
    def withWebkitBoxPack(value: BoxPackProperty | js.Array[BoxPackProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitBoxPack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebkitBoxPack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitBoxPack")(js.undefined)
        ret
    }
    @scala.inline
    def withWebkitScrollSnapPointsX(value: ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitScrollSnapPointsX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebkitScrollSnapPointsX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitScrollSnapPointsX")(js.undefined)
        ret
    }
    @scala.inline
    def withWebkitScrollSnapPointsY(value: ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitScrollSnapPointsY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebkitScrollSnapPointsY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitScrollSnapPointsY")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignmentBaseline(value: AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignmentBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignmentBaseline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignmentBaseline")(js.undefined)
        ret
    }
    @scala.inline
    def withBaselineShift(value: BaselineShiftProperty[TLength] | js.Array[BaselineShiftProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineShift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineShift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineShift")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxAlign(value: BoxAlignProperty | js.Array[BoxAlignProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxDirection(value: BoxDirectionProperty | js.Array[BoxDirectionProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxFlex(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxFlex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxFlex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxFlex")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxFlexGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxFlexGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxFlexGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxFlexGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxLines(value: BoxLinesProperty | js.Array[BoxLinesProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxLines")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxOrdinalGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxOrdinalGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxOrdinalGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxOrdinalGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxOrient(value: BoxOrientProperty | js.Array[BoxOrientProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxOrient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxOrient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxOrient")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxPack(value: BoxPackProperty | js.Array[BoxPackProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxPack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxPack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxPack")(js.undefined)
        ret
    }
    @scala.inline
    def withClip(value: ClipProperty | js.Array[ClipProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(js.undefined)
        ret
    }
    @scala.inline
    def withClipRule(value: ClipRuleProperty | js.Array[ClipRuleProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipRule")(js.undefined)
        ret
    }
    @scala.inline
    def withColorInterpolation(value: ColorInterpolationProperty | js.Array[ColorInterpolationProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorInterpolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorInterpolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorInterpolation")(js.undefined)
        ret
    }
    @scala.inline
    def withColorRendering(value: ColorRenderingProperty | js.Array[ColorRenderingProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withDominantBaseline(value: DominantBaselineProperty | js.Array[DominantBaselineProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dominantBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDominantBaseline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dominantBaseline")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: FillProperty | js.Array[FillProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFillOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withFillRule(value: FillRuleProperty | js.Array[FillRuleProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillRule")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodColor(value: FloodColorProperty | js.Array[FloodColorProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withFontVariantAlternates(value: FontVariantAlternatesProperty | js.Array[FontVariantAlternatesProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontVariantAlternates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontVariantAlternates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontVariantAlternates")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyphOrientationVertical(value: GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphOrientationVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphOrientationVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphOrientationVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withGridColumnGap(value: GridColumnGapProperty[TLength] | js.Array[GridColumnGapProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumnGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridColumnGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumnGap")(js.undefined)
        ret
    }
    @scala.inline
    def withGridGap(value: GridGapProperty[TLength] | js.Array[GridGapProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridGap")(js.undefined)
        ret
    }
    @scala.inline
    def withGridRowGap(value: GridRowGapProperty[TLength] | js.Array[GridRowGapProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRowGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridRowGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRowGap")(js.undefined)
        ret
    }
    @scala.inline
    def withImeMode(value: ImeModeProperty | js.Array[ImeModeProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withLightingColor(value: LightingColorProperty | js.Array[LightingColorProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightingColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightingColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightingColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: MarkerProperty | js.Array[MarkerProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerEnd(value: MarkerEndProperty | js.Array[MarkerEndProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerMid(value: MarkerMidProperty | js.Array[MarkerMidProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerMid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerMid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerMid")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerStart(value: MarkerStartProperty | js.Array[MarkerStartProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerStart")(js.undefined)
        ret
    }
    @scala.inline
    def withMsImeMode(value: ImeModeProperty | js.Array[ImeModeProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msImeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsImeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msImeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetBlock(value: InsetBlockProperty[TLength] | js.Array[InsetBlockProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetBlockEnd(value: InsetBlockEndProperty[TLength] | js.Array[InsetBlockEndProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetBlockEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetBlockEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetBlockEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetBlockStart(value: InsetBlockStartProperty[TLength] | js.Array[InsetBlockStartProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetBlockStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetBlockStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetBlockStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetInline(value: InsetInlineProperty[TLength] | js.Array[InsetInlineProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetInline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetInline")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetInlineEnd(value: InsetInlineEndProperty[TLength] | js.Array[InsetInlineEndProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetInlineEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetInlineEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetInlineEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetInlineStart(value: InsetInlineStartProperty[TLength] | js.Array[InsetInlineStartProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetInlineStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetInlineStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetInlineStart")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSnapCoordinate(value: ScrollSnapCoordinateProperty[TLength] | js.Array[ScrollSnapCoordinateProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSnapCoordinate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSnapCoordinate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSnapCoordinate")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSnapDestination(value: ScrollSnapDestinationProperty[TLength] | js.Array[ScrollSnapDestinationProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSnapDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSnapDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSnapDestination")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSnapPointsX(value: ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSnapPointsX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSnapPointsX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSnapPointsX")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSnapPointsY(value: ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSnapPointsY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSnapPointsY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSnapPointsY")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSnapTypeX(value: ScrollSnapTypeXProperty | js.Array[ScrollSnapTypeXProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSnapTypeX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSnapTypeX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSnapTypeX")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSnapTypeY(value: ScrollSnapTypeYProperty | js.Array[ScrollSnapTypeYProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSnapTypeY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSnapTypeY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSnapTypeY")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeRendering(value: ShapeRenderingProperty | js.Array[ShapeRenderingProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withStopColor(value: StopColorProperty | js.Array[StopColorProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStopOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: StrokeProperty | js.Array[StrokeProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeDasharray(value: StrokeDasharrayProperty[TLength] | js.Array[StrokeDasharrayProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDasharray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeDasharray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDasharray")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeDashoffset(value: StrokeDashoffsetProperty[TLength] | js.Array[StrokeDashoffsetProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDashoffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeDashoffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDashoffset")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeLinecap(value: StrokeLinecapProperty | js.Array[StrokeLinecapProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinecap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeLinecap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinecap")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeLinejoin(value: StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinejoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeLinejoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinejoin")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeMiterlimit(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeMiterlimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeMiterlimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeMiterlimit")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: StrokeWidthProperty[TLength] | js.Array[StrokeWidthProperty[TLength]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAnchor(value: TextAnchorProperty | js.Array[TextAnchorProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextCombineHorizontal(value: TextCombineUprightProperty | js.Array[TextCombineUprightProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textCombineHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextCombineHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textCombineHorizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withVectorEffect(value: VectorEffectProperty | js.Array[VectorEffectProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vectorEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVectorEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vectorEffect")(js.undefined)
        ret
    }
  }
  
}

