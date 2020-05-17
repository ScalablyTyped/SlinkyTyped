package typingsSlinky.themeUiComponents.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import typingsSlinky.csstype.mod.GlobalsNumber
import typingsSlinky.emotionCore.mod.InterpolationWithTheme
import typingsSlinky.emotionSerialize.mod.Interpolation
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.AnimationEventHandler
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ClipboardEventHandler
import typingsSlinky.react.mod.CompositionEventHandler
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.mod.DragEventHandler
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.PointerEventHandler
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.react.mod.TransitionEventHandler
import typingsSlinky.react.mod.UIEventHandler
import typingsSlinky.react.mod.WheelEventHandler
import typingsSlinky.styledSystem.mod.RequiredTheme
import typingsSlinky.styledSystem.mod.ResponsiveValue
import typingsSlinky.styledSystem.mod.ThemeValue
import typingsSlinky.themeUiComponents.themeUiComponentsStrings._empty
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.`additions text`
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.`after-edge`
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.`before-edge`
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.`inline`
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.`text-after-edge`
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.`text-before-edge`
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.`use-credentials`
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.additions
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.all
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.alphabetic
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.anonymous
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.ascending
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.assertive
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.auto
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.baseline
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.bevel
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.both
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.butt
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.central
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.colors
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.copy
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.date
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.descending
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.dialog
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.evenodd
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.execute
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.grammar
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.grid
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.hanging
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.horizontal
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.ideographic
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.inherit
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.initial
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.isolated
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.linearRGB
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.link
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.list
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.listbox
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.location
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.mathematical
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.medial
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.menu
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.middle
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.miter
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.mixed
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.move
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.no
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.none
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.nonzero
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.off
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.other
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.page
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.polite
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.popup
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.removals
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.replace
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.round
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.sRGB
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.space
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.spelling
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.square
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.step
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.sum
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.terminal
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.text
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.time
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.tree
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.vertical
import typingsSlinky.themeUiComponents.themeUiComponentsStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @theme-ui/components.@theme-ui/components.Omit<react.react.SVGProps<std.SVGSVGElement>, 'opacity' | 'color' | 'css' | 'sx' | 'max' | 'min'> */
/* Inlined parent @theme-ui/components.@theme-ui/components.BoxOwnProps */
@js.native
trait DonutProps extends js.Object {
  var accentHeight: js.UndefOr[Double | String] = js.native
  var accumulate: js.UndefOr[none | sum] = js.native
  var additive: js.UndefOr[replace | sum] = js.native
  var alignmentBaseline: js.UndefOr[
    auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
  ] = js.native
  var allowReorder: js.UndefOr[no | yes] = js.native
  var alphabetic: js.UndefOr[Double | String] = js.native
  var amplitude: js.UndefOr[Double | String] = js.native
  var arabicForm: js.UndefOr[initial | medial | terminal | isolated] = js.native
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
  var `aria-busy`: js.UndefOr[Boolean] = js.native
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-colcount`: js.UndefOr[Double] = js.native
  var `aria-colindex`: js.UndefOr[Double] = js.native
  var `aria-colspan`: js.UndefOr[Double] = js.native
  var `aria-controls`: js.UndefOr[String] = js.native
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  var `aria-describedby`: js.UndefOr[String] = js.native
  var `aria-details`: js.UndefOr[String] = js.native
  var `aria-disabled`: js.UndefOr[Boolean] = js.native
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  var `aria-errormessage`: js.UndefOr[String] = js.native
  var `aria-expanded`: js.UndefOr[Boolean] = js.native
  var `aria-flowto`: js.UndefOr[String] = js.native
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  var `aria-hidden`: js.UndefOr[Boolean] = js.native
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  var `aria-label`: js.UndefOr[String] = js.native
  var `aria-labelledby`: js.UndefOr[String] = js.native
  var `aria-level`: js.UndefOr[Double] = js.native
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  var `aria-modal`: js.UndefOr[Boolean] = js.native
  var `aria-multiline`: js.UndefOr[Boolean] = js.native
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  var `aria-owns`: js.UndefOr[String] = js.native
  var `aria-placeholder`: js.UndefOr[String] = js.native
  var `aria-posinset`: js.UndefOr[Double] = js.native
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  var `aria-required`: js.UndefOr[Boolean] = js.native
  var `aria-roledescription`: js.UndefOr[String] = js.native
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  var `aria-selected`: js.UndefOr[Boolean] = js.native
  var `aria-setsize`: js.UndefOr[Double] = js.native
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  var `aria-valuetext`: js.UndefOr[String] = js.native
  var as: js.UndefOr[ReactElement] = js.native
  var ascent: js.UndefOr[Double | String] = js.native
  var attributeName: js.UndefOr[String] = js.native
  var attributeType: js.UndefOr[String] = js.native
  var autoReverse: js.UndefOr[Booleanish] = js.native
  var azimuth: js.UndefOr[Double | String] = js.native
  var backgroundColor: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.native
  var baseFrequency: js.UndefOr[Double | String] = js.native
  var baseProfile: js.UndefOr[Double | String] = js.native
  var baselineShift: js.UndefOr[Double | String] = js.native
  var bbox: js.UndefOr[Double | String] = js.native
  var begin: js.UndefOr[Double | String] = js.native
  /**
    * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
    * By default the raw value of the prop is returned.
    *
    * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
    * Array values are converted into responsive values.
    *
    * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-color)
    */
  var bg: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.native
  var bias: js.UndefOr[Double | String] = js.native
  var by: js.UndefOr[Double | String] = js.native
  var calcMode: js.UndefOr[Double | String] = js.native
  var capHeight: js.UndefOr[Double | String] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  var className: js.UndefOr[String] = js.native
  var clip: js.UndefOr[Double | String] = js.native
  var clipPath: js.UndefOr[String] = js.native
  var clipPathUnits: js.UndefOr[Double | String] = js.native
  var clipRule: js.UndefOr[Double | String] = js.native
  /**
    * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
    * By default the raw value of the prop is returned.
    *
    * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
    * Array values are converted into responsive values.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/color)
    */
  var color: js.UndefOr[ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]] = js.native
  var colorInterpolation: js.UndefOr[Double | String] = js.native
  var colorInterpolationFilters: js.UndefOr[auto | sRGB | linearRGB | inherit] = js.native
  var colorProfile: js.UndefOr[Double | String] = js.native
  var colorRendering: js.UndefOr[Double | String] = js.native
  var contentScriptType: js.UndefOr[Double | String] = js.native
  var contentStyleType: js.UndefOr[Double | String] = js.native
  var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.native
  var css: js.UndefOr[InterpolationWithTheme[_]] = js.native
  var cursor: js.UndefOr[Double | String] = js.native
  var cx: js.UndefOr[Double | String] = js.native
  var cy: js.UndefOr[Double | String] = js.native
  var d: js.UndefOr[String] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
  var decelerate: js.UndefOr[Double | String] = js.native
  var descent: js.UndefOr[Double | String] = js.native
  var diffuseConstant: js.UndefOr[Double | String] = js.native
  var direction: js.UndefOr[Double | String] = js.native
  var display: js.UndefOr[Double | String] = js.native
  var divisor: js.UndefOr[Double | String] = js.native
  var dominantBaseline: js.UndefOr[Double | String] = js.native
  var dur: js.UndefOr[Double | String] = js.native
  var dx: js.UndefOr[Double | String] = js.native
  var dy: js.UndefOr[Double | String] = js.native
  var edgeMode: js.UndefOr[Double | String] = js.native
  var elevation: js.UndefOr[Double | String] = js.native
  var enableBackground: js.UndefOr[Double | String] = js.native
  var end: js.UndefOr[Double | String] = js.native
  var exponent: js.UndefOr[Double | String] = js.native
  var externalResourcesRequired: js.UndefOr[Booleanish] = js.native
  var fill: js.UndefOr[String] = js.native
  var fillOpacity: js.UndefOr[Double | String] = js.native
  var fillRule: js.UndefOr[nonzero | evenodd | inherit] = js.native
  var filter: js.UndefOr[String] = js.native
  var filterRes: js.UndefOr[Double | String] = js.native
  var filterUnits: js.UndefOr[Double | String] = js.native
  var floodColor: js.UndefOr[Double | String] = js.native
  var floodOpacity: js.UndefOr[Double | String] = js.native
  var focusable: js.UndefOr[Booleanish | auto] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double | String] = js.native
  var fontSizeAdjust: js.UndefOr[Double | String] = js.native
  var fontStretch: js.UndefOr[Double | String] = js.native
  var fontStyle: js.UndefOr[Double | String] = js.native
  var fontVariant: js.UndefOr[Double | String] = js.native
  var fontWeight: js.UndefOr[Double | String] = js.native
  var format: js.UndefOr[Double | String] = js.native
  var from: js.UndefOr[Double | String] = js.native
  var fx: js.UndefOr[Double | String] = js.native
  var fy: js.UndefOr[Double | String] = js.native
  var g1: js.UndefOr[Double | String] = js.native
  var g2: js.UndefOr[Double | String] = js.native
  var glyphName: js.UndefOr[Double | String] = js.native
  var glyphOrientationHorizontal: js.UndefOr[Double | String] = js.native
  var glyphOrientationVertical: js.UndefOr[Double | String] = js.native
  var glyphRef: js.UndefOr[Double | String] = js.native
  var gradientTransform: js.UndefOr[String] = js.native
  var gradientUnits: js.UndefOr[String] = js.native
  var hanging: js.UndefOr[Double | String] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var horizAdvX: js.UndefOr[Double | String] = js.native
  var horizOriginX: js.UndefOr[Double | String] = js.native
  var href: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var ideographic: js.UndefOr[Double | String] = js.native
  var imageRendering: js.UndefOr[Double | String] = js.native
  var in: js.UndefOr[String] = js.native
  var in2: js.UndefOr[Double | String] = js.native
  var intercept: js.UndefOr[Double | String] = js.native
  var k: js.UndefOr[Double | String] = js.native
  var k1: js.UndefOr[Double | String] = js.native
  var k2: js.UndefOr[Double | String] = js.native
  var k3: js.UndefOr[Double | String] = js.native
  var k4: js.UndefOr[Double | String] = js.native
  var kernelMatrix: js.UndefOr[Double | String] = js.native
  var kernelUnitLength: js.UndefOr[Double | String] = js.native
  var kerning: js.UndefOr[Double | String] = js.native
  var key: js.UndefOr[Key] = js.native
  var keyPoints: js.UndefOr[Double | String] = js.native
  var keySplines: js.UndefOr[Double | String] = js.native
  var keyTimes: js.UndefOr[Double | String] = js.native
  var lang: js.UndefOr[String] = js.native
  var lengthAdjust: js.UndefOr[Double | String] = js.native
  var letterSpacing: js.UndefOr[Double | String] = js.native
  var lightingColor: js.UndefOr[Double | String] = js.native
  var limitingConeAngle: js.UndefOr[Double | String] = js.native
  var local: js.UndefOr[Double | String] = js.native
  /** Margin on top, left, bottom and right */
  var m: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on top, left, bottom and right */
  var margin: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on bottom */
  var marginBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on left */
  var marginLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on right */
  var marginRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on top */
  var marginTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on left and right */
  var marginX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on top and bottom */
  var marginY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  var markerEnd: js.UndefOr[String] = js.native
  var markerHeight: js.UndefOr[Double | String] = js.native
  var markerMid: js.UndefOr[String] = js.native
  var markerStart: js.UndefOr[String] = js.native
  var markerUnits: js.UndefOr[Double | String] = js.native
  var markerWidth: js.UndefOr[Double | String] = js.native
  var mask: js.UndefOr[String] = js.native
  var maskContentUnits: js.UndefOr[Double | String] = js.native
  var maskUnits: js.UndefOr[Double | String] = js.native
  var mathematical: js.UndefOr[Double | String] = js.native
  var max: js.UndefOr[Double] = js.native
  /** Margin on bottom */
  var mb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  var media: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  var min: js.UndefOr[Double] = js.native
  /** Margin on left */
  var ml: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  var mode: js.UndefOr[Double | String] = js.native
  /** Margin on right */
  var mr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on top */
  var mt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on left and right */
  var mx: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Margin on top and bottom */
  var my: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  var name: js.UndefOr[String] = js.native
  var numOctaves: js.UndefOr[Double | String] = js.native
  var offset: js.UndefOr[Double | String] = js.native
  var onAbort: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.native
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.native
  var onAnimationStart: js.UndefOr[AnimationEventHandler[SVGSVGElement]] = js.native
  var onAuxClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  var onBeforeInput: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[SVGSVGElement]] = js.native
  var onCanPlay: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onChange: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
  var onClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.native
  var onCompositionStart: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.native
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[SVGSVGElement]] = js.native
  var onContextMenu: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  var onCopy: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.native
  var onCut: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.native
  var onDoubleClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  var onDrag: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
  var onDragEnd: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
  var onDragEnter: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
  var onDragExit: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
  var onDragLeave: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
  var onDragOver: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
  var onDragStart: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
  var onDrop: js.UndefOr[DragEventHandler[SVGSVGElement]] = js.native
  var onDurationChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onEmptied: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onEncrypted: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onEnded: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onError: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[SVGSVGElement]] = js.native
  var onInput: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
  var onInvalid: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[SVGSVGElement]] = js.native
  var onLoad: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onLoadStart: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onLoadedData: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onMouseDown: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  var onMouseMove: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  var onMouseOut: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  var onMouseOver: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  var onMouseUp: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
  var onPaste: js.UndefOr[ClipboardEventHandler[SVGSVGElement]] = js.native
  var onPause: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onPlay: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onPlaying: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onPointerCancel: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
  var onPointerDown: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
  var onPointerEnter: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
  var onPointerLeave: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
  var onPointerMove: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
  var onPointerOut: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
  var onPointerOver: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
  var onPointerUp: js.UndefOr[PointerEventHandler[SVGSVGElement]] = js.native
  var onProgress: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onRateChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onReset: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
  var onScroll: js.UndefOr[UIEventHandler[SVGSVGElement]] = js.native
  var onSeeked: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onSeeking: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onSelect: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onStalled: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onSubmit: js.UndefOr[FormEventHandler[SVGSVGElement]] = js.native
  var onSuspend: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onTimeUpdate: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onTouchCancel: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.native
  var onTouchEnd: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.native
  var onTouchMove: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[SVGSVGElement]] = js.native
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[SVGSVGElement]] = js.native
  var onVolumeChange: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onWaiting: js.UndefOr[ReactEventHandler[SVGSVGElement]] = js.native
  var onWheel: js.UndefOr[WheelEventHandler[SVGSVGElement]] = js.native
  /**
    * The opacity CSS property sets the transparency of an element or the degree to which content
    * behind an element is visible.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/opacity)
    */
  var opacity: js.UndefOr[ResponsiveValue[GlobalsNumber, RequiredTheme]] = js.native
  var operator: js.UndefOr[Double | String] = js.native
  var order: js.UndefOr[Double | String] = js.native
  var orient: js.UndefOr[Double | String] = js.native
  var orientation: js.UndefOr[Double | String] = js.native
  var origin: js.UndefOr[Double | String] = js.native
  var overflow: js.UndefOr[Double | String] = js.native
  var overlinePosition: js.UndefOr[Double | String] = js.native
  var overlineThickness: js.UndefOr[Double | String] = js.native
  /** Padding on top, left, bottom and right */
  var p: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on top, left, bottom and right */
  var padding: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on bottom */
  var paddingBottom: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on left */
  var paddingLeft: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on right */
  var paddingRight: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on top */
  var paddingTop: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on left and right */
  var paddingX: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on top and bottom */
  var paddingY: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  var paintOrder: js.UndefOr[Double | String] = js.native
  var panose1: js.UndefOr[Double | String] = js.native
  var path: js.UndefOr[String] = js.native
  var pathLength: js.UndefOr[Double | String] = js.native
  var patternContentUnits: js.UndefOr[String] = js.native
  var patternTransform: js.UndefOr[Double | String] = js.native
  var patternUnits: js.UndefOr[String] = js.native
  /** Padding on bottom */
  var pb: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on left */
  var pl: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  var pointerEvents: js.UndefOr[Double | String] = js.native
  var points: js.UndefOr[String] = js.native
  var pointsAtX: js.UndefOr[Double | String] = js.native
  var pointsAtY: js.UndefOr[Double | String] = js.native
  var pointsAtZ: js.UndefOr[Double | String] = js.native
  /** Padding on right */
  var pr: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  var preserveAlpha: js.UndefOr[Booleanish] = js.native
  var preserveAspectRatio: js.UndefOr[String] = js.native
  var primitiveUnits: js.UndefOr[Double | String] = js.native
  /** Padding on top */
  var pt: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on left and right */
  var px: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  /** Padding on top and bottom */
  var py: js.UndefOr[ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]] = js.native
  var r: js.UndefOr[Double | String] = js.native
  var radius: js.UndefOr[Double | String] = js.native
  var ref: js.UndefOr[LegacyRef[SVGSVGElement]] = js.native
  var refX: js.UndefOr[Double | String] = js.native
  var refY: js.UndefOr[Double | String] = js.native
  var renderingIntent: js.UndefOr[Double | String] = js.native
  var repeatCount: js.UndefOr[Double | String] = js.native
  var repeatDur: js.UndefOr[Double | String] = js.native
  var requiredExtensions: js.UndefOr[Double | String] = js.native
  var requiredFeatures: js.UndefOr[Double | String] = js.native
  var restart: js.UndefOr[Double | String] = js.native
  var result: js.UndefOr[String] = js.native
  var role: js.UndefOr[String] = js.native
  var rotate: js.UndefOr[Double | String] = js.native
  var rx: js.UndefOr[Double | String] = js.native
  var ry: js.UndefOr[Double | String] = js.native
  var scale: js.UndefOr[Double | String] = js.native
  var seed: js.UndefOr[Double | String] = js.native
  var shapeRendering: js.UndefOr[Double | String] = js.native
  var size: js.UndefOr[String | Double] = js.native
  var slope: js.UndefOr[Double | String] = js.native
  var spacing: js.UndefOr[Double | String] = js.native
  var specularConstant: js.UndefOr[Double | String] = js.native
  var specularExponent: js.UndefOr[Double | String] = js.native
  var speed: js.UndefOr[Double | String] = js.native
  var spreadMethod: js.UndefOr[String] = js.native
  var startOffset: js.UndefOr[Double | String] = js.native
  var stdDeviation: js.UndefOr[Double | String] = js.native
  var stemh: js.UndefOr[Double | String] = js.native
  var stemv: js.UndefOr[Double | String] = js.native
  var stitchTiles: js.UndefOr[Double | String] = js.native
  var stopColor: js.UndefOr[String] = js.native
  var stopOpacity: js.UndefOr[Double | String] = js.native
  var strikethroughPosition: js.UndefOr[Double | String] = js.native
  var strikethroughThickness: js.UndefOr[Double | String] = js.native
  var string: js.UndefOr[Double | String] = js.native
  var stroke: js.UndefOr[String] = js.native
  var strokeDasharray: js.UndefOr[String | Double] = js.native
  var strokeDashoffset: js.UndefOr[String | Double] = js.native
  var strokeLinecap: js.UndefOr[butt | round | square | inherit] = js.native
  var strokeLinejoin: js.UndefOr[miter | round | bevel | inherit] = js.native
  var strokeMiterlimit: js.UndefOr[Double | String] = js.native
  var strokeOpacity: js.UndefOr[Double | String] = js.native
  var strokeWidth: js.UndefOr[Double | String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var surfaceScale: js.UndefOr[Double | String] = js.native
  var sx: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SxStyleProp */ js.Any
  ] = js.native
  var systemLanguage: js.UndefOr[Double | String] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var tableValues: js.UndefOr[Double | String] = js.native
  var target: js.UndefOr[String] = js.native
  var targetX: js.UndefOr[Double | String] = js.native
  var targetY: js.UndefOr[Double | String] = js.native
  var textAnchor: js.UndefOr[String] = js.native
  var textDecoration: js.UndefOr[Double | String] = js.native
  var textLength: js.UndefOr[Double | String] = js.native
  var textRendering: js.UndefOr[Double | String] = js.native
  var title: js.UndefOr[String] = js.native
  var to: js.UndefOr[Double | String] = js.native
  var transform: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var u1: js.UndefOr[Double | String] = js.native
  var u2: js.UndefOr[Double | String] = js.native
  var underlinePosition: js.UndefOr[Double | String] = js.native
  var underlineThickness: js.UndefOr[Double | String] = js.native
  var unicode: js.UndefOr[Double | String] = js.native
  var unicodeBidi: js.UndefOr[Double | String] = js.native
  var unicodeRange: js.UndefOr[Double | String] = js.native
  var unitsPerEm: js.UndefOr[Double | String] = js.native
  var vAlphabetic: js.UndefOr[Double | String] = js.native
  var vHanging: js.UndefOr[Double | String] = js.native
  var vIdeographic: js.UndefOr[Double | String] = js.native
  var vMathematical: js.UndefOr[Double | String] = js.native
  var value: Double = js.native
  var values: js.UndefOr[String] = js.native
  var variant: js.UndefOr[String] = js.native
  var vectorEffect: js.UndefOr[Double | String] = js.native
  var version: js.UndefOr[String] = js.native
  var vertAdvY: js.UndefOr[Double | String] = js.native
  var vertOriginX: js.UndefOr[Double | String] = js.native
  var vertOriginY: js.UndefOr[Double | String] = js.native
  var viewBox: js.UndefOr[String] = js.native
  var viewTarget: js.UndefOr[Double | String] = js.native
  var visibility: js.UndefOr[Double | String] = js.native
  var width: js.UndefOr[Double | String] = js.native
  var widths: js.UndefOr[Double | String] = js.native
  var wordSpacing: js.UndefOr[Double | String] = js.native
  var writingMode: js.UndefOr[Double | String] = js.native
  var x: js.UndefOr[Double | String] = js.native
  var x1: js.UndefOr[Double | String] = js.native
  var x2: js.UndefOr[Double | String] = js.native
  var xChannelSelector: js.UndefOr[String] = js.native
  var xHeight: js.UndefOr[Double | String] = js.native
  var xlinkActuate: js.UndefOr[String] = js.native
  var xlinkArcrole: js.UndefOr[String] = js.native
  var xlinkHref: js.UndefOr[String] = js.native
  var xlinkRole: js.UndefOr[String] = js.native
  var xlinkShow: js.UndefOr[String] = js.native
  var xlinkTitle: js.UndefOr[String] = js.native
  var xlinkType: js.UndefOr[String] = js.native
  var xmlBase: js.UndefOr[String] = js.native
  var xmlLang: js.UndefOr[String] = js.native
  var xmlSpace: js.UndefOr[String] = js.native
  var xmlns: js.UndefOr[String] = js.native
  var xmlnsXlink: js.UndefOr[String] = js.native
  var y: js.UndefOr[Double | String] = js.native
  var y1: js.UndefOr[Double | String] = js.native
  var y2: js.UndefOr[Double | String] = js.native
  var yChannelSelector: js.UndefOr[String] = js.native
  var z: js.UndefOr[Double | String] = js.native
  var zoomAndPan: js.UndefOr[String] = js.native
}

object DonutProps {
  @scala.inline
  def apply(value: Double): DonutProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DonutProps]
  }
  @scala.inline
  implicit class DonutPropsOps[Self <: DonutProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccentHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccentHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withAccumulate(value: none | sum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accumulate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccumulate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accumulate")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditive(value: replace | sum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additive")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignmentBaseline(
      value: auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
    ): Self = {
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
    def withAllowReorder(value: no | yes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowReorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReorder")(js.undefined)
        ret
    }
    @scala.inline
    def withAlphabetic(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphabetic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphabetic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphabetic")(js.undefined)
        ret
    }
    @scala.inline
    def withAmplitude(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amplitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmplitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amplitude")(js.undefined)
        ret
    }
    @scala.inline
    def withArabicForm(value: initial | medial | terminal | isolated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arabicForm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArabicForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arabicForm")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-activedescendant`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-activedescendant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-activedescendant`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-activedescendant")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-atomic`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-atomic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-atomic`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-atomic")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-autocomplete`(value: none | `inline` | list | both): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-autocomplete`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-autocomplete")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-busy`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-busy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-busy`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-busy")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-checked`(value: Boolean | mixed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-checked`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-checked")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-colcount`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colcount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-colcount`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colcount")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-colindex`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-colindex`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colindex")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-colspan`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colspan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-colspan`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-colspan")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-controls`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-controls`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-controls")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-current`(value: Boolean | page | step | location | date | time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-current`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-current")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-describedby`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-describedby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-describedby`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-describedby")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-details`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-details`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-details")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-disabled`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-disabled`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-disabled")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-dropeffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-dropeffect`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-dropeffect")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-errormessage`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-errormessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-errormessage`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-errormessage")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-expanded`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-expanded`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-expanded")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-flowto`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-flowto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-flowto`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-flowto")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-grabbed`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-grabbed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-grabbed`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-grabbed")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-haspopup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-haspopup`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-haspopup")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-hidden`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-hidden`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-hidden")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-invalid`(value: Boolean | grammar | spelling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-invalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-invalid`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-invalid")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-keyshortcuts`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-keyshortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-keyshortcuts`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-keyshortcuts")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-label`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-label`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-labelledby`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-labelledby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-labelledby`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-labelledby")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-level`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-level`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-level")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-live`(value: off | assertive | polite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-live")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-live`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-live")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-modal`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-modal`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-modal")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-multiline`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-multiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-multiline`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-multiline")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-multiselectable`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-multiselectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-multiselectable`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-multiselectable")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-orientation`(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-orientation`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-orientation")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-owns`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-owns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-owns`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-owns")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-placeholder`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-placeholder`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-posinset`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-posinset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-posinset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-posinset")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-pressed`(value: Boolean | mixed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-pressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-pressed`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-pressed")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-readonly`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-readonly`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-readonly")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-relevant`(value: additions | (`additions text`) | all | removals | text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-relevant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-relevant`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-relevant")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-required`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-required`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-required")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-roledescription`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-roledescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-roledescription`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-roledescription")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-rowcount`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowcount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-rowcount`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowcount")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-rowindex`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-rowindex`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowindex")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-rowspan`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowspan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-rowspan`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-rowspan")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-selected`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-selected`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-selected")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-setsize`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-setsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-setsize`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-setsize")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-sort`(value: none | ascending | descending | other): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-sort`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-sort")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-valuemax`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuemax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-valuemax`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuemax")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-valuemin`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuemin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-valuemin`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuemin")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-valuenow`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuenow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-valuenow`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuenow")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-valuetext`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuetext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAria-valuetext`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-valuetext")(js.undefined)
        ret
    }
    @scala.inline
    def withAsFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAs(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withAscent(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAscent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascent")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeName")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeType")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoReverse(value: Booleanish): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReverse")(js.undefined)
        ret
    }
    @scala.inline
    def withAzimuth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azimuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAzimuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azimuth")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = {
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
    def withBackgroundColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(null)
        ret
    }
    @scala.inline
    def withBaseFrequency(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFrequency")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseProfile(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withBaselineShift(value: Double | String): Self = {
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
    def withBbox(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(js.undefined)
        ret
    }
    @scala.inline
    def withBegin(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(js.undefined)
        ret
    }
    @scala.inline
    def withBg(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bg")(js.undefined)
        ret
    }
    @scala.inline
    def withBgNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bg")(null)
        ret
    }
    @scala.inline
    def withBias(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bias")(js.undefined)
        ret
    }
    @scala.inline
    def withBy(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("by")(js.undefined)
        ret
    }
    @scala.inline
    def withCalcMode(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calcMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalcMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calcMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCapHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClip(value: Double | String): Self = {
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
    def withClipPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipPath")(js.undefined)
        ret
    }
    @scala.inline
    def withClipPathUnits(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipPathUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipPathUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipPathUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withClipRule(value: Double | String): Self = {
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
    def withColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): Self = {
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
    def withColorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(null)
        ret
    }
    @scala.inline
    def withColorInterpolation(value: Double | String): Self = {
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
    def withColorInterpolationFilters(value: auto | sRGB | linearRGB | inherit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorInterpolationFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorInterpolationFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorInterpolationFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withColorProfile(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withColorRendering(value: Double | String): Self = {
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
    def withContentScriptType(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentScriptType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentScriptType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentScriptType")(js.undefined)
        ret
    }
    @scala.inline
    def withContentStyleType(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentStyleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentStyleType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentStyleType")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossOrigin(value: anonymous | `use-credentials` | _empty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withCssFunction1(value: _ => Interpolation[js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCss(value: InterpolationWithTheme[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withCssNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(null)
        ret
    }
    @scala.inline
    def withCursor(value: Double | String): Self = {
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
    def withCx(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cx")(js.undefined)
        ret
    }
    @scala.inline
    def withCy(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cy")(js.undefined)
        ret
    }
    @scala.inline
    def withD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(js.undefined)
        ret
    }
    @scala.inline
    def withDangerouslySetInnerHTML(value: Html): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerouslySetInnerHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDangerouslySetInnerHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerouslySetInnerHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withDecelerate(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decelerate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecelerate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decelerate")(js.undefined)
        ret
    }
    @scala.inline
    def withDescent(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descent")(js.undefined)
        ret
    }
    @scala.inline
    def withDiffuseConstant(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffuseConstant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiffuseConstant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffuseConstant")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: Double | String): Self = {
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
    def withDisplay(value: Double | String): Self = {
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
    def withDivisor(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divisor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivisor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divisor")(js.undefined)
        ret
    }
    @scala.inline
    def withDominantBaseline(value: Double | String): Self = {
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
    def withDur(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dur")(js.undefined)
        ret
    }
    @scala.inline
    def withDx(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dx")(js.undefined)
        ret
    }
    @scala.inline
    def withDy(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dy")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeMode(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withElevation(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElevation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elevation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableBackground(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withExponent(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponent")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalResourcesRequired(value: Booleanish): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalResourcesRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalResourcesRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalResourcesRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: String): Self = {
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
    def withFillOpacity(value: Double | String): Self = {
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
    def withFillRule(value: nonzero | evenodd | inherit): Self = {
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
    def withFilter(value: String): Self = {
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
    def withFilterRes(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterRes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterRes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterRes")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterUnits(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodColor(value: Double | String): Self = {
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
    def withFloodOpacity(value: Double | String): Self = {
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
    def withFocusable(value: Booleanish | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusable")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSizeAdjust(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizeAdjust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSizeAdjust: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizeAdjust")(js.undefined)
        ret
    }
    @scala.inline
    def withFontStretch(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStretch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStretch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStretch")(js.undefined)
        ret
    }
    @scala.inline
    def withFontStyle(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontVariant(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontVariant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontVariant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontVariant")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withFx(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fx")(js.undefined)
        ret
    }
    @scala.inline
    def withFy(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fy")(js.undefined)
        ret
    }
    @scala.inline
    def withG1(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutG1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g1")(js.undefined)
        ret
    }
    @scala.inline
    def withG2(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutG2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g2")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyphName(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphName")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyphOrientationHorizontal(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphOrientationHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphOrientationHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphOrientationHorizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyphOrientationVertical(value: Double | String): Self = {
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
    def withGlyphRef(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphRef")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientTransform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientUnits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withHanging(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hanging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hanging")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
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
    def withHorizAdvX(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizAdvX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizAdvX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizAdvX")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizOriginX(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizOriginX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizOriginX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizOriginX")(js.undefined)
        ret
    }
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIdeographic(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ideographic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdeographic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ideographic")(js.undefined)
        ret
    }
    @scala.inline
    def withImageRendering(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(js.undefined)
        ret
    }
    @scala.inline
    def withIn2(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIn2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in2")(js.undefined)
        ret
    }
    @scala.inline
    def withIntercept(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intercept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntercept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intercept")(js.undefined)
        ret
    }
    @scala.inline
    def withK(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutK: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k")(js.undefined)
        ret
    }
    @scala.inline
    def withK1(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutK1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k1")(js.undefined)
        ret
    }
    @scala.inline
    def withK2(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutK2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k2")(js.undefined)
        ret
    }
    @scala.inline
    def withK3(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutK3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k3")(js.undefined)
        ret
    }
    @scala.inline
    def withK4(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutK4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k4")(js.undefined)
        ret
    }
    @scala.inline
    def withKernelMatrix(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernelMatrix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelMatrix")(js.undefined)
        ret
    }
    @scala.inline
    def withKernelUnitLength(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelUnitLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernelUnitLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelUnitLength")(js.undefined)
        ret
    }
    @scala.inline
    def withKerning(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kerning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKerning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kerning")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPoints(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withKeySplines(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySplines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeySplines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySplines")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyTimes(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyTimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyTimes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyTimes")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withLengthAdjust(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthAdjust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLengthAdjust: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengthAdjust")(js.undefined)
        ret
    }
    @scala.inline
    def withLetterSpacing(value: Double | String): Self = {
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
    def withLightingColor(value: Double | String): Self = {
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
    def withLimitingConeAngle(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitingConeAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitingConeAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitingConeAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(js.undefined)
        ret
    }
    @scala.inline
    def withM(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(js.undefined)
        ret
    }
    @scala.inline
    def withMNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(null)
        ret
    }
    @scala.inline
    def withMargin(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = {
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
    def withMarginNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(null)
        ret
    }
    @scala.inline
    def withMarginBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = {
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
    def withMarginBottomNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(null)
        ret
    }
    @scala.inline
    def withMarginLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = {
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
    def withMarginLeftNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(null)
        ret
    }
    @scala.inline
    def withMarginRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = {
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
    def withMarginRightNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(null)
        ret
    }
    @scala.inline
    def withMarginTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = {
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
    def withMarginTopNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(null)
        ret
    }
    @scala.inline
    def withMarginX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginX")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginXNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginX")(null)
        ret
    }
    @scala.inline
    def withMarginY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginY")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginYNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginY")(null)
        ret
    }
    @scala.inline
    def withMarkerEnd(value: String): Self = {
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
    def withMarkerHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerMid(value: String): Self = {
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
    def withMarkerStart(value: String): Self = {
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
    def withMarkerUnits(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: String): Self = {
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
    def withMaskContentUnits(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskContentUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskContentUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskContentUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskUnits(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withMathematical(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mathematical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMathematical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mathematical")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mb")(js.undefined)
        ret
    }
    @scala.inline
    def withMbNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mb")(null)
        ret
    }
    @scala.inline
    def withMedia(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withMl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ml")(js.undefined)
        ret
    }
    @scala.inline
    def withMlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ml")(null)
        ret
    }
    @scala.inline
    def withMode(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withMr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mr")(js.undefined)
        ret
    }
    @scala.inline
    def withMrNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mr")(null)
        ret
    }
    @scala.inline
    def withMt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mt")(js.undefined)
        ret
    }
    @scala.inline
    def withMtNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mt")(null)
        ret
    }
    @scala.inline
    def withMx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mx")(js.undefined)
        ret
    }
    @scala.inline
    def withMxNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mx")(null)
        ret
    }
    @scala.inline
    def withMy(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("my")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("my")(js.undefined)
        ret
    }
    @scala.inline
    def withMyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("my")(null)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNumOctaves(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numOctaves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumOctaves: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numOctaves")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAbort(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationEnd(value: SyntheticAnimationEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationIteration(value: SyntheticAnimationEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationIteration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationIteration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationIteration")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationStart(value: SyntheticAnimationEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAnimationStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAuxClick(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuxClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAuxClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuxClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeInput(value: SyntheticEvent[EventTarget with SVGSVGElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: SyntheticFocusEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlay(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCanPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlayThrough(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCanPlayThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThrough")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: SyntheticEvent[EventTarget with SVGSVGElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionEnd(value: SyntheticCompositionEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompositionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionStart(value: SyntheticCompositionEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompositionStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionUpdate(value: SyntheticCompositionEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompositionUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextMenu(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCopy(value: SyntheticClipboardEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCut(value: SyntheticClipboardEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDoubleClick(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(value: DragEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnd(value: DragEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnter(value: DragEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragExit(value: DragEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragExit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragExit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragLeave(value: DragEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragOver(value: DragEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: DragEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrop(value: DragEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDurationChange(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDurationChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEmptied(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptied")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEmptied: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptied")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEncrypted(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEncrypted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEncrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnded(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: SyntheticFocusEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInput(value: SyntheticEvent[EventTarget with SVGSVGElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInvalid(value: SyntheticEvent[EventTarget with SVGSVGElement, Event] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: SyntheticKeyboardEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPress(value: SyntheticKeyboardEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyUp(value: SyntheticKeyboardEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadStart(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedData(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedData")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedMetadata(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDown(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMove(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOut(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOver(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseUp(value: SyntheticMouseEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPaste(value: SyntheticClipboardEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPause(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlay(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlaying(value: SyntheticEvent[Event, SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaying")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlaying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaying")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerCancel(value: SyntheticPointerEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerDown(value: SyntheticPointerEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerEnter(value: SyntheticPointerEvent[SVGSVGElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerEnter")(js.undefined)
        ret
    }
  }
  
}

