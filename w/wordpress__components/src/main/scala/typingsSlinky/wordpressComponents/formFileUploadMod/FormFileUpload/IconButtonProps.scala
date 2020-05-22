package typingsSlinky.wordpressComponents.formFileUploadMod.FormFileUpload

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.AnimationEventHandler
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEventHandler
import typingsSlinky.react.mod.ClipboardEventHandler
import typingsSlinky.react.mod.CompositionEventHandler
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
import typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon
import typingsSlinky.wordpressComponents.popoverMod.Popover.Position
import typingsSlinky.wordpressComponents.shortcutMod.Shortcut.ShortcutType
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.`additions text`
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.`inline`
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.additions
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.all
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.ascending
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.assertive
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.both
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.copy
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.date
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.decimal
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.descending
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.dialog
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.email
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.execute
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.grammar
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.grid
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.horizontal
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.inherit
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.link
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.list
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.listbox
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.location
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.menu
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.mixed
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.move
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.no
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.none
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.numeric
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.off
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.on
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.other
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.page
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.polite
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.popup
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.removals
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.search
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.spelling
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.step
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.tel
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.text
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.time
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.tree
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.url
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.vertical
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @wordpress/components.@wordpress/components/form-file-upload.FormFileUpload.BaseProps */
/* Inlined parent std.Partial<std.Omit<@wordpress/components.@wordpress/components/icon-button.default.Props, 'onChange'>> */
trait IconButtonProps extends Props {
  var about: js.UndefOr[String] = js.undefined
  /**
    * A string passed to input element that tells the browser which file
    * types can be upload to the upload by the user use.
    *
    * Further info: {@link https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/file#Unique_file_type_specifiers}
    */
  var accept: js.UndefOr[String] = js.undefined
  var acceptCharset: js.UndefOr[String] = js.undefined
  var accessKey: js.UndefOr[String] = js.undefined
  var action: js.UndefOr[String] = js.undefined
  var allowFullScreen: js.UndefOr[Boolean] = js.undefined
  var allowTransparency: js.UndefOr[Boolean] = js.undefined
  var alt: js.UndefOr[String] = js.undefined
  var `aria-activedescendant`: js.UndefOr[String] = js.undefined
  var `aria-atomic`: js.UndefOr[Boolean] = js.undefined
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  var `aria-busy`: js.UndefOr[Boolean] = js.undefined
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-colcount`: js.UndefOr[Double] = js.undefined
  var `aria-colindex`: js.UndefOr[Double] = js.undefined
  var `aria-colspan`: js.UndefOr[Double] = js.undefined
  var `aria-controls`: js.UndefOr[String] = js.undefined
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  var `aria-details`: js.UndefOr[String] = js.undefined
  var `aria-disabled`: js.UndefOr[Boolean] = js.undefined
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  var `aria-errormessage`: js.UndefOr[String] = js.undefined
  var `aria-expanded`: js.UndefOr[Boolean] = js.undefined
  var `aria-flowto`: js.UndefOr[String] = js.undefined
  var `aria-grabbed`: js.UndefOr[Boolean] = js.undefined
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  var `aria-hidden`: js.UndefOr[Boolean] = js.undefined
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  var `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  var `aria-label`: js.UndefOr[String] = js.undefined
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  var `aria-level`: js.UndefOr[Double] = js.undefined
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  var `aria-modal`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiline`: js.UndefOr[Boolean] = js.undefined
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  var `aria-owns`: js.UndefOr[String] = js.undefined
  var `aria-placeholder`: js.UndefOr[String] = js.undefined
  var `aria-posinset`: js.UndefOr[Double] = js.undefined
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  var `aria-readonly`: js.UndefOr[Boolean] = js.undefined
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.undefined
  var `aria-required`: js.UndefOr[Boolean] = js.undefined
  var `aria-roledescription`: js.UndefOr[String] = js.undefined
  var `aria-rowcount`: js.UndefOr[Double] = js.undefined
  var `aria-rowindex`: js.UndefOr[Double] = js.undefined
  var `aria-rowspan`: js.UndefOr[Double] = js.undefined
  var `aria-selected`: js.UndefOr[Boolean] = js.undefined
  var `aria-setsize`: js.UndefOr[Double] = js.undefined
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  var `aria-valuemax`: js.UndefOr[Double] = js.undefined
  var `aria-valuemin`: js.UndefOr[Double] = js.undefined
  var `aria-valuenow`: js.UndefOr[Double] = js.undefined
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  var as: js.UndefOr[String] = js.undefined
  var async: js.UndefOr[Boolean] = js.undefined
  var autoCapitalize: js.UndefOr[String] = js.undefined
  var autoComplete: js.UndefOr[String] = js.undefined
  var autoCorrect: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  var autoSave: js.UndefOr[String] = js.undefined
  var capture: js.UndefOr[Boolean | String] = js.undefined
  var cellPadding: js.UndefOr[Double | String] = js.undefined
  var cellSpacing: js.UndefOr[Double | String] = js.undefined
  var challenge: js.UndefOr[String] = js.undefined
  var charSet: js.UndefOr[String] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var cite: js.UndefOr[String] = js.undefined
  var classID: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var cols: js.UndefOr[Double] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  var contextMenu: js.UndefOr[String] = js.undefined
  var controls: js.UndefOr[Boolean] = js.undefined
  var coords: js.UndefOr[String] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var datatype: js.UndefOr[String] = js.undefined
  var dateTime: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[Boolean] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  var defer: js.UndefOr[Boolean] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var download: js.UndefOr[js.Any] = js.undefined
  var draggable: js.UndefOr[Booleanish] = js.undefined
  var encType: js.UndefOr[String] = js.undefined
  var form: js.UndefOr[String] = js.undefined
  var formAction: js.UndefOr[String] = js.undefined
  var formEncType: js.UndefOr[String] = js.undefined
  var formMethod: js.UndefOr[String] = js.undefined
  var formNoValidate: js.UndefOr[Boolean] = js.undefined
  var formTarget: js.UndefOr[String] = js.undefined
  var frameBorder: js.UndefOr[Double | String] = js.undefined
  var headers: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var high: js.UndefOr[Double] = js.undefined
  var hrefLang: js.UndefOr[String] = js.undefined
  var htmlFor: js.UndefOr[String] = js.undefined
  var httpEquiv: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[Icon | ReactElement] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlist: js.UndefOr[js.Any] = js.undefined
  var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  var integrity: js.UndefOr[String] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  var isBusy: js.UndefOr[Boolean] = js.undefined
  var isDefault: js.UndefOr[Boolean] = js.undefined
  var isDestructive: js.UndefOr[Boolean] = js.undefined
  var isLarge: js.UndefOr[Boolean] = js.undefined
  var isLink: js.UndefOr[Boolean] = js.undefined
  var isPrimary: js.UndefOr[Boolean] = js.undefined
  var isSmall: js.UndefOr[Boolean] = js.undefined
  var isTertiary: js.UndefOr[Boolean] = js.undefined
  var isToggled: js.UndefOr[Boolean] = js.undefined
  var itemID: js.UndefOr[String] = js.undefined
  var itemProp: js.UndefOr[String] = js.undefined
  var itemRef: js.UndefOr[String] = js.undefined
  var itemScope: js.UndefOr[Boolean] = js.undefined
  var itemType: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var keyParams: js.UndefOr[String] = js.undefined
  var keyType: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelPosition: js.UndefOr[Position] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var list: js.UndefOr[String] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var low: js.UndefOr[Double] = js.undefined
  var manifest: js.UndefOr[String] = js.undefined
  var marginHeight: js.UndefOr[Double] = js.undefined
  var marginWidth: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double | String] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var media: js.UndefOr[String] = js.undefined
  var mediaGroup: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var min: js.UndefOr[Double | String] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  /**
    * Whether to allow multiple selection of files or not.
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  var muted: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var noValidate: js.UndefOr[Boolean] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var onAbort: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.undefined
  var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.undefined
  var onAuxClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLButtonElement]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  /**
    * Callback function passed directly to the `input` file element.
    */
  var onChange: ChangeEventHandler[HTMLInputElement]
  var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onCopy: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLButtonElement]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.undefined
  var onLoad: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
  var onPointerDown: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.undefined
  var onScroll: js.UndefOr[UIEventHandler[HTMLButtonElement]] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onSelect: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.undefined
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLButtonElement]] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.undefined
  var onWheel: js.UndefOr[WheelEventHandler[HTMLButtonElement]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var optimum: js.UndefOr[Double] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var playsInline: js.UndefOr[Boolean] = js.undefined
  var poster: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var preload: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var radioGroup: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var ref: js.UndefOr[LegacyRef[HTMLButtonElement]] = js.undefined
  var rel: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var results: js.UndefOr[Double] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var sandbox: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var scoped: js.UndefOr[Boolean] = js.undefined
  var scrolling: js.UndefOr[String] = js.undefined
  var seamless: js.UndefOr[Boolean] = js.undefined
  var security: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var shape: js.UndefOr[String] = js.undefined
  var shortcut: js.UndefOr[ShortcutType] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var sizes: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var span: js.UndefOr[Double] = js.undefined
  var spellCheck: js.UndefOr[Booleanish] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var srcDoc: js.UndefOr[String] = js.undefined
  var srcLang: js.UndefOr[String] = js.undefined
  var srcSet: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double | String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  var suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
  var translate: js.UndefOr[yes | no] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var typeof: js.UndefOr[String] = js.undefined
  var unselectable: js.UndefOr[on | off] = js.undefined
  var useMap: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
  var vocab: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  var wmode: js.UndefOr[String] = js.undefined
  var wrap: js.UndefOr[String] = js.undefined
}

