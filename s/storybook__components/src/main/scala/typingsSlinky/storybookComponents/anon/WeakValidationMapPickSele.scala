package typingsSlinky.storybookComponents.anon

import org.scalajs.dom.raw.HTMLSelectElement
import slinky.core.TagMod
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
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.PointerEventHandler
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.react.mod.TransitionEventHandler
import typingsSlinky.react.mod.UIEventHandler
import typingsSlinky.react.mod.Validator
import typingsSlinky.react.mod.WheelEventHandler
import typingsSlinky.storybookComponents.inputMod.Alignments
import typingsSlinky.storybookComponents.inputMod.Sizes
import typingsSlinky.storybookComponents.inputMod.ValidationStates
import typingsSlinky.storybookComponents.storybookComponentsStrings.`additions text`
import typingsSlinky.storybookComponents.storybookComponentsStrings.`inline`
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<std.Pick<react.react.SelectHTMLAttributes<std.HTMLSelectElement>, 'color' | 'translate' | 'hidden' | 'style' | 'multiple' | 'disabled' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'slot' | 'spellCheck' | 'tabIndex' | 'title' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'form' | 'value' | 'name' | 'autoFocus' | 'autoComplete' | 'required'> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps & react.react.RefAttributes<any> & std.Pick<react.react.SelectHTMLAttributes<std.HTMLSelectElement>, 'color' | 'translate' | 'hidden' | 'style' | 'multiple' | 'disabled' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'slot' | 'spellCheck' | 'tabIndex' | 'title' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'form' | 'value' | 'name' | 'autoFocus' | 'autoComplete' | 'required'> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps & @emotion/styled-base.anon.ThemeTheme<@storybook/theming.@storybook/theming.Theme>> */
@js.native
trait WeakValidationMapPickSele extends js.Object {
  var about: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var accessKey: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var align: js.UndefOr[Validator[js.UndefOr[Alignments | Null]]] = js.native
  var `aria-activedescendant`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-atomic`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-autocomplete`: js.UndefOr[Validator[js.UndefOr[none | `inline` | list | both | Null]]] = js.native
  var `aria-busy`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-checked`: js.UndefOr[Validator[js.UndefOr[mixed | Boolean | Null]]] = js.native
  var `aria-colcount`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-colindex`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-colspan`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-controls`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-current`: js.UndefOr[Validator[js.UndefOr[page | step | location | date | time | Boolean | Null]]] = js.native
  var `aria-describedby`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-details`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-disabled`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-dropeffect`: js.UndefOr[Validator[js.UndefOr[none | copy | execute | link | move | popup | Null]]] = js.native
  var `aria-errormessage`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-expanded`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-flowto`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-grabbed`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-haspopup`: js.UndefOr[Validator[js.UndefOr[menu | listbox | tree | grid | dialog | Boolean | Null]]] = js.native
  var `aria-hidden`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-invalid`: js.UndefOr[Validator[js.UndefOr[grammar | spelling | Boolean | Null]]] = js.native
  var `aria-keyshortcuts`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-label`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-labelledby`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-level`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-live`: js.UndefOr[Validator[js.UndefOr[off | assertive | polite | Null]]] = js.native
  var `aria-modal`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-multiline`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-multiselectable`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-orientation`: js.UndefOr[Validator[js.UndefOr[horizontal | vertical | Null]]] = js.native
  var `aria-owns`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-placeholder`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-posinset`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-pressed`: js.UndefOr[Validator[js.UndefOr[mixed | Boolean | Null]]] = js.native
  var `aria-readonly`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-relevant`: js.UndefOr[
    Validator[js.UndefOr[additions | (`additions text`) | all | removals | text | Null]]
  ] = js.native
  var `aria-required`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-roledescription`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var `aria-rowcount`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-rowindex`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-rowspan`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-selected`: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var `aria-setsize`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-sort`: js.UndefOr[Validator[js.UndefOr[none | ascending | descending | other | Null]]] = js.native
  var `aria-valuemax`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-valuemin`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-valuenow`: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var `aria-valuetext`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var autoCapitalize: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var autoComplete: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var autoCorrect: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var autoFocus: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var autoSave: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var children: js.UndefOr[Validator[js.UndefOr[Null | TagMod[Any]]]] = js.native
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var color: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var contentEditable: js.UndefOr[Validator[js.UndefOr[inherit | Booleanish | Null]]] = js.native
  var contextMenu: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var css: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[Validator[js.UndefOr[Html | Null]]] = js.native
  var datatype: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var defaultChecked: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var defaultValue: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Double | Null | String]]] = js.native
  var dir: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var draggable: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.native
  var form: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var hidden: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var inlist: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var inputMode: js.UndefOr[
    Validator[js.UndefOr[none | text | tel | url | email | numeric | decimal | search | Null]]
  ] = js.native
  var is: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var itemID: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var itemProp: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var itemRef: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var itemScope: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var itemType: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var key: js.UndefOr[Validator[js.UndefOr[Key | Null]]] = js.native
  var lang: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var multiple: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var name: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var onAbort: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onAbortCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onAnimationEnd: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onAnimationEndCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onAnimationIteration: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onAnimationIterationCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onAnimationStart: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onAnimationStartCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onAuxClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onAuxClickCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onBeforeInput: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onBeforeInputCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onBlur: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onBlurCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCanPlay: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onCanPlayCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCanPlayThrough: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onCanPlayThroughCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onChange: js.UndefOr[Validator[js.UndefOr[ChangeEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onChangeCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onClickCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCompositionEnd: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onCompositionEndCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCompositionStart: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onCompositionStartCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCompositionUpdate: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onCompositionUpdateCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onContextMenu: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onContextMenuCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCopy: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onCopyCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCut: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onCutCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDoubleClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onDoubleClickCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDrag: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onDragCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragEnd: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onDragEndCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragEnter: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onDragEnterCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragExit: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onDragExitCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragLeave: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onDragLeaveCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragOver: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onDragOverCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragStart: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onDragStartCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDrop: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onDropCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDurationChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onDurationChangeCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onEmptied: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onEmptiedCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onEncrypted: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onEncryptedCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onEnded: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onEndedCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onError: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onErrorCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onFocus: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onFocusCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onGotPointerCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onGotPointerCaptureCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onInput: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onInputCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onInvalid: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onInvalidCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onKeyDown: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onKeyDownCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onKeyPress: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onKeyPressCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onKeyUp: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onKeyUpCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLoad: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onLoadCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLoadStart: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onLoadStartCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLoadedData: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onLoadedDataCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLoadedMetadata: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onLoadedMetadataCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLostPointerCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLostPointerCaptureCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onMouseDown: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onMouseDownCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onMouseEnter: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onMouseLeave: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onMouseMove: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onMouseMoveCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onMouseOut: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onMouseOutCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onMouseOver: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onMouseOverCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onMouseUp: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onMouseUpCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPaste: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onPasteCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPause: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onPauseCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPlay: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onPlayCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPlaying: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onPlayingCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerCancel: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]] = js.native
  var onPointerCancelCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerDown: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]] = js.native
  var onPointerDownCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerEnter: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]] = js.native
  var onPointerEnterCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerLeave: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]] = js.native
  var onPointerLeaveCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerMove: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]] = js.native
  var onPointerMoveCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerOut: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]] = js.native
  var onPointerOutCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerOver: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]] = js.native
  var onPointerOverCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerUp: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]] = js.native
  var onPointerUpCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onProgress: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onProgressCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onRateChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onRateChangeCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onReset: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onResetCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onScroll: js.UndefOr[Validator[js.UndefOr[Null | UIEventHandler[HTMLSelectElement]]]] = js.native
  var onScrollCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onSeeked: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onSeekedCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onSeeking: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onSeekingCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onSelect: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onSelectCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onStalled: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onStalledCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onSubmit: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]] = js.native
  var onSubmitCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onSuspend: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onSuspendCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTimeUpdate: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onTimeUpdateCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTouchCancel: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]]] = js.native
  var onTouchCancelCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTouchEnd: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]]] = js.native
  var onTouchEndCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTouchMove: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]]] = js.native
  var onTouchMoveCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTouchStart: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]]] = js.native
  var onTouchStartCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTransitionEnd: js.UndefOr[Validator[js.UndefOr[Null | TransitionEventHandler[HTMLSelectElement]]]] = js.native
  var onTransitionEndCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onVolumeChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onVolumeChangeCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onWaiting: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]] = js.native
  var onWaitingCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onWheel: js.UndefOr[Validator[js.UndefOr[Null | WheelEventHandler[HTMLSelectElement]]]] = js.native
  var onWheelCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var placeholder: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var prefix: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var property: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var radioGroup: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var ref: js.UndefOr[Validator[js.UndefOr[Null | Ref[_]]]] = js.native
  var required: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var resource: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var results: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var role: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var security: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var size: js.UndefOr[Validator[js.UndefOr[Null | Sizes]]] = js.native
  var slot: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var spellCheck: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.native
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.native
  var suppressContentEditableWarning: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var suppressHydrationWarning: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var tabIndex: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var theme: js.UndefOr[Validator[js.UndefOr[Null | typingsSlinky.storybookTheming.typesMod.Theme]]] = js.native
  var title: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var translate: js.UndefOr[Validator[js.UndefOr[yes | no | Null]]] = js.native
  var typeof: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var unselectable: js.UndefOr[Validator[js.UndefOr[on | off | Null]]] = js.native
  var valid: js.UndefOr[Validator[js.UndefOr[Null | ValidationStates]]] = js.native
  var value: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Double | Null | String]]] = js.native
  var vocab: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
}

object WeakValidationMapPickSele {
  @scala.inline
  def apply(): WeakValidationMapPickSele = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapPickSele]
  }
  @scala.inline
  implicit class WeakValidationMapPickSeleOps[Self <: WeakValidationMapPickSele] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbout(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("about")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("about")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessKey(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAlign(value: Validator[js.UndefOr[Alignments | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def `withAria-activedescendant`(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def `withAria-atomic`(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
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
    def `withAria-autocomplete`(value: Validator[js.UndefOr[none | `inline` | list | both | Null]]): Self = {
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
    def `withAria-busy`(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
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
    def `withAria-checked`(value: Validator[js.UndefOr[mixed | Boolean | Null]]): Self = {
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
    def `withAria-colcount`(value: Validator[js.UndefOr[Double | Null]]): Self = {
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
    def `withAria-colindex`(value: Validator[js.UndefOr[Double | Null]]): Self = {
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
    def `withAria-colspan`(value: Validator[js.UndefOr[Double | Null]]): Self = {
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
    def `withAria-controls`(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def `withAria-current`(value: Validator[js.UndefOr[page | step | location | date | time | Boolean | Null]]): Self = {
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
    def `withAria-describedby`(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def `withAria-details`(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def `withAria-disabled`(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
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
    def `withAria-dropeffect`(value: Validator[js.UndefOr[none | copy | execute | link | move | popup | Null]]): Self = {
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
    def `withAria-errormessage`(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def `withAria-expanded`(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
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
    def `withAria-flowto`(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def `withAria-grabbed`(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
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
    def `withAria-haspopup`(value: Validator[js.UndefOr[menu | listbox | tree | grid | dialog | Boolean | Null]]): Self = {
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
    def `withAria-hidden`(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
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
    def `withAria-invalid`(value: Validator[js.UndefOr[grammar | spelling | Boolean | Null]]): Self = {
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
    def `withAria-keyshortcuts`(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def `withAria-label`(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def `withAria-labelledby`(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def `withAria-level`(value: Validator[js.UndefOr[Double | Null]]): Self = {
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
    def `withAria-live`(value: Validator[js.UndefOr[off | assertive | polite | Null]]): Self = {
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
    def `withAria-modal`(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
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
    def `withAria-multiline`(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
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
    def `withAria-multiselectable`(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
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
    def `withAria-orientation`(value: Validator[js.UndefOr[horizontal | vertical | Null]]): Self = {
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
    def `withAria-owns`(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def `withAria-placeholder`(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def `withAria-posinset`(value: Validator[js.UndefOr[Double | Null]]): Self = {
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
    def `withAria-pressed`(value: Validator[js.UndefOr[mixed | Boolean | Null]]): Self = {
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
    def `withAria-readonly`(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
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
    def `withAria-relevant`(value: Validator[js.UndefOr[additions | (`additions text`) | all | removals | text | Null]]): Self = {
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
    def `withAria-required`(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
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
    def `withAria-roledescription`(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def `withAria-rowcount`(value: Validator[js.UndefOr[Double | Null]]): Self = {
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
    def `withAria-rowindex`(value: Validator[js.UndefOr[Double | Null]]): Self = {
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
    def `withAria-rowspan`(value: Validator[js.UndefOr[Double | Null]]): Self = {
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
    def `withAria-selected`(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
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
    def `withAria-setsize`(value: Validator[js.UndefOr[Double | Null]]): Self = {
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
    def `withAria-sort`(value: Validator[js.UndefOr[none | ascending | descending | other | Null]]): Self = {
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
    def `withAria-valuemax`(value: Validator[js.UndefOr[Double | Null]]): Self = {
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
    def `withAria-valuemin`(value: Validator[js.UndefOr[Double | Null]]): Self = {
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
    def `withAria-valuenow`(value: Validator[js.UndefOr[Double | Null]]): Self = {
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
    def `withAria-valuetext`(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def withAutoCapitalize(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCapitalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCapitalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCapitalize")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoComplete(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCorrect(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCorrect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCorrect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCorrect")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFocus(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSave(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSave")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: Validator[js.UndefOr[Null | TagMod[Any]]]): Self = {
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
    def withClassName(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def withColor(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def withContentEditable(value: Validator[js.UndefOr[inherit | Booleanish | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEditable")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenu(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withCss(value: Validator[js.UndefOr[_ | Null]]): Self = {
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
    def withDangerouslySetInnerHTML(value: Validator[js.UndefOr[Html | Null]]): Self = {
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
    def withDatatype(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datatype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatatype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datatype")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultChecked(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: Validator[js.UndefOr[js.Array[String] | Double | Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Validator[js.UndefOr[Booleanish | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withForm(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def withInlist(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlist")(js.undefined)
        ret
    }
    @scala.inline
    def withInputMode(value: Validator[js.UndefOr[none | text | tel | url | email | numeric | decimal | search | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMode")(js.undefined)
        ret
    }
    @scala.inline
    def withIs(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(js.undefined)
        ret
    }
    @scala.inline
    def withItemID(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemID")(js.undefined)
        ret
    }
    @scala.inline
    def withItemProp(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemProp")(js.undefined)
        ret
    }
    @scala.inline
    def withItemRef(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRef")(js.undefined)
        ret
    }
    @scala.inline
    def withItemScope(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemScope")(js.undefined)
        ret
    }
    @scala.inline
    def withItemType(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: Validator[js.UndefOr[Key | Null]]): Self = {
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
    def withLang(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def withMultiple(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def withOnAbort(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAbortCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbortCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAbortCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbortCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationEnd(value: Validator[js.UndefOr[AnimationEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAnimationEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationEndCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEndCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAnimationEndCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationEndCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationIteration(value: Validator[js.UndefOr[AnimationEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationIteration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAnimationIteration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationIteration")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationIterationCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationIterationCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAnimationIterationCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationIterationCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationStart(value: Validator[js.UndefOr[AnimationEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAnimationStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimationStartCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationStartCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAnimationStartCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimationStartCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAuxClick(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuxClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAuxClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuxClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAuxClickCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuxClickCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAuxClickCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuxClickCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeInput(value: Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBeforeInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeInputCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeInputCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBeforeInputCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeInputCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: Validator[js.UndefOr[FocusEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlurCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlurCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBlurCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlurCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlay(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCanPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlayCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCanPlayCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlayThrough(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCanPlayThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThrough")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlayThroughCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThroughCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCanPlayThroughCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThroughCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: Validator[js.UndefOr[ChangeEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnChangeCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClickCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionEnd(value: Validator[js.UndefOr[CompositionEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCompositionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionEndCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionEndCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCompositionEndCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionEndCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionStart(value: Validator[js.UndefOr[CompositionEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCompositionStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionStartCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionStartCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCompositionStartCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionStartCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionUpdate(value: Validator[js.UndefOr[CompositionEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCompositionUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompositionUpdateCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionUpdateCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCompositionUpdateCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompositionUpdateCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextMenu(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextMenuCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenuCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnContextMenuCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenuCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCopy(value: Validator[js.UndefOr[ClipboardEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCopyCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopyCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCopyCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopyCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCut(value: Validator[js.UndefOr[ClipboardEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCutCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCutCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCutCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDoubleClick(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDoubleClickCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClickCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDoubleClickCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClickCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDragCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnd(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEndCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEndCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDragEndCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEndCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnter(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDragEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnterCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnterCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDragEnterCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnterCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragExit(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDragExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragExit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragExitCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragExitCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDragExitCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragExitCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragLeave(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDragLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragLeaveCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeaveCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDragLeaveCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeaveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragOver(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDragOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragOverCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOverCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDragOverCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOverCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStartCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStartCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDragStartCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStartCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrop(value: Validator[js.UndefOr[DragEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDropCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDropCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDurationChange(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDurationChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDurationChangeCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChangeCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDurationChangeCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEmptied(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEmptied: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptied")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEmptiedCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptiedCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEmptiedCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptiedCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEncrypted(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEncrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEncrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEncryptedCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEncryptedCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEncryptedCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEncryptedCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnded(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEnded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEndedCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndedCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEndedCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndedCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnErrorCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnErrorCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: Validator[js.UndefOr[FocusEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocusCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnFocusCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGotPointerCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGotPointerCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnGotPointerCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGotPointerCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGotPointerCaptureCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGotPointerCaptureCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnGotPointerCaptureCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGotPointerCaptureCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInput(value: Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInputCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnInputCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInvalid(value: Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInvalidCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalidCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnInvalidCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalidCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDownCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDownCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnKeyDownCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDownCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPress(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnKeyPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPressCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPressCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnKeyPressCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPressCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyUp(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnKeyUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyUpCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUpCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnKeyUpCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUpCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLoadCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadStart(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLoadStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadStartCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStartCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLoadStartCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStartCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedData(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLoadedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedData")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedDataCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedDataCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLoadedDataCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedDataCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedMetadata(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLoadedMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedMetadataCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadataCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLoadedMetadataCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadataCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLostPointerCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLostPointerCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLostPointerCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLostPointerCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLostPointerCaptureCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLostPointerCaptureCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLostPointerCaptureCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLostPointerCaptureCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDown(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDownCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDownCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMouseDownCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDownCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMove(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMoveCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMoveCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMouseMoveCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMoveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOut(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMouseOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOutCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOutCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMouseOutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOutCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOver(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOverCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOverCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMouseOverCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOverCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseUp(value: Validator[js.UndefOr[MouseEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMouseUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseUpCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUpCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMouseUpCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUpCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPaste(value: Validator[js.UndefOr[ClipboardEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPasteCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPasteCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPasteCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPasteCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPause(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPauseCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPauseCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPauseCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPauseCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlay(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlayCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPlayCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlaying(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPlaying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaying")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlayingCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayingCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPlayingCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayingCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerCancel(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPointerCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerCancelCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerCancelCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPointerCancelCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerCancelCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerDown(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPointerDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerDownCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerDownCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPointerDownCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerDownCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerEnter(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPointerEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerEnterCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerEnterCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPointerEnterCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerEnterCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerLeave(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerLeave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPointerLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerLeaveCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerLeaveCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPointerLeaveCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerLeaveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerMove(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPointerMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerMoveCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerMoveCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPointerMoveCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerMoveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerOut(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPointerOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerOutCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOutCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPointerOutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOutCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerOver(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPointerOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerOverCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOverCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPointerOverCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOverCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerUp(value: Validator[js.UndefOr[Null | PointerEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPointerUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerUpCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerUpCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPointerUpCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerUpCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgress(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgressCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgressCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnProgressCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgressCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRateChange(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRateChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnRateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRateChangeCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRateChangeCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnRateChangeCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRateChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReset(value: Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResetCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResetCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResetCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResetCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: Validator[js.UndefOr[Null | UIEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScrollCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnScrollCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeeked(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSeeked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeekedCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeekedCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSeekedCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeekedCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeeking(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSeeking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeking")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeekingCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeekingCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSeekingCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeekingCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSelectCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStalled(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnStalled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStalled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStalledCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStalledCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnStalledCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStalledCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmit(value: Validator[js.UndefOr[FormEventHandler[HTMLSelectElement] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmitCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSubmitCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuspend(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuspend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSuspend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuspend")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuspendCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuspendCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSuspendCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuspendCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTimeUpdate(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTimeUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTimeUpdateCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdateCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTimeUpdateCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdateCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchCancel(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchCancelCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancelCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchCancelCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancelCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchEnd(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchEndCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEndCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchEndCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEndCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchMove(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchMoveCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMoveCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchMoveCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMoveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchStart(value: Validator[js.UndefOr[Null | TouchEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchStartCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStartCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchStartCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStartCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransitionEnd(value: Validator[js.UndefOr[Null | TransitionEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTransitionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransitionEndCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEndCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTransitionEndCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEndCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVolumeChange(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVolumeChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnVolumeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVolumeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVolumeChangeCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVolumeChangeCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnVolumeChangeCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVolumeChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWaiting(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaiting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnWaiting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaiting")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWaitingCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaitingCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnWaitingCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaitingCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWheel(value: Validator[js.UndefOr[Null | WheelEventHandler[HTMLSelectElement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWheelCapture(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheelCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnWheelCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheelCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withProperty(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(js.undefined)
        ret
    }
    @scala.inline
    def withRadioGroup(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadioGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withRef(value: Validator[js.UndefOr[Null | Ref[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: Validator[js.UndefOr[Double | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurity(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(js.undefined)
        ret
    }
  }
  
}

