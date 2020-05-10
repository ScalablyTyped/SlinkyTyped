package typingsSlinky.uifabricMergeStyles.irawstylebaseMod

import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesNumbers.`0`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`-ms-autohiding-scrollbar`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`border-box`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`break-word`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`column-reverse`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`content-box`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`flex-end`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`flex-start`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`inline`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`padding-box`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`row-reverse`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`safe left`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`safe right`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`space-around`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`space-between`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`space-evenly`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`subpixel-antialiased`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`unsafe left`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`unsafe right`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.`wrap-reverse`
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.absolute
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.all
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.antialiased
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.auto
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.backwards
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.baseline
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.block
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.both
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.butt
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.center
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.column
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.contain
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.cover
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.fill
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.fixed
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.forwards
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.grayscale
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.hidden
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.horizontal
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.left
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.local
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.none
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.normal
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.nowrap
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.relative
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.right
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.round
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.row
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.scroll
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.scrollbar
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.square
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.static
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.sticky
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.stretch
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.text
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.touch
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.vertical
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.visible
import typingsSlinky.uifabricMergeStyles.uifabricMergeStylesStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRawStyleBase extends IRawFontStyle {
  /**
    * (Moz specific) font smoothing directive.
    */
  var MozOsxFontSmoothing: js.UndefOr[none | antialiased | grayscale | `subpixel-antialiased`] = js.native
  /**
    * (Ms specific) constrast adjust rule.
    */
  var MsHighContrastAdjust: js.UndefOr[ICSSRule | String] = js.native
  /**
    * (Ms specific) scrollbar behavior adjust rule.
    */
  var MsOverflowStyle: js.UndefOr[auto | none | scrollbar | `-ms-autohiding-scrollbar`] = js.native
  /**
    * Edge requires the -webkit prefix backdrop-filter.
    */
  var WebkitBackdropFilter: js.UndefOr[ICSSRule | String] = js.native
  /**
    * (Webkit specific) font smoothing directive.
    */
  var WebkitFontSmoothing: js.UndefOr[none | antialiased | grayscale | `subpixel-antialiased`] = js.native
  /**
    * (Webkit specific) momentum scrolling on iOS devices
    */
  var WebkitOverflowScrolling: js.UndefOr[auto | touch] = js.native
  /**
    * (Webkit specific) color of the highlight that appears overa  link while it's being tapped
    */
  var WebkitTapHighlightColor: js.UndefOr[String] = js.native
  /**
    * Aligns a flex container's lines within the flex container when there is extra space
    * in the cross-axis, similar to how justify-content aligns individual items within the main-axis.
    */
  var alignContent: js.UndefOr[
    ICSSRule | `flex-start` | `flex-end` | center | `space-between` | `space-around` | stretch
  ] = js.native
  /**
    * Sets the default alignment in the cross axis for all of the flex container's items,
    * including anonymous flex items, similarly to how justify-content aligns items along the main axis.
    */
  var alignItems: js.UndefOr[ICSSRule | `flex-start` | `flex-end` | center | baseline | stretch] = js.native
  /**
    * Aligns the box (as the alignment subject) within its containing block (as the alignment container)
    * along the block/column/cross axis of the alignment container.
    *
    * See CSS align-self property
    * https://www.w3.org/TR/css-align-3/#propdef-align-self
    */
  var alignSelf: js.UndefOr[
    ICSSRule | auto | normal | stretch | ICSSBaselinePositionRule | ICSSOverflowAndSelfPositionRule
  ] = js.native
  /**
    * This property allows precise alignment of elements, such as graphics, that do not
    * have a baseline-table or lack the desired baseline in their baseline-table. With the
    * alignment-adjust property, the position of the baseline identified by the
    * alignment-baseline can be explicitly determined. It also determines precisely
    * the alignment point for each glyph within a textual element.
    */
  var alignmentAdjust: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies how an object is aligned with respect to its parent. This property specifies
    * which baseline of this element is to be aligned with the corresponding baseline of the
    * parent. For example, this allows alphabetic baselines in Roman text to stay aligned
    * across font size changes. It defaults to the baseline with the same name as the computed
    * value of the alignment-baseline property.
    */
  var alignmentBaseline: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The animation CSS property is a shorthand property for the various animation properties:
    * `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`,
    * `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and
    * `animation-play-state`.
    */
  var animation: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Defines a length of time to elapse before an animation starts, allowing an animation to begin execution
    * some time after it is applied.
    */
  var animationDelay: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Defines whether an animation should run in reverse on some or all cycles.
    */
  var animationDirection: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the length an animation takes to finish. Default value is 0, meaning
    * there will be no animation.
    */
  var animationDuration: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The animation-fill-mode CSS property specifies how a CSS animation should apply
    * styles to its target before and after its execution.
    */
  var animationFillMode: js.UndefOr[ICSSRule | none | forwards | backwards | both] = js.native
  /**
    * Specifies how many times an animation cycle should play.
    */
  var animationIterationCount: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Defines the list of animations that apply to the element.
    */
  var animationName: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Defines whether an animation is running or paused.
    */
  var animationPlayState: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The animation-timing-function specifies the speed curve of an animation.
    */
  var animationTimingFunction: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Allows changing the style of any element to platform-based interface elements or
    * vice versa.
    */
  var appearance: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Lets you apply graphical effects such as blurring or color shifting to the area
    * behind an element. Because it applies to everything behind the element, to see
    * the effect you must make the element or its background at least partially transparent.
    */
  var backdropFilter: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Determines whether or not the “back” side of a transformed element is visible when
    * facing the viewer.
    */
  var backfaceVisibility: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Shorthand property to set the values for one or more of:
    * background-clip, background-color, background-image,
    * background-origin, background-position, background-repeat,
    * background-size, and background-attachment.
    */
  var background: js.UndefOr[ICSSRule | String] = js.native
  /**
    * If a background-image is specified, this property determines
    * whether that image's position is fixed within the viewport,
    * or scrolls along with its containing block.
    * See CSS 3 background-attachment property https://drafts.csswg.org/css-backgrounds-3/#the-background-attachment
    */
  var backgroundAttachment: js.UndefOr[ICSSRule | scroll | fixed | local] = js.native
  /**
    * This property describes how the element's background images should blend with each
    * other and the element's background color. The value is a list of blend modes that
    * corresponds to each background image. Each element in the list will apply to the
    * corresponding element of background-image. If a property doesn’t have enough
    * comma-separated values to match the number of layers, the UA must calculate its
    * used value by repeating the list of values until there are enough.
    */
  var backgroundBlendMode: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The background-clip CSS property specifies if an element's background, whether a
    * `<color>` or an `<image>`, extends underneath its border.
    *
    * \* Does not work in IE
    *
    * \* The `text` value is experimental and should not be used in production code.
    */
  var backgroundClip: js.UndefOr[ICSSRule | `border-box` | `padding-box` | `content-box` | text] = js.native
  /**
    * Sets the background color of an element.
    */
  var backgroundColor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets a compositing style for background images and colors.
    */
  var backgroundComposite: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Applies one or more background images to an element. These can be any valid CSS
    * image, including url() paths to image files or CSS gradients.
    */
  var backgroundImage: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies what the background-position property is relative to.
    */
  var backgroundOrigin: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the position of a background image.
    */
  var backgroundPosition: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Background-repeat defines if and how background images will be repeated after they
    * have been sized and positioned
    */
  var backgroundRepeat: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the size of background images
    */
  var backgroundSize: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Shorthand property that defines the different properties of all four sides of an
    * element's border in a single declaration. It can be used to set border-width,
    * border-style and border-color, or a subset of these.
    */
  var border: js.UndefOr[ICSSRule | `0` | String] = js.native
  /**
    * Shorthand that sets the values of border-bottom-color,
    * border-bottom-style, and border-bottom-width.
    */
  var borderBottom: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the color of the bottom border of an element.
    */
  var borderBottomColor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Defines the shape of the border of the bottom-left corner.
    */
  var borderBottomLeftRadius: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Defines the shape of the border of the bottom-right corner.
    */
  var borderBottomRightRadius: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the line style of the bottom border of a box.
    */
  var borderBottomStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the width of an element's bottom border. To set all four borders, use the
    * border-width shorthand property which sets the values simultaneously for
    * border-top-width, border-right-width, border-bottom-width, and border-left-width.
    */
  var borderBottomWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Border-collapse can be used for collapsing the borders between table cells
    */
  var borderCollapse: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The CSS border-color property sets the color of an element's four borders. This
    * property can have from one to four values, made up of the elementary properties:
    *      •       border-top-color
    *      •       border-right-color
    *      •       border-bottom-color
    *      •       border-left-color The default color is the currentColor of each of
    * these values.
    * If you provide one value, it sets the color for the element. Two values set the
    * horizontal and vertical values, respectively. Providing three values sets the top,
    * vertical, and bottom values, in that order. Four values set all for sides: top,
    * right, bottom, and left, in that order.
    */
  var borderColor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies different corner clipping effects, such as scoop (inner curves), bevel
    * (straight cuts) or notch (cut-off rectangles). Works along with border-radius to
    * specify the size of each corner effect.
    */
  var borderCornerShape: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The property border-image-source is used to set the image to be used instead of
    * the border style. If this is set to none the border-style is used instead.
    */
  var borderImageSource: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The border-image-width CSS property defines the offset to use for dividing the
    * border image in nine parts, the top-left corner, central top edge, top-right-corner,
    * central right edge, bottom-right corner, central bottom edge, bottom-left corner,
    * and central right edge. They represent inward distance from the top, right, bottom,
    * and left edges.
    */
  var borderImageWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Shorthand property that defines the border-width, border-style and border-color of
    * an element's left border in a single declaration. Note that you can use the
    * corresponding longhand properties to set specific individual properties of the left
    * border — border-left-width, border-left-style and border-left-color.
    */
  var borderLeft: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The CSS border-left-color property sets the color of an element's left border. This
    *  page explains the border-left-color value, but often you will find it more
    * convenient to fix the border's left color as part of a shorthand set, either
    * border-left or border-color. Colors can be defined several ways. For more
    * information, see Usage.
    */
  var borderLeftColor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the style of an element's left border. To set all four borders, use the
    * shorthand property, border-style. Otherwise, you can set the borders individually
    * with border-top-style, border-right-style, border-bottom-style, border-left-style.
    */
  var borderLeftStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the width of an element's left border. To set all four borders, use the
    * border-width shorthand property which sets the values simultaneously for
    * border-top-width, border-right-width, border-bottom-width, and border-left-width.
    */
  var borderLeftWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Defines how round the border's corners are.
    */
  var borderRadius: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Shorthand property that defines the border-width, border-style and border-color of
    * an element's right border in a single declaration. Note that you can use the
    * corresponding longhand properties to set specific individual properties of the
    * right border — border-right-width, border-right-style and border-right-color.
    */
  var borderRight: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the color of an element's right border. This page explains the
    * border-right-color value, but often you will find it more convenient to fix the
    * border's right color as part of a shorthand set, either border-right or border-color.
    * Colors can be defined several ways. For more information, see Usage.
    */
  var borderRightColor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the style of an element's right border. To set all four borders, use the
    * shorthand property, border-style. Otherwise, you can set the borders individually
    * with border-top-style, border-right-style, border-bottom-style, border-left-style.
    */
  var borderRightStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the width of an element's right border. To set all four borders, use the
    * border-width shorthand property which sets the values simultaneously for
    * border-top-width, border-right-width, border-bottom-width, and border-left-width.
    */
  var borderRightWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Specifies the distance between the borders of adjacent cells.
    */
  var borderSpacing: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the style of an element's four borders. This property can have from one to
    * four values. With only one value, the value will be applied to all four borders;
    * otherwise, this works as a shorthand property for each of border-top-style,
    *  border-right-style, border-bottom-style, border-left-style, where each border
    *  style may be assigned a separate value.
    */
  var borderStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Shorthand property that defines the border-width, border-style and border-color of
    * an element's top border in a single declaration. Note that you can use the
    * corresponding longhand properties to set specific individual properties of the top
    * border — border-top-width, border-top-style and border-top-color.
    */
  var borderTop: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the color of an element's top border. This page explains the border-top-color
    * value, but often you will find it more convenient to fix the border's top color as
    * part of a shorthand set, either border-top or border-color.
    * Colors can be defined several ways. For more information, see Usage.
    */
  var borderTopColor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the rounding of the top-left corner of the element.
    */
  var borderTopLeftRadius: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the rounding of the top-right corner of the element.
    */
  var borderTopRightRadius: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the style of an element's top border. To set all four borders, use the
    * shorthand property, border-style. Otherwise, you can set the borders individually
    * with border-top-style, border-right-style, border-bottom-style, border-left-style.
    */
  var borderTopStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the width of an element's top border. To set all four borders, use the
    * border-width shorthand property which sets the values simultaneously for
    * border-top-width, border-right-width, border-bottom-width, and border-left-width.
    */
  var borderTopWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the width of an element's four borders. This property can have from one to
    * four values. This is a shorthand property for setting values simultaneously for
    * border-top-width, border-right-width, border-bottom-width, and border-left-width.
    */
  var borderWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * This property specifies how far an absolutely positioned box's bottom margin edge
    * is offset above the bottom edge of the box's containing block. For relatively
    * positioned boxes, the offset is with respect to the bottom edges of the box itself
    * (i.e., the box is given a position in the normal flow, then offset from that
    * position according to these properties).
    */
  var bottom: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Breaks a box into fragments creating new borders, padding and repeating backgrounds
    * or lets it stay as a continuous box on a page break, column break, or, for inline
    * elements, at a line break.
    */
  var boxDecorationBreak: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Cast a drop shadow from the frame of almost any element.
    * MDN: https://developer.mozilla.org/en-US/docs/Web/CSS/box-shadow
    */
  var boxShadow: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The CSS box-sizing property is used to alter the default CSS box model used to
    * calculate width and height of the elements.
    */
  var boxSizing: js.UndefOr[ICSSRule | `border-box` | `content-box`] = js.native
  /**
    * The CSS break-after property allows you to force a break on multi-column layouts.
    * More specifically, it allows you to force a break after an element. It allows you
    * to determine if a break should occur, and what type of break it should be. The
    * break-after CSS property describes how the page, column or region break behaves
    * after the generated box. If there is no generated box, the property is ignored.
    */
  var breakAfter: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Control page/column/region breaks that fall above a block of content
    */
  var breakBefore: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Control page/column/region breaks that fall within a block of content
    */
  var breakInside: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The clear CSS property specifies if an element can be positioned next to or must be
    * positioned below the floating elements that precede it in the markup.
    */
  var clear: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Clipping crops an graphic, so that only a portion of the graphic is rendered, or
    * filled. This clip-rule property, when used with the clip-path property, defines
    * which clip rule, or algorithm, to use when filling the different parts of a graphics.
    */
  var clipRule: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The color property sets the color of an element's foreground content (usually text),
    * accepting any standard CSS color from keywords and hex values to RGB(a) and HSL(a).
    */
  var color: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Describes the number of columns of the element.
    * See CSS 3 column-count property https://www.w3.org/TR/css3-multicol/#cc
    */
  var columnCount: js.UndefOr[ICSSRule | Double | auto] = js.native
  /**
    * Specifies how to fill columns (balanced or sequential).
    */
  var columnFill: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The column-gap property controls the width of the gap between columns in multi-column
    * elements.
    */
  var columnGap: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the width, style, and color of the rule between columns.
    */
  var columnRule: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the color of the rule between columns.
    */
  var columnRuleColor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the width of the rule between columns.
    */
  var columnRuleWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The column-span CSS property makes it possible for an element to span across all
    * columns when its value is set to all. An element that spans more than one column
    * is called a spanning element.
    */
  var columnSpan: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the width of columns in multi-column elements.
    */
  var columnWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * This property is a shorthand property for setting column-width and/or column-count.
    */
  var columns: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Content for pseudo selectors.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The counter-increment property accepts one or more names of counters (identifiers),
    * each one optionally followed by an integer which specifies the value by which the
    * counter should be incremented (e.g. if the value is 2, the counter increases by 2
    * each time it is invoked).
    */
  var counterIncrement: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The counter-reset property contains a list of one or more names of counters, each
    * one optionally followed by an integer (otherwise, the integer defaults to 0.) Each
    * time the given element is invoked, the counters specified by the property are set to the given integer.
    */
  var counterReset: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The cue property specifies sound files (known as an "auditory icon") to be played by
    * speech media agents before and after presenting an element's content; if only one
    * file is specified, it is played both before and after. The volume at which the
    * file(s) should be played, relative to the volume of the main element, may also be
    * specified. The icon files may also be set separately with the cue-before and
    * cue-after properties.
    */
  var cue: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The cue-after property specifies a sound file (known as an "auditory icon") to be
    * played by speech media agents after presenting an element's content; the volume at
    * which the file should be played may also be specified. The shorthand property cue
    * sets cue sounds for both before and after the element is presented.
    */
  var cueAfter: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the mouse cursor displayed when the mouse pointer is over an element.
    */
  var cursor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The direction CSS property specifies the text direction/writing direction. The rtl
    * is used for Hebrew or Arabic text, the ltr is for other languages.
    */
  var direction: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property specifies the type of rendering box used for an element. It is a
    * shorthand property for many other display properties.
    * W3: https://www.w3.org/TR/css-display-3/#the-display-properties
    * MDN: https://developer.mozilla.org/en-US/docs/Web/CSS/display
    */
  var display: js.UndefOr[ICSSRule | ICSSDisplayRule] = js.native
  /**
    * The ‘fill’ property paints the interior of the given graphical element. The area to
    * be painted consists of any areas inside the outline of the shape. To determine the
    * inside of the shape, all subpaths are considered, and the interior is determined
    * according to the rules associated with the current value of the ‘fill-rule’
    * property. The zero-width geometric outline of a shape is included in the area to be
    * painted.
    */
  var fill: js.UndefOr[ICSSRule | String] = js.native
  /**
    * SVG: Specifies the opacity of the color or the content the current object is filled
    * with.
    * See SVG 1.1 https://www.w3.org/TR/SVG/painting.html#FillOpacityProperty
    */
  var fillOpacity: js.UndefOr[ICSSRule | Double] = js.native
  /**
    * The ‘fill-rule’ property indicates the algorithm which is to be used to determine
    * what parts of the canvas are included inside the shape. For a simple,
    * non-intersecting path, it is intuitively clear what region lies "inside"; however,
    * for a more complex path, such as a path that intersects itself or where one subpath
    * encloses another, the interpretation of "inside" is not so obvious.
    * The ‘fill-rule’ property provides two options for how the inside of a shape is
    * determined:
    */
  var fillRule: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Applies various image processing effects. This property is largely unsupported. See
    * Compatibility section for more information.
    */
  var filter: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`.
    */
  var flex: js.UndefOr[ICSSRule | String | Double] = js.native
  /**
    * The flex-basis CSS property describes the initial main size of the flex item before
    * any free space is distributed according to the flex factors described in the flex
    * property (flex-grow and flex-shrink).
    */
  var flexBasis: js.UndefOr[ICSSRule | String | Double] = js.native
  /**
    * The flex-direction CSS property describes how flex items are placed in the flex
    * container, by setting the direction of the flex container's main axis.
    */
  var flexDirection: js.UndefOr[ICSSRule | row | `row-reverse` | column | `column-reverse`] = js.native
  /**
    * The flex-flow CSS property defines the flex container's main and cross axis. It is
    * a shorthand property for the flex-direction and flex-wrap properties.
    */
  var flexFlow: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the flex grow factor of a flex item.
    * See CSS flex-grow property https://drafts.csswg.org/css-flexbox-1/#flex-grow-property
    */
  var flexGrow: js.UndefOr[ICSSRule | Double | String] = js.native
  /**
    * Specifies the flex shrink factor of a flex item.
    * See CSS flex-shrink property https://drafts.csswg.org/css-flexbox-1/#flex-shrink-property
    */
  var flexShrink: js.UndefOr[ICSSRule | Double | String] = js.native
  /**
    * Specifies whether flex items are forced into a single line or can be wrapped onto
    * multiple lines. If wrapping is allowed, this property also enables you to control
    * the direction in which lines are stacked.
    * See CSS flex-wrap property https://drafts.csswg.org/css-flexbox-1/#flex-wrap-property
    */
  var flexWrap: js.UndefOr[ICSSRule | nowrap | wrap | `wrap-reverse`] = js.native
  /**
    * Elements which have the style float are floated horizontally. These elements can
    * move as far to the left or right of the containing element. All elements after
    * the floating element will flow around it, but elements before the floating element
    * are not impacted. If several floating elements are placed after each other, they
    * will float next to each other as long as there is room.
    */
  var float: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Flows content from a named flow (specified by a corresponding flow-into) through
    * selected elements to form a dynamic chain of layout regions.
    */
  var flowFrom: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Lays out one or more grid items bound by 4 grid lines. Shorthand for setting
    * grid-column-start, grid-column-end, grid-row-start, and grid-row-end in a single
    * declaration.
    */
  var gridArea: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the size of an implicitly-created grid column track
    */
  var gridAutoColumns: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Controls how the auto-placement algorithm works,
    * specifying exactly how auto-placed items get flowed into the grid.
    */
  var gridAutoFlow: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the size of an implicitly-created grid column track
    */
  var gridAutoRows: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Controls a grid item's placement in a grid area, particularly grid position and a
    * grid span. Shorthand for setting grid-column-start and grid-column-end in a single
    * declaration.
    */
  var gridColumn: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Controls a grid item's placement in a grid area as well as grid position and a
    * grid span. The grid-column-end property (with grid-row-start, grid-row-end, and
    * grid-column-start) determines a grid item's placement by specifying the grid lines
    * of a grid item's grid area.
    */
  var gridColumnEnd: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the size of the gap (gutter) between an element's columns
    */
  var gridColumnGap: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Determines a grid item's placement by specifying the starting grid lines of a grid
    * item's grid area . A grid item's placement in a grid area consists of a grid
    * position and a grid span. See also ( grid-row-start, grid-row-end, and
    * grid-column-end)
    */
  var gridColumnStart: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the gaps (gutters) between grid rows and columns. It is a shorthand
    * for grid-row-gap and grid-column-gap.
    */
  var gridGap: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Gets or sets a value that indicates which row an element within a Grid should
    * appear in. Shorthand for setting grid-row-start and grid-row-end in a single
    * declaration.
    */
  var gridRow: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Determines a grid item’s placement by specifying the block-end. A grid item's
    * placement in a grid area consists of a grid position and a grid span. The
    * grid-row-end property (with grid-row-start, grid-column-start, and grid-column-end)
    * determines a grid item's placement by specifying the grid lines of a grid item's
    * grid area.
    */
  var gridRowEnd: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the size of the gap (gutter) between an element's grid rows
    */
  var gridRowGap: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies a row position based upon an integer location, string value, or desired
    * row size.
    * css/properties/grid-row is used as short-hand for grid-row-position and
    * grid-row-position
    */
  var gridRowPosition: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies a grid item’s start position within the grid row by contributing a line,
    * a span, or nothing (automatic) to its grid placement, thereby specifying the
    * inline-start edge of its grid area
    */
  var gridRowStart: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies named grid areas which are not associated with any particular grid item,
    * but can be referenced from the grid-placement properties. The syntax of the
    * grid-template-areas property also provides a visualization of the structure of the
    * grid, making the overall layout of the grid container easier to understand.
    */
  var gridTemplate: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies named grid areas
    */
  var gridTemplateAreas: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies (with grid-template-rows) the line names and track sizing functions of
    * the grid. Each sizing function can be specified as a length, a percentage of the
    * grid container’s size, a measurement of the contents occupying the column or row,
    * or a fraction of the free space in the grid.
    */
  var gridTemplateColumns: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies (with grid-template-columns) the line names and track sizing functions of
    * the grid. Each sizing function can be specified as a length, a percentage of the
    * grid container’s size, a measurement of the contents occupying the column or row,
    * or a fraction of the free space in the grid.
    */
  var gridTemplateRows: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the height of an element. The content area of the element height does not
    * include the padding, border, and margin of the element.
    */
  var height: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Specifies the minimum number of characters in a hyphenated word
    */
  var hyphenateLimitChars: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Indicates the maximum number of successive hyphenated lines in an element. The
    * ‘no-limit’ value means that there is no limit.
    */
  var hyphenateLimitLines: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the maximum amount of trailing whitespace (before justification) that may
    * be left in a line before hyphenation is triggered to pull part of a word from the
    * next line back up into the current one.
    */
  var hyphenateLimitZone: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies whether or not words in a sentence can be split by the use of a manual or
    * automatic hyphenation mechanism.
    */
  var hyphens: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Defines how the browser distributes space between and around flex items
    * along the main-axis of their container.
    * See CSS justify-content property
    * https://www.w3.org/TR/css-flexbox-1/#justify-content-property
    */
  var justifyContent: js.UndefOr[
    ICSSRule | `flex-start` | `flex-end` | center | `space-between` | `space-around` | `space-evenly` | stretch
  ] = js.native
  /**
    * Justifies the box (as the alignment subject) within its containing block (as the alignment container)
    * along the inline/row/main axis of the alignment container.
    *
    * See CSS jusitfy-self property
    * https://www.w3.org/TR/css-align-3/#propdef-justify-self
    */
  var justifySelf: js.UndefOr[
    ICSSRule | auto | normal | stretch | ICSSBaselinePositionRule | ICSSOverflowAndSelfPositionRule | left | right | (`safe left`) | (`safe right`) | (`unsafe left`) | (`unsafe right`)
  ] = js.native
  /**
    * Sets the left position of an element relative to the nearest anscestor that is set
    * to position absolute, relative, or fixed.
    */
  var left: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The letter-spacing CSS property specifies the spacing behavior between text
    * characters.
    */
  var letterSpacing: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the height of an inline block level element.
    * See CSS 2.1 line-height property https://www.w3.org/TR/CSS21/visudet.html#propdef-line-height
    */
  var lineHeight: js.UndefOr[ICSSRule | normal | ICSSPixelUnitRule | ICSSPercentageRule] = js.native
  /**
    * Shorthand property that sets the list-style-type, list-style-position and
    * list-style-image properties in one declaration.
    */
  var listStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property sets the image that will be used as the list item marker. When the
    * image is available, it will replace the marker set with the 'list-style-type'
    * marker. That also means that if the image is not available, it will show the style
    * specified by list-style-property
    */
  var listStyleImage: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies if the list-item markers should appear inside or outside the content flow.
    */
  var listStylePosition: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the type of list-item marker in a list.
    */
  var listStyleType: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The margin property is shorthand to allow you to set all four margins of an element
    * at once. Its equivalent longhand properties are margin-top, margin-right,
    * margin-bottom and margin-left. Negative values are also allowed.
    */
  var margin: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * margin-bottom sets the bottom margin of an element.
    */
  var marginBottom: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * margin-left sets the left margin of an element.
    */
  var marginLeft: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * margin-right sets the right margin of an element.
    */
  var marginRight: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * margin-top sets the top margin of an element.
    */
  var marginTop: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The marquee-direction determines the initial direction in which the marquee content moves.
    */
  var marqueeDirection: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The 'marquee-style' property determines a marquee's scrolling behavior.
    */
  var marqueeStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property is shorthand for setting mask-image, mask-mode, mask-repeat,
    * mask-position, mask-clip, mask-origin, mask-composite and mask-size. Omitted
    * values are set to their original properties' initial values.
    */
  var mask: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property is shorthand for setting mask-border-source, mask-border-slice,
    * mask-border-width, mask-border-outset, and mask-border-repeat. Omitted values
    * are set to their original properties' initial values.
    */
  var maskBorder: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property specifies how the images for the sides and the middle part of the
    * mask image are scaled and tiled. The first keyword applies to the horizontal
    * sides, the second one applies to the vertical ones. If the second keyword is
    * absent, it is assumed to be the same as the first, similar to the CSS
    * border-image-repeat property.
    */
  var maskBorderRepeat: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property specifies inward offsets from the top, right, bottom, and left
    * edges of the mask image, dividing it into nine regions: four corners, four
    * edges, and a middle. The middle image part is discarded and treated as fully
    * transparent black unless the fill keyword is present. The four values set the
    * top, right, bottom and left offsets in that order, similar to the CSS
    * border-image-slice property.
    */
  var maskBorderSlice: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies an image to be used as a mask. An image that is empty, fails to
    * download, is non-existent, or cannot be displayed is ignored and does not mask
    * the element.
    */
  var maskBorderSource: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property sets the width of the mask box image, similar to the CSS
    * border-image-width property.
    */
  var maskBorderWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Determines the mask painting area, which defines the area that is affected by
    * the mask. The painted content of an element may be restricted to this area.
    */
  var maskClip: js.UndefOr[ICSSRule | String] = js.native
  /**
    * For elements rendered as a single box, specifies the mask positioning area. For
    * elements rendered as multiple boxes (e.g., inline boxes on several lines, boxes
    * on several pages) specifies which boxes box-decoration-break operates on to
    * determine the mask positioning area(s).
    */
  var maskOrigin: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property must not be used. It is no longer included in any standard or
    * standard track specification, nor is it implemented in any browser. It is only
    * used when the text-align-last property is set to size. It controls allowed
    * adjustments of font-size to fit line content.
    */
  var maxFontSize: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the maximum height for an element. It prevents the height of the element to
    *  exceed the specified value. If min-height is specified and is greater than
    * max-height, max-height is overridden.
    */
  var maxHeight: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the maximum width for an element. It limits the width property to be larger
    * than the value specified in max-width.
    */
  var maxWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the minimum height for an element. It prevents the height of the element to
    * be smaller than the specified value. The value of min-height overrides both
    * max-height and height.
    */
  var minHeight: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Sets the minimum width of an element. It limits the width property to be not
    * smaller than the value specified in min-width.
    */
  var minWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The mix-blend-mode CSS property describes how an element's content should blend
    * with the content of the element's direct parent and the element's background.
    */
  var mixBlendMode: js.UndefOr[ICSSRule | IMixBlendModes] = js.native
  /**
    * The ‘object-fit’ property specifies how the contents of a replaced element should
    * be fitted to the box established by its used height and width.
    * See CSS 3 object-fit property https://www.w3.org/TR/css3-images/#the-object-fit
    */
  var objectFit: js.UndefOr[ICSSRule | cover | contain | fill | none] = js.native
  /**
    * Specifies the transparency of an element.
    * See CSS 3 opacity property https://drafts.csswg.org/css-color-3/#opacity
    */
  var opacity: js.UndefOr[ICSSRule | Double | String] = js.native
  /**
    * Specifies the order used to lay out flex items in their flex container.
    * Elements are laid out in the ascending order of the order value.
    * See CSS order property https://drafts.csswg.org/css-flexbox-1/#order-property
    */
  var order: js.UndefOr[ICSSRule | Double] = js.native
  /**
    * In paged media, this property defines the minimum number of lines in
    * a block container that must be left at the bottom of the page.
    * See CSS 3 orphans, widows properties https://drafts.csswg.org/css-break-3/#widows-orphans
    */
  var orphans: js.UndefOr[ICSSRule | Double] = js.native
  /**
    * The CSS outline property is a shorthand property for setting one or more of the
    * individual outline properties outline-style, outline-width and outline-color in a
    * single rule. In most cases the use of this shortcut is preferable and more
    * convenient.
    * Outlines differ from borders in the following ways:
    *      •       Outlines do not take up space, they are drawn above the content.
    *      •       Outlines may be non-rectangular. They are rectangular in
    * Gecko/Firefox. Internet Explorer attempts to place the smallest contiguous outline
    * around all elements or shapes that are indicated to have an outline. Opera draws a
    * non-rectangular shape around a construct.
    */
  var outline: js.UndefOr[ICSSRule | `0` | String] = js.native
  /**
    * The outline-color property sets the color of the outline of an element. An
    * outline is a line that is drawn around elements, outside the border edge, to make
    * the element stand out.
    */
  var outlineColor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The outline-offset property offsets the outline and draw it beyond the border edge.
    */
  var outlineOffset: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The overflow property controls how extra content exceeding the bounding box of an
    * element is rendered. It can be used in conjunction with an element that has a
    * fixed width and height, to eliminate text-induced page distortion.
    */
  var overflow: js.UndefOr[ICSSRule | auto | hidden | scroll | visible] = js.native
  /**
    * Specifies the preferred scrolling methods for elements that overflow.
    */
  var overflowStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies whether or not the browser should insert line breaks within words to
    * prevent text from overflowing its content box. In contrast to word-break,
    * overflow-wrap will only create a break if an entire word cannot be placed on its
    * own line without overflowing.
    */
  var overflowWrap: js.UndefOr[ICSSRule | normal | `break-word`] = js.native
  /**
    * Controls how extra content exceeding the x-axis of the bounding box of an element
    * is rendered.
    */
  var overflowX: js.UndefOr[ICSSRule | auto | hidden | scroll | visible] = js.native
  /**
    * Controls how extra content exceeding the y-axis of the bounding box of an element
    * is rendered.
    */
  var overflowY: js.UndefOr[ICSSRule | auto | hidden | scroll | visible] = js.native
  /**
    * The padding optional CSS property sets the required padding space on one to four
    * sides of an element. The padding area is the space between an element and its
    * border. Negative values are not allowed but decimal values are permitted. The
    *  element size is treated as fixed, and the content of the element shifts toward the
    * center as padding is increased. The padding property is a shorthand to avoid
    * setting each side separately (padding-top, padding-right, padding-bottom,
    * padding-left).
    */
  var padding: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The padding-block-end CSS property defines the logical block end padding
    * of an element, which maps to a physical padding depending on the element's
    * writing mode, directionality, and text orientation. It corresponds to the
    * padding-top, padding-right, padding-bottom, or padding-left property
    * depending on the values defined for writing-mode, direction, and text-orientation.
    */
  var paddingBlockEnd: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The padding-block-start CSS property defines the logical block start padding
    * of an element, which maps to a physical padding depending on the element's
    * writing mode, directionality, and text orientation. It corresponds to the
    * padding-top, padding-right, padding-bottom, or padding-left property depending
    * on the values defined for writing-mode, direction, and text-orientation.
    */
  var paddingBlockStart: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The padding-bottom CSS property of an element sets the padding space required on
    * the bottom of an element. The padding area is the space between the content of the
    * element and its border. Contrary to margin-bottom values, negative values of
    * padding-bottom are invalid.
    */
  var paddingBottom: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The padding-inline-end CSS property defines the logical inline end padding of an element,
    * which maps to a physical padding depending on the element's writing mode, directionality,
    * and text orientation. It corresponds to the padding-top, padding-right, padding-bottom,
    * or padding-left property depending on the values defined for writing-mode, direction,
    * and text-orientation.
    */
  var paddingInlineEnd: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The padding-inline-start CSS property defines the logical inline start padding of
    * an element, which maps to a physical padding depending on the element's writing mode,
    * directionality, and text orientation. It corresponds to the padding-top, padding-right,
    * padding-bottom, or padding-left property depending on the values defined for writing-mode,
    * direction, and text-orientation.
    */
  var paddingInlineStart: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The padding-left CSS property of an element sets the padding space required on the
    * left side of an element. The padding area is the space between the content of the
    * element and its border. Contrary to margin-left values, negative values of
    * padding-left are invalid.
    */
  var paddingLeft: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The padding-right CSS property of an element sets the padding space required on the
    * right side of an element. The padding area is the space between the content of the
    * element and its border. Contrary to margin-right values, negative values of
    * padding-right are invalid.
    */
  var paddingRight: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The padding-top CSS property of an element sets the padding space required on the
    * top of an element. The padding area is the space between the content of the element
    * and its border. Contrary to margin-top values, negative values of padding-top are
    * invalid.
    */
  var paddingTop: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The page-break-after property is supported in all major browsers. With CSS3,
    *  page-break-* properties are only aliases of the break-* properties. The CSS3
    * Fragmentation spec defines breaks for all CSS box fragmentation.
    */
  var pageBreakAfter: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The page-break-before property sets the page-breaking behavior before an element.
    * With CSS3, page-break-* properties are only aliases of the break-* properties. The
    * CSS3 Fragmentation spec defines breaks for all CSS box fragmentation.
    */
  var pageBreakBefore: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the page-breaking behavior inside an element. With CSS3, page-break-*
    * properties are only aliases of the break-* properties. The CSS3 Fragmentation spec
    * defines breaks for all CSS box fragmentation.
    */
  var pageBreakInside: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The pause property determines how long a speech media agent should pause before and
    * after presenting an element. It is a shorthand for the pause-before and pause-after
    *  properties.
    */
  var pause: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The pause-after property determines how long a speech media agent should pause after
    * presenting an element. It may be replaced by the shorthand property pause, which
    * sets pause time before and after.
    */
  var pauseAfter: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The pause-before property determines how long a speech media agent should pause
    * before presenting an element. It may be replaced by the shorthand property pause,
    * which sets pause time before and after.
    */
  var pauseBefore: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The perspective property defines how far an element is placed from the view on the
    * z-axis, from the screen to the viewer. Perspective defines how an object is viewed.
    * In graphic arts, perspective is the representation on a flat surface of what the
    * viewer's eye would see in a 3D space. (See Wikipedia for more information about
    * graphical perspective and for related illustrations.)
    * The illusion of perspective on a flat surface, such as a computer screen, is created
    * by projecting points on the flat surface as they would appear if the flat surface
    * were a window through which the viewer was looking at the object. In discussion of
    * virtual environments, this flat surface is called a projection plane.
    */
  var perspective: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The perspective-origin property establishes the origin for the perspective property.
    * It effectively sets the X and Y position at which the viewer appears to be looking
    * at the children of the element.
    * When used with perspective, perspective-origin changes the appearance of an object,
    * as if a viewer were looking at it from a different origin. An object appears
    * differently if a viewer is looking directly at it versus looking at it from below,
    * above, or from the side. Thus, the perspective-origin is like a vanishing point.
    * The default value of perspective-origin is 50% 50%. This displays an object as if
    * the viewer's eye were positioned directly at the center of the screen, both
    * top-to-bottom and left-to-right. A value of 0% 0% changes the object as if the
    * viewer was looking toward the top left angle. A value of 100% 100% changes the
    * appearance as if viewed toward the bottom right angle.
    */
  var perspectiveOrigin: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The pointer-events property allows you to control whether an element can be the
    * target for the pointing device (e.g, mouse, pen) events.
    */
  var pointerEvents: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The position property controls the type of positioning used by an element within
    * its parent elements. The effect of the position property depends on a lot of
    * factors, for example the position property of parent elements.
    */
  var position: js.UndefOr[ICSSRule | static | relative | absolute | fixed | sticky] = js.native
  /**
    * Sets the type of quotation marks for embedded quotations.
    */
  var quotes: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Controls whether the last region in a chain displays additional 'overset' content
    * according its default overflow property, or if it displays a fragment of content
    * as if it were flowing into a subsequent region.
    */
  var regionFragment: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The resize CSS sets whether an element is resizable, and if so, in which direction(s).
    */
  var resize: js.UndefOr[ICSSRule | none | both | horizontal | vertical | block | `inline`] = js.native
  /**
    * The rest-after property determines how long a speech media agent should pause after
    * presenting an element's main content, before presenting that element's exit cue
    * sound. It may be replaced by the shorthand property rest, which sets rest time
    * before and after.
    */
  var restAfter: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The rest-before property determines how long a speech media agent should pause after
    * presenting an intro cue sound for an element, before presenting that element's main
    * content. It may be replaced by the shorthand property rest, which sets rest time
    * before and after.
    */
  var restBefore: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the position an element in relation to the right side of the containing
    * element.
    */
  var right: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Defines the alpha channel threshold used to extract a shape from an image. Can be
    * thought of as a "minimum opacity" threshold; that is, a value of 0.5 means that the
    * shape will enclose all the pixels that are more than 50% opaque.
    */
  var shapeImageThreshold: js.UndefOr[ICSSRule | String] = js.native
  /**
    * A future level of CSS Shapes will define a shape-inside property, which will define
    * a shape to wrap content within the element. See Editor's Draft
    * http://dev.w3.org/csswg/css-shapes and CSSWG wiki page on next-level plans
    * http://wiki.csswg.org/spec/css-shapes
    */
  var shapeInside: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Adds a margin to a shape-outside. In effect, defines a new shape that is the
    * smallest contour around all the points that are the shape-margin distance outward
    * perpendicular to each point on the underlying shape. For points where a
    * perpendicular direction is not defined (e.g., a triangle corner), takes all
    * points on a circle centered at the point and with a radius of the shape-margin
    * distance. This property accepts only non-negative values.
    */
  var shapeMargin: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Declares a shape around which text should be wrapped, with possible modifications
    * from the shape-margin property. The shape defined by shape-outside and shape-margin
    * changes the geometry of a float element's float area.
    */
  var shapeOutside: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The speak property determines whether or not a speech synthesizer will read aloud
    * the contents of an element.
    */
  var speak: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The speak-as property determines how the speech synthesizer interprets the content:
    * words as whole words or as a sequence of letters, numbers as a numerical value or a
    * sequence of digits, punctuation as pauses in speech or named punctuation characters.
    */
  var speakAs: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The stroke property in CSS is for adding a border to SVG shapes.
    * See SVG 1.1 https://www.w3.org/TR/SVG/painting.html#Stroke
    */
  var stroke: js.UndefOr[ICSSRule | String] = js.native
  /**
    * SVG: The stroke-linecap attribute defines the shape to be used at the end of open subpaths when they are stroked.
    * See SVG 1.1 https://www.w3.org/TR/SVG/painting.html#LineCaps
    */
  var strokeLinecap: js.UndefOr[ICSSRule | butt | round | square] = js.native
  /**
    * SVG: Specifies the opacity of the outline on the current object.
    * See SVG 1.1 https://www.w3.org/TR/SVG/painting.html#StrokeOpacityProperty
    */
  var strokeOpacity: js.UndefOr[ICSSRule | Double] = js.native
  /**
    * SVG: Specifies the width of the outline on the current object.
    * See SVG 1.1 https://www.w3.org/TR/SVG/painting.html#StrokeWidthProperty
    */
  var strokeWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The tab-size CSS property is used to customise the width of a tab (U+0009) character.
    */
  var tabSize: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The 'table-layout' property controls the algorithm used to lay out the table cells, rows, and columns.
    */
  var tableLayout: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The text-align CSS property describes how inline content like text is aligned in its
    * parent block element. text-align does not control the alignment of block elements
    * itself, only their inline content.
    */
  var textAlign: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The text-align-last CSS property describes how the last line of a block element or
    * a line before line break is aligned in its parent block element.
    */
  var textAlignLast: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The text-decoration CSS property is used to set the text formatting to underline,
    * overline, line-through or blink. underline and overline decorations are positioned
    * under the text, line-through over it.
    */
  var textDecoration: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the color of any text decoration, such as underlines, overlines, and strike
    * throughs.
    */
  var textDecorationColor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets what kind of line decorations are added to an element, such as underlines,
    * overlines, etc.
    */
  var textDecorationLine: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies what parts of an element’s content are skipped over when applying any
    * text decoration.
    */
  var textDecorationSkip: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property specifies the style of the text decoration line drawn on the
    * specified element. The intended meaning for the values are the same as those of
    * the border-style-properties.
    */
  var textDecorationStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The text-emphasis property will apply special emphasis marks to the elements text.
    * Slightly similar to the text-decoration property only that this property can have
    * affect on the line-height. It also is noted that this is shorthand for
    * text-emphasis-style and for text-emphasis-color.
    */
  var textEmphasis: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The text-emphasis-color property specifies the foreground color of the emphasis
    * marks.
    */
  var textEmphasisColor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The text-emphasis-style property applies special emphasis marks to an element's
    * text.
    */
  var textEmphasisStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property helps determine an inline box's block-progression dimension, derived
    * from the text-height and font-size properties for non-replaced elements, the height
    * or the width for replaced elements, and the stacked block-progression dimension for
    * inline-block elements. The block-progression dimension determines the position of
    * the padding, border and margin for the element.
    */
  var textHeight: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the amount of space horizontally that should be left on the first line of
    * the text of an element. This horizontal spacing is at the beginning of the first
    * line and is in respect to the left edge of the containing block box.
    */
  var textIndent: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The text-overflow shorthand CSS property determines how overflowed content that is
    * not displayed is signaled to the users. It can be clipped, display an ellipsis
    * ('…', U+2026 HORIZONTAL ELLIPSIS) or a Web author-defined string. It covers the
    * two long-hand properties text-overflow-mode and text-overflow-ellipsis
    */
  var textOverflow: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The text-overline property is the shorthand for the text-overline-style,
    * text-overline-width, text-overline-color, and text-overline-mode properties.
    */
  var textOverline: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the line color for the overline text decoration.
    */
  var textOverlineColor: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the mode for the overline text decoration, determining whether the text
    * decoration affects the space characters or not.
    */
  var textOverlineMode: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the line style for overline text decoration.
    */
  var textOverlineStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies the line width for the overline text decoration.
    */
  var textOverlineWidth: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The text-rendering CSS property provides information to the browser about how to
    * optimize when rendering text. Options are: legibility, speed or geometric precision.
    */
  var textRendering: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The CSS text-shadow property applies one or more drop shadows to the text and
    * `<text-decorations>` of an element. Each shadow is specified as an offset from the
    * text, along with optional color and blur radius values.
    */
  var textShadow: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property transforms text for styling purposes. (It has no effect on the
    * underlying content.)
    */
  var textTransform: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Unsupported.
    * This property will add a underline position value to the element that has an
    * underline defined.
    */
  var textUnderlinePosition: js.UndefOr[ICSSRule | String] = js.native
  /**
    * After review this should be replaced by text-decoration should it not?
    * This property will set the underline style for text with a line value for
    * underline, overline, and line-through.
    */
  var textUnderlineStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property specifies how far an absolutely positioned box's top margin edge is
    * offset below the top edge of the box's containing block. For relatively positioned
    * boxes, the offset is with respect to the top edges of the box itself (i.e., the box
    * is given a position in the normal flow, then offset from that position according to
    * these properties).
    */
  var top: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * Determines whether touch input may trigger default behavior supplied by the user
    * agent, such as panning or zooming.
    */
  var touchAction: js.UndefOr[ICSSRule | String] = js.native
  /**
    * CSS transforms allow elements styled with CSS to be transformed in two-dimensional
    * or three-dimensional space. Using this property, elements can be translated,
    * rotated, scaled, and skewed. The value list may consist of 2D and/or 3D transform
    * values.
    */
  var transform: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property defines the origin of the transformation axes relative to the element
    * to which the transformation is applied.
    */
  var transformOrigin: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property allows you to define the relative position of the origin of the
    * transformation grid along the z-axis.
    */
  var transformOriginZ: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This property specifies how nested elements are rendered in 3D space relative to their parent.
    */
  var transformStyle: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The transition CSS property is a shorthand property for transition-property,
    * transition-duration, transition-timing-function, and transition-delay. It allows to
    * define the transition between two states of an element.
    */
  var transition: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Defines when the transition will start. A value of ‘0s’ means the transition will
    * execute as soon as the property is changed. Otherwise, the value specifies an
    * offset from the moment the property is changed, and the transition will delay
    * execution by that offset.
    */
  var transitionDelay: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The 'transition-duration' property specifies the length of time a transition
    * animation takes to complete.
    */
  var transitionDuration: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The 'transition-property' property specifies the name of the CSS property to which
    * the transition is applied.
    */
  var transitionProperty: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Sets the pace of action within a transition
    */
  var transitionTimingFunction: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The unicode-bidi CSS property specifies the level of embedding with respect to the bidirectional algorithm.
    */
  var unicodeBidi: js.UndefOr[ICSSRule | String] = js.native
  /**
    * This is for all the high level UX stuff.
    */
  var userFocus: js.UndefOr[ICSSRule | String] = js.native
  /**
    * For inputing user content
    */
  var userInput: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Defines the text selection behavior.
    */
  var userSelect: js.UndefOr[ICSSRule | none | auto | text | all | contain] = js.native
  /**
    * The vertical-align property controls how inline elements or text are vertically
    * aligned compared to the baseline. If this property is used on table-cells it
    * controls the vertical alignment of content of the table cell.
    */
  var verticalAlign: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The visibility property specifies whether the boxes generated by an element are rendered.
    */
  var visibility: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The voice-balance property sets the apparent position (in stereo sound) of the synthesized voice for spoken media.
    */
  var voiceBalance: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The voice-duration property allows the author to explicitly set the amount of time
    * it should take a speech synthesizer to read an element's content, for example to
    * allow the speech to be synchronized with other media. With a value of auto (the
    * default) the length of time it takes to read the content is determined by the
    * content itself and the voice-rate property.
    */
  var voiceDuration: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The voice-family property sets the speaker's voice used by a speech media agent to
    * read an element. The speaker may be specified as a named character (to match a
    * voice option in the speech reading software) or as a generic description of the
    * age and gender of the voice. Similar to the font-family property for visual media,
    * a comma-separated list of fallback options may be given in case the speech reader
    * does not recognize the character name or cannot synthesize the requested combination
    * of generic properties.
    */
  var voiceFamily: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The voice-pitch property sets pitch or tone (high or low) for the synthesized speech
    * when reading an element; the pitch may be specified absolutely or relative to the
    * normal pitch for the voice-family used to read the text.
    */
  var voicePitch: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The voice-range property determines how much variation in pitch or tone will be
    * created by the speech synthesize when reading an element. Emphasized text,
    * grammatical structures and punctuation may all be rendered as changes in pitch,
    * this property determines how strong or obvious those changes are; large ranges are
    * associated with enthusiastic or emotional speech, while small ranges are associated
    * with flat or mechanical speech.
    */
  var voiceRange: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The voice-rate property sets the speed at which the voice synthesized by a speech
    * media agent will read content.
    */
  var voiceRate: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The voice-stress property sets the level of vocal emphasis to be used for
    * synthesized speech reading the element.
    */
  var voiceStress: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The voice-volume property sets the volume for spoken content in speech media. It
    * replaces the deprecated volume property.
    */
  var voiceVolume: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The white-space property controls whether and how white space inside the element is
    * collapsed, and whether lines may wrap at unforced "soft wrap" opportunities.
    */
  var whiteSpace: js.UndefOr[ICSSRule | String] = js.native
  /**
    * In paged media, this property defines the mimimum number of lines that must be left
    * at the top of the second page.
    * See CSS 3 orphans, widows properties
    * https://drafts.csswg.org/css-break-3/#widows-orphans
    */
  var widows: js.UndefOr[ICSSRule | Double] = js.native
  /**
    * Specifies the width of the content area of an element. The content area of the element
    * width does not include the padding, border, and margin of the element.
    */
  var width: js.UndefOr[ICSSRule | ICSSPixelUnitRule] = js.native
  /**
    * The word-break property is often used when there is long generated content that is
    * strung together without and spaces or hyphens to beak apart. A common case of this
    * is when there is a long URL that does not have any hyphens. This case could
    * potentially cause the breaking of the layout as it could extend past the parent
    * element.
    */
  var wordBreak: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The word-spacing CSS property specifies the spacing behavior between "words".
    */
  var wordSpacing: js.UndefOr[ICSSRule | String] = js.native
  /**
    * An alias of css/properties/overflow-wrap, word-wrap defines whether to break
    * words when the content exceeds the boundaries of its container.
    */
  var wordWrap: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Specifies how exclusions affect inline content within block-level elements. Elements
    * lay out their inline content in their content area but wrap around exclusion areas.
    */
  var wrapFlow: js.UndefOr[ICSSRule | String] = js.native
  /**
    * Set the value that is used to offset the inner wrap shape from other shapes. Inline
    * content that intersects a shape with this property will be pushed by this shape's
    * margin.
    */
  var wrapMargin: js.UndefOr[ICSSRule | String] = js.native
  /**
    * writing-mode specifies if lines of text are laid out horizontally or vertically,
    * and the direction which lines of text and blocks progress.
    */
  var writingMode: js.UndefOr[ICSSRule | String] = js.native
  /**
    * The z-index property specifies the z-order of an element and its descendants.
    * When elements overlap, z-order determines which one covers the other.
    * See CSS 2 z-index property https://www.w3.org/TR/CSS2/visuren.html#z-index
    */
  var zIndex: js.UndefOr[ICSSRule | auto | Double] = js.native
  /**
    * Sets the initial zoom factor of a document defined by `@viewport`.
    * See CSS zoom descriptor https://drafts.csswg.org/css-device-adapt/#zoom-desc
    */
  var zoom: js.UndefOr[ICSSRule | auto | Double | ICSSPercentageRule] = js.native
}

object IRawStyleBase {
  @scala.inline
  def apply(): IRawStyleBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRawStyleBase]
  }
  @scala.inline
  implicit class IRawStyleBaseOps[Self <: IRawStyleBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMozOsxFontSmoothing(value: none | antialiased | grayscale | `subpixel-antialiased`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozOsxFontSmoothing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozOsxFontSmoothing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MozOsxFontSmoothing")(js.undefined)
        ret
    }
    @scala.inline
    def withMsHighContrastAdjust(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MsHighContrastAdjust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsHighContrastAdjust: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MsHighContrastAdjust")(js.undefined)
        ret
    }
    @scala.inline
    def withMsOverflowStyle(value: auto | none | scrollbar | `-ms-autohiding-scrollbar`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MsOverflowStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsOverflowStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MsOverflowStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withWebkitBackdropFilter(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitBackdropFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebkitBackdropFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitBackdropFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withWebkitFontSmoothing(value: none | antialiased | grayscale | `subpixel-antialiased`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitFontSmoothing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebkitFontSmoothing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitFontSmoothing")(js.undefined)
        ret
    }
    @scala.inline
    def withWebkitOverflowScrolling(value: auto | touch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitOverflowScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebkitOverflowScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitOverflowScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withWebkitTapHighlightColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitTapHighlightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebkitTapHighlightColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebkitTapHighlightColor")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignContent(value: ICSSRule | `flex-start` | `flex-end` | center | `space-between` | `space-around` | stretch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignContent")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignItems(value: ICSSRule | `flex-start` | `flex-end` | center | baseline | stretch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignSelf(
      value: ICSSRule | auto | normal | stretch | ICSSBaselinePositionRule | ICSSOverflowAndSelfPositionRule
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignSelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignSelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignSelf")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignmentAdjust(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignmentAdjust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignmentAdjust: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignmentAdjust")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignmentBaseline(value: ICSSRule | String): Self = {
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
    def withAnimation(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDelay(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDirection(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDuration(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationFillMode(value: ICSSRule | none | forwards | backwards | both): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationFillMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationFillMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationFillMode")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationIterationCount(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationIterationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationIterationCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationIterationCount")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationName(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationName")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationPlayState(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationPlayState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationPlayState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationPlayState")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationTimingFunction(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationTimingFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationTimingFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationTimingFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withAppearance(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppearance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appearance")(js.undefined)
        ret
    }
    @scala.inline
    def withBackdropFilter(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withBackfaceVisibility(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backfaceVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackfaceVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backfaceVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundAttachment(value: ICSSRule | scroll | fixed | local): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundAttachment")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundBlendMode(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundBlendMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundBlendMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundBlendMode")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundClip(value: ICSSRule | `border-box` | `padding-box` | `content-box` | text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundClip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundClip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundClip")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundComposite(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundComposite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundComposite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundComposite")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundImage(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImage")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundOrigin(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundPosition(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundRepeat(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundRepeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundRepeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundRepeat")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundSize(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: ICSSRule | `0` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBottom(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBottomColor(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottomColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBottomLeftRadius(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomLeftRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottomLeftRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomLeftRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBottomRightRadius(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomRightRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottomRightRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomRightRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBottomStyle(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottomStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBottomWidth(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottomWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottomWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderCollapse(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderCollapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColor(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderCornerShape(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderCornerShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderCornerShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderCornerShape")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderImageSource(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderImageSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderImageSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderImageSource")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderImageWidth(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderImageWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderImageWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderImageWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderLeft(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderLeftColor(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderLeftColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderLeftStyle(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderLeftStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderLeftWidth(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderLeftWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeftWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRadius(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRight(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRight")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRightColor(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRightColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRightStyle(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRightStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRightWidth(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRightWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRightWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderSpacing(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderStyle(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderTop(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTop")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderTopColor(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTopColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderTopLeftRadius(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopLeftRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTopLeftRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopLeftRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderTopRightRadius(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopRightRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTopRightRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopRightRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderTopStyle(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTopStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderTopWidth(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTopWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTopWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidth(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBottom(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxDecorationBreak(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxDecorationBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxDecorationBreak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxDecorationBreak")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxShadow(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxSizing(value: ICSSRule | `border-box` | `content-box`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxSizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxSizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxSizing")(js.undefined)
        ret
    }
    @scala.inline
    def withBreakAfter(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withBreakBefore(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withBreakInside(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakInside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakInside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakInside")(js.undefined)
        ret
    }
    @scala.inline
    def withClear(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
    @scala.inline
    def withClipRule(value: ICSSRule | String): Self = {
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
    def withColor(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnCount(value: ICSSRule | Double | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCount")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnFill(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFill")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnGap(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnGap")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnRule(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnRule")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnRuleColor(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnRuleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnRuleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnRuleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnRuleWidth(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnRuleWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnRuleWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnRuleWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSpan(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnWidth(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withCounterIncrement(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counterIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounterIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counterIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withCounterReset(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counterReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounterReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counterReset")(js.undefined)
        ret
    }
    @scala.inline
    def withCue(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cue")(js.undefined)
        ret
    }
    @scala.inline
    def withCueAfter(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cueAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCueAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cueAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(value: ICSSRule | ICSSDisplayRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: ICSSRule | String): Self = {
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
    def withFillOpacity(value: ICSSRule | Double): Self = {
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
    def withFillRule(value: ICSSRule | String): Self = {
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
    def withFilter(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFlex(value: ICSSRule | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexBasis(value: ICSSRule | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexBasis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexBasis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexBasis")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexDirection(value: ICSSRule | row | `row-reverse` | column | `column-reverse`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexFlow(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexFlow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexFlow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexFlow")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexGrow(value: ICSSRule | Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexGrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexGrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexGrow")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexShrink(value: ICSSRule | Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexShrink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexShrink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexShrink")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexWrap(value: ICSSRule | nowrap | wrap | `wrap-reverse`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withFloat(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(js.undefined)
        ret
    }
    @scala.inline
    def withFlowFrom(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withGridArea(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridArea")(js.undefined)
        ret
    }
    @scala.inline
    def withGridAutoColumns(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridAutoColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withGridAutoFlow(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoFlow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridAutoFlow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoFlow")(js.undefined)
        ret
    }
    @scala.inline
    def withGridAutoRows(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridAutoRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoRows")(js.undefined)
        ret
    }
    @scala.inline
    def withGridColumn(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withGridColumnEnd(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumnEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridColumnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumnEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withGridColumnGap(value: ICSSRule | String): Self = {
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
    def withGridColumnStart(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumnStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridColumnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumnStart")(js.undefined)
        ret
    }
    @scala.inline
    def withGridGap(value: ICSSRule | String): Self = {
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
    def withGridRow(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRow")(js.undefined)
        ret
    }
    @scala.inline
    def withGridRowEnd(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRowEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridRowEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRowEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withGridRowGap(value: ICSSRule | String): Self = {
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
    def withGridRowPosition(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRowPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridRowPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRowPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withGridRowStart(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRowStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridRowStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRowStart")(js.undefined)
        ret
    }
    @scala.inline
    def withGridTemplate(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withGridTemplateAreas(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateAreas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridTemplateAreas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateAreas")(js.undefined)
        ret
    }
    @scala.inline
    def withGridTemplateColumns(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridTemplateColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withGridTemplateRows(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridTemplateRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateRows")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHyphenateLimitChars(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyphenateLimitChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyphenateLimitChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyphenateLimitChars")(js.undefined)
        ret
    }
    @scala.inline
    def withHyphenateLimitLines(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyphenateLimitLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyphenateLimitLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyphenateLimitLines")(js.undefined)
        ret
    }
    @scala.inline
    def withHyphenateLimitZone(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyphenateLimitZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyphenateLimitZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyphenateLimitZone")(js.undefined)
        ret
    }
    @scala.inline
    def withHyphens(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyphens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyphens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyphens")(js.undefined)
        ret
    }
    @scala.inline
    def withJustifyContent(
      value: ICSSRule | `flex-start` | `flex-end` | center | `space-between` | `space-around` | `space-evenly` | stretch
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJustifyContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyContent")(js.undefined)
        ret
    }
    @scala.inline
    def withJustifySelf(
      value: ICSSRule | auto | normal | stretch | ICSSBaselinePositionRule | ICSSOverflowAndSelfPositionRule | left | right | (`safe left`) | (`safe right`) | (`unsafe left`) | (`unsafe right`)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifySelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJustifySelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifySelf")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withLetterSpacing(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLetterSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withLineHeight(value: ICSSRule | normal | ICSSPixelUnitRule | ICSSPercentageRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withListStyle(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withListStyleImage(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyleImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListStyleImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyleImage")(js.undefined)
        ret
    }
    @scala.inline
    def withListStylePosition(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStylePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListStylePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStylePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withListStyleType(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListStyleType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listStyleType")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginBottom(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginLeft(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginRight(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginTop(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(js.undefined)
        ret
    }
    @scala.inline
    def withMarqueeDirection(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marqueeDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarqueeDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marqueeDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withMarqueeStyle(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marqueeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarqueeStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marqueeStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskBorder(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskBorderRepeat(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskBorderRepeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskBorderRepeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskBorderRepeat")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskBorderSlice(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskBorderSlice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskBorderSlice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskBorderSlice")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskBorderSource(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskBorderSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskBorderSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskBorderSource")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskBorderWidth(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskClip(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskClip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskClip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskClip")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskOrigin(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFontSize(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMixBlendMode(value: ICSSRule | IMixBlendModes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixBlendMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMixBlendMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixBlendMode")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectFit(value: ICSSRule | cover | contain | fill | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectFit")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: ICSSRule | Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: ICSSRule | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withOrphans(value: ICSSRule | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orphans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrphans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orphans")(js.undefined)
        ret
    }
    @scala.inline
    def withOutline(value: ICSSRule | `0` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineColor(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineOffset(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflow(value: ICSSRule | auto | hidden | scroll | visible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowStyle(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowWrap(value: ICSSRule | normal | `break-word`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowX(value: ICSSRule | auto | hidden | scroll | visible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowX")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowY(value: ICSSRule | auto | hidden | scroll | visible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowY")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingBlockEnd(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBlockEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingBlockEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBlockEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingBlockStart(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBlockStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingBlockStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBlockStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingBottom(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingInlineEnd(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingInlineEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingInlineEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingInlineEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingInlineStart(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingInlineStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingInlineStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingInlineStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingLeft(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingRight(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRight")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingTop(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTop")(js.undefined)
        ret
    }
    @scala.inline
    def withPageBreakAfter(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBreakAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageBreakAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBreakAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withPageBreakBefore(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBreakBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageBreakBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBreakBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withPageBreakInside(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBreakInside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageBreakInside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBreakInside")(js.undefined)
        ret
    }
    @scala.inline
    def withPause(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseAfter(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseBefore(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withPerspective(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perspective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerspective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perspective")(js.undefined)
        ret
    }
    @scala.inline
    def withPerspectiveOrigin(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perspectiveOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerspectiveOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perspectiveOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerEvents(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: ICSSRule | static | relative | absolute | fixed | sticky): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotes(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotes")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionFragment(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionFragment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionFragment")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: ICSSRule | none | both | horizontal | vertical | block | `inline`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withRestAfter(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withRestBefore(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeImageThreshold(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeImageThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeImageThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeImageThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeInside(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeInside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeInside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeInside")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeMargin(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeOutside(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeOutside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeOutside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeOutside")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeak(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speak")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeakAs(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speakAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeakAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speakAs")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: ICSSRule | String): Self = {
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
    def withStrokeLinecap(value: ICSSRule | butt | round | square): Self = {
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
    def withStrokeOpacity(value: ICSSRule | Double): Self = {
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
    def withStrokeWidth(value: ICSSRule | ICSSPixelUnitRule): Self = {
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
    def withTabSize(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTableLayout(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlign(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlignLast(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlignLast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlignLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlignLast")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDecoration(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecoration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDecoration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecoration")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDecorationColor(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecorationColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDecorationColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecorationColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDecorationLine(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecorationLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDecorationLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecorationLine")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDecorationSkip(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecorationSkip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDecorationSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecorationSkip")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDecorationStyle(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecorationStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDecorationStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecorationStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTextEmphasis(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEmphasis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextEmphasis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEmphasis")(js.undefined)
        ret
    }
    @scala.inline
    def withTextEmphasisColor(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEmphasisColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextEmphasisColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEmphasisColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextEmphasisStyle(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEmphasisStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextEmphasisStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEmphasisStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTextHeight(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTextIndent(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withTextOverflow(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withTextOverline(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextOverline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverline")(js.undefined)
        ret
    }
    @scala.inline
    def withTextOverlineColor(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextOverlineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverlineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextOverlineMode(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverlineMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextOverlineMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverlineMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTextOverlineStyle(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverlineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextOverlineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverlineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTextOverlineWidth(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverlineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextOverlineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverlineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTextRendering(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withTextShadow(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withTextTransform(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withTextUnderlinePosition(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textUnderlinePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextUnderlinePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textUnderlinePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTextUnderlineStyle(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textUnderlineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextUnderlineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textUnderlineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: ICSSRule | ICSSPixelUnitRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchAction(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchAction")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformOrigin(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformOriginZ(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformOriginZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformOriginZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformOriginZ")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformStyle(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDelay(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDuration(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionProperty(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionTimingFunction(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionTimingFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionTimingFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionTimingFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withUnicodeBidi(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicodeBidi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnicodeBidi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicodeBidi")(js.undefined)
        ret
    }
    @scala.inline
    def withUserFocus(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withUserInput(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInput")(js.undefined)
        ret
    }
    @scala.inline
    def withUserSelect(value: ICSSRule | none | auto | text | all | contain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlign(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
    @scala.inline
    def withVoiceBalance(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceBalance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceBalance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceBalance")(js.undefined)
        ret
    }
    @scala.inline
    def withVoiceDuration(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withVoiceFamily(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withVoicePitch(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voicePitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoicePitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voicePitch")(js.undefined)
        ret
    }
    @scala.inline
    def withVoiceRange(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceRange")(js.undefined)
        ret
    }
    @scala.inline
    def withVoiceRate(value: ICSSRule | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceRate")(js.undefined)
        ret
    }
  }
  
}

