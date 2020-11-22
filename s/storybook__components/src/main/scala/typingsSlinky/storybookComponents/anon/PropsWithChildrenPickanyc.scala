package typingsSlinky.storybookComponents.anon

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.Ref
import typingsSlinky.storybookComponents.inputMod.Alignments
import typingsSlinky.storybookComponents.inputMod.Sizes
import typingsSlinky.storybookComponents.inputMod.ValidationStates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.PropsWithChildren<std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_react-textarea-autosize.TextareaAutosizeProps * / any, 'color' | 'translate' | 'hidden' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'slot' | 'spellCheck' | 'style' | 'tabIndex' | 'title' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'autoFocus' | 'disabled' | 'form' | 'name' | 'value' | 'wrap' | 'autoComplete' | 'cols' | 'maxLength' | 'minLength' | 'readOnly' | 'required' | 'rows' | 'dirName' | 'maxRows' | 'minRows' | 'onHeightChange' | 'cacheMeasurements'> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps & react.react.RefAttributes<any> & @emotion/styled-base.@emotion/styled-base/types/helper.Omit<std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_react-textarea-autosize.TextareaAutosizeProps * / any, 'color' | 'translate' | 'hidden' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'slot' | 'spellCheck' | 'style' | 'tabIndex' | 'title' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'autoFocus' | 'disabled' | 'form' | 'name' | 'value' | 'wrap' | 'autoComplete' | 'cols' | 'maxLength' | 'minLength' | 'readOnly' | 'required' | 'rows' | 'dirName' | 'maxRows' | 'minRows' | 'onHeightChange' | 'cacheMeasurements'> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps, 'theme'> & @emotion/styled-base.anon.0<@storybook/theming.@storybook/theming.Theme>> */
@js.native
trait PropsWithChildrenPickanyc extends js.Object {
  
  var about: js.UndefOr[js.Any] = js.native
  
  var accessKey: js.UndefOr[js.Any] = js.native
  
  var align: js.UndefOr[Alignments] = js.native
  
  var `aria-activedescendant`: js.UndefOr[js.Any] = js.native
  
  var `aria-atomic`: js.UndefOr[js.Any] = js.native
  
  var `aria-autocomplete`: js.UndefOr[js.Any] = js.native
  
  var `aria-busy`: js.UndefOr[js.Any] = js.native
  
  var `aria-checked`: js.UndefOr[js.Any] = js.native
  
  var `aria-colcount`: js.UndefOr[js.Any] = js.native
  
  var `aria-colindex`: js.UndefOr[js.Any] = js.native
  
  var `aria-colspan`: js.UndefOr[js.Any] = js.native
  
  var `aria-controls`: js.UndefOr[js.Any] = js.native
  
  var `aria-current`: js.UndefOr[js.Any] = js.native
  
  var `aria-describedby`: js.UndefOr[js.Any] = js.native
  
  var `aria-details`: js.UndefOr[js.Any] = js.native
  
  var `aria-disabled`: js.UndefOr[js.Any] = js.native
  
  var `aria-dropeffect`: js.UndefOr[js.Any] = js.native
  
  var `aria-errormessage`: js.UndefOr[js.Any] = js.native
  
  var `aria-expanded`: js.UndefOr[js.Any] = js.native
  
  var `aria-flowto`: js.UndefOr[js.Any] = js.native
  
  var `aria-grabbed`: js.UndefOr[js.Any] = js.native
  
  var `aria-haspopup`: js.UndefOr[js.Any] = js.native
  
  var `aria-hidden`: js.UndefOr[js.Any] = js.native
  
  var `aria-invalid`: js.UndefOr[js.Any] = js.native
  
  var `aria-keyshortcuts`: js.UndefOr[js.Any] = js.native
  
  var `aria-label`: js.UndefOr[js.Any] = js.native
  
  var `aria-labelledby`: js.UndefOr[js.Any] = js.native
  
  var `aria-level`: js.UndefOr[js.Any] = js.native
  
  var `aria-live`: js.UndefOr[js.Any] = js.native
  
  var `aria-modal`: js.UndefOr[js.Any] = js.native
  
  var `aria-multiline`: js.UndefOr[js.Any] = js.native
  
  var `aria-multiselectable`: js.UndefOr[js.Any] = js.native
  
  var `aria-orientation`: js.UndefOr[js.Any] = js.native
  
  var `aria-owns`: js.UndefOr[js.Any] = js.native
  
  var `aria-placeholder`: js.UndefOr[js.Any] = js.native
  
  var `aria-posinset`: js.UndefOr[js.Any] = js.native
  
  var `aria-pressed`: js.UndefOr[js.Any] = js.native
  
  var `aria-readonly`: js.UndefOr[js.Any] = js.native
  
  var `aria-relevant`: js.UndefOr[js.Any] = js.native
  
  var `aria-required`: js.UndefOr[js.Any] = js.native
  
  var `aria-roledescription`: js.UndefOr[js.Any] = js.native
  
  var `aria-rowcount`: js.UndefOr[js.Any] = js.native
  
  var `aria-rowindex`: js.UndefOr[js.Any] = js.native
  
  var `aria-rowspan`: js.UndefOr[js.Any] = js.native
  
  var `aria-selected`: js.UndefOr[js.Any] = js.native
  
  var `aria-setsize`: js.UndefOr[js.Any] = js.native
  
  var `aria-sort`: js.UndefOr[js.Any] = js.native
  
  var `aria-valuemax`: js.UndefOr[js.Any] = js.native
  
  var `aria-valuemin`: js.UndefOr[js.Any] = js.native
  
  var `aria-valuenow`: js.UndefOr[js.Any] = js.native
  
  var `aria-valuetext`: js.UndefOr[js.Any] = js.native
  
  var autoCapitalize: js.UndefOr[js.Any] = js.native
  
  var autoComplete: js.UndefOr[js.Any] = js.native
  
  var autoCorrect: js.UndefOr[js.Any] = js.native
  
  var autoFocus: js.UndefOr[js.Any] = js.native
  
  var autoSave: js.UndefOr[js.Any] = js.native
  
  var cacheMeasurements: js.UndefOr[js.Any] = js.native
  
  var children: js.UndefOr[js.Any] with js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[js.Any] = js.native
  
  var color: js.UndefOr[js.Any] = js.native
  
  var cols: js.UndefOr[js.Any] = js.native
  
  var contentEditable: js.UndefOr[js.Any] = js.native
  
  var contextMenu: js.UndefOr[js.Any] = js.native
  
  var css: js.UndefOr[js.Any] = js.native
  
  var dangerouslySetInnerHTML: js.UndefOr[js.Any] = js.native
  
  var datatype: js.UndefOr[js.Any] = js.native
  
  var defaultChecked: js.UndefOr[js.Any] = js.native
  
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  var dir: js.UndefOr[js.Any] = js.native
  
  var dirName: js.UndefOr[js.Any] = js.native
  
  var disabled: js.UndefOr[js.Any] = js.native
  
  var draggable: js.UndefOr[js.Any] = js.native
  
  var form: js.UndefOr[js.Any] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hidden: js.UndefOr[js.Any] = js.native
  
  var id: js.UndefOr[js.Any] = js.native
  
  var inlist: js.UndefOr[js.Any] = js.native
  
  var inputMode: js.UndefOr[js.Any] = js.native
  
  var is: js.UndefOr[js.Any] = js.native
  
  var itemID: js.UndefOr[js.Any] = js.native
  
  var itemProp: js.UndefOr[js.Any] = js.native
  
  var itemRef: js.UndefOr[js.Any] = js.native
  
  var itemScope: js.UndefOr[js.Any] = js.native
  
  var itemType: js.UndefOr[js.Any] = js.native
  
  var key: js.UndefOr[Key | Null] = js.native
  
  var lang: js.UndefOr[js.Any] = js.native
  
  var maxLength: js.UndefOr[js.Any] = js.native
  
  var maxRows: js.UndefOr[js.Any] = js.native
  
  var minLength: js.UndefOr[js.Any] = js.native
  
  var minRows: js.UndefOr[js.Any] = js.native
  
  var name: js.UndefOr[js.Any] = js.native
  
  var onAbort: js.UndefOr[js.Any] = js.native
  
  var onAbortCapture: js.UndefOr[js.Any] = js.native
  
  var onAnimationEnd: js.UndefOr[js.Any] = js.native
  
  var onAnimationEndCapture: js.UndefOr[js.Any] = js.native
  
  var onAnimationIteration: js.UndefOr[js.Any] = js.native
  
  var onAnimationIterationCapture: js.UndefOr[js.Any] = js.native
  
  var onAnimationStart: js.UndefOr[js.Any] = js.native
  
  var onAnimationStartCapture: js.UndefOr[js.Any] = js.native
  
  var onAuxClick: js.UndefOr[js.Any] = js.native
  
  var onAuxClickCapture: js.UndefOr[js.Any] = js.native
  
  var onBeforeInput: js.UndefOr[js.Any] = js.native
  
  var onBeforeInputCapture: js.UndefOr[js.Any] = js.native
  
  var onBlur: js.UndefOr[js.Any] = js.native
  
  var onBlurCapture: js.UndefOr[js.Any] = js.native
  
  var onCanPlay: js.UndefOr[js.Any] = js.native
  
  var onCanPlayCapture: js.UndefOr[js.Any] = js.native
  
  var onCanPlayThrough: js.UndefOr[js.Any] = js.native
  
  var onCanPlayThroughCapture: js.UndefOr[js.Any] = js.native
  
  var onChange: js.UndefOr[js.Any] = js.native
  
  var onChangeCapture: js.UndefOr[js.Any] = js.native
  
  var onClick: js.UndefOr[js.Any] = js.native
  
  var onClickCapture: js.UndefOr[js.Any] = js.native
  
  var onCompositionEnd: js.UndefOr[js.Any] = js.native
  
  var onCompositionEndCapture: js.UndefOr[js.Any] = js.native
  
  var onCompositionStart: js.UndefOr[js.Any] = js.native
  
  var onCompositionStartCapture: js.UndefOr[js.Any] = js.native
  
  var onCompositionUpdate: js.UndefOr[js.Any] = js.native
  
  var onCompositionUpdateCapture: js.UndefOr[js.Any] = js.native
  
  var onContextMenu: js.UndefOr[js.Any] = js.native
  
  var onContextMenuCapture: js.UndefOr[js.Any] = js.native
  
  var onCopy: js.UndefOr[js.Any] = js.native
  
  var onCopyCapture: js.UndefOr[js.Any] = js.native
  
  var onCut: js.UndefOr[js.Any] = js.native
  
  var onCutCapture: js.UndefOr[js.Any] = js.native
  
  var onDoubleClick: js.UndefOr[js.Any] = js.native
  
  var onDoubleClickCapture: js.UndefOr[js.Any] = js.native
  
  var onDrag: js.UndefOr[js.Any] = js.native
  
  var onDragCapture: js.UndefOr[js.Any] = js.native
  
  var onDragEnd: js.UndefOr[js.Any] = js.native
  
  var onDragEndCapture: js.UndefOr[js.Any] = js.native
  
  var onDragEnter: js.UndefOr[js.Any] = js.native
  
  var onDragEnterCapture: js.UndefOr[js.Any] = js.native
  
  var onDragExit: js.UndefOr[js.Any] = js.native
  
  var onDragExitCapture: js.UndefOr[js.Any] = js.native
  
  var onDragLeave: js.UndefOr[js.Any] = js.native
  
  var onDragLeaveCapture: js.UndefOr[js.Any] = js.native
  
  var onDragOver: js.UndefOr[js.Any] = js.native
  
  var onDragOverCapture: js.UndefOr[js.Any] = js.native
  
  var onDragStart: js.UndefOr[js.Any] = js.native
  
  var onDragStartCapture: js.UndefOr[js.Any] = js.native
  
  var onDrop: js.UndefOr[js.Any] = js.native
  
  var onDropCapture: js.UndefOr[js.Any] = js.native
  
  var onDurationChange: js.UndefOr[js.Any] = js.native
  
  var onDurationChangeCapture: js.UndefOr[js.Any] = js.native
  
  var onEmptied: js.UndefOr[js.Any] = js.native
  
  var onEmptiedCapture: js.UndefOr[js.Any] = js.native
  
  var onEncrypted: js.UndefOr[js.Any] = js.native
  
  var onEncryptedCapture: js.UndefOr[js.Any] = js.native
  
  var onEnded: js.UndefOr[js.Any] = js.native
  
  var onEndedCapture: js.UndefOr[js.Any] = js.native
  
  var onError: js.UndefOr[js.Any] = js.native
  
  var onErrorCapture: js.UndefOr[js.Any] = js.native
  
  var onFocus: js.UndefOr[js.Any] = js.native
  
  var onFocusCapture: js.UndefOr[js.Any] = js.native
  
  var onGotPointerCapture: js.UndefOr[js.Any] = js.native
  
  var onGotPointerCaptureCapture: js.UndefOr[js.Any] = js.native
  
  var onHeightChange: js.UndefOr[js.Any] = js.native
  
  var onInput: js.UndefOr[js.Any] = js.native
  
  var onInputCapture: js.UndefOr[js.Any] = js.native
  
  var onInvalid: js.UndefOr[js.Any] = js.native
  
  var onInvalidCapture: js.UndefOr[js.Any] = js.native
  
  var onKeyDown: js.UndefOr[js.Any] = js.native
  
  var onKeyDownCapture: js.UndefOr[js.Any] = js.native
  
  var onKeyPress: js.UndefOr[js.Any] = js.native
  
  var onKeyPressCapture: js.UndefOr[js.Any] = js.native
  
  var onKeyUp: js.UndefOr[js.Any] = js.native
  
  var onKeyUpCapture: js.UndefOr[js.Any] = js.native
  
  var onLoad: js.UndefOr[js.Any] = js.native
  
  var onLoadCapture: js.UndefOr[js.Any] = js.native
  
  var onLoadStart: js.UndefOr[js.Any] = js.native
  
  var onLoadStartCapture: js.UndefOr[js.Any] = js.native
  
  var onLoadedData: js.UndefOr[js.Any] = js.native
  
  var onLoadedDataCapture: js.UndefOr[js.Any] = js.native
  
  var onLoadedMetadata: js.UndefOr[js.Any] = js.native
  
  var onLoadedMetadataCapture: js.UndefOr[js.Any] = js.native
  
  var onLostPointerCapture: js.UndefOr[js.Any] = js.native
  
  var onLostPointerCaptureCapture: js.UndefOr[js.Any] = js.native
  
  var onMouseDown: js.UndefOr[js.Any] = js.native
  
  var onMouseDownCapture: js.UndefOr[js.Any] = js.native
  
  var onMouseEnter: js.UndefOr[js.Any] = js.native
  
  var onMouseLeave: js.UndefOr[js.Any] = js.native
  
  var onMouseMove: js.UndefOr[js.Any] = js.native
  
  var onMouseMoveCapture: js.UndefOr[js.Any] = js.native
  
  var onMouseOut: js.UndefOr[js.Any] = js.native
  
  var onMouseOutCapture: js.UndefOr[js.Any] = js.native
  
  var onMouseOver: js.UndefOr[js.Any] = js.native
  
  var onMouseOverCapture: js.UndefOr[js.Any] = js.native
  
  var onMouseUp: js.UndefOr[js.Any] = js.native
  
  var onMouseUpCapture: js.UndefOr[js.Any] = js.native
  
  var onPaste: js.UndefOr[js.Any] = js.native
  
  var onPasteCapture: js.UndefOr[js.Any] = js.native
  
  var onPause: js.UndefOr[js.Any] = js.native
  
  var onPauseCapture: js.UndefOr[js.Any] = js.native
  
  var onPlay: js.UndefOr[js.Any] = js.native
  
  var onPlayCapture: js.UndefOr[js.Any] = js.native
  
  var onPlaying: js.UndefOr[js.Any] = js.native
  
  var onPlayingCapture: js.UndefOr[js.Any] = js.native
  
  var onPointerCancel: js.UndefOr[js.Any] = js.native
  
  var onPointerCancelCapture: js.UndefOr[js.Any] = js.native
  
  var onPointerDown: js.UndefOr[js.Any] = js.native
  
  var onPointerDownCapture: js.UndefOr[js.Any] = js.native
  
  var onPointerEnter: js.UndefOr[js.Any] = js.native
  
  var onPointerEnterCapture: js.UndefOr[js.Any] = js.native
  
  var onPointerLeave: js.UndefOr[js.Any] = js.native
  
  var onPointerLeaveCapture: js.UndefOr[js.Any] = js.native
  
  var onPointerMove: js.UndefOr[js.Any] = js.native
  
  var onPointerMoveCapture: js.UndefOr[js.Any] = js.native
  
  var onPointerOut: js.UndefOr[js.Any] = js.native
  
  var onPointerOutCapture: js.UndefOr[js.Any] = js.native
  
  var onPointerOver: js.UndefOr[js.Any] = js.native
  
  var onPointerOverCapture: js.UndefOr[js.Any] = js.native
  
  var onPointerUp: js.UndefOr[js.Any] = js.native
  
  var onPointerUpCapture: js.UndefOr[js.Any] = js.native
  
  var onProgress: js.UndefOr[js.Any] = js.native
  
  var onProgressCapture: js.UndefOr[js.Any] = js.native
  
  var onRateChange: js.UndefOr[js.Any] = js.native
  
  var onRateChangeCapture: js.UndefOr[js.Any] = js.native
  
  var onReset: js.UndefOr[js.Any] = js.native
  
  var onResetCapture: js.UndefOr[js.Any] = js.native
  
  var onScroll: js.UndefOr[js.Any] = js.native
  
  var onScrollCapture: js.UndefOr[js.Any] = js.native
  
  var onSeeked: js.UndefOr[js.Any] = js.native
  
  var onSeekedCapture: js.UndefOr[js.Any] = js.native
  
  var onSeeking: js.UndefOr[js.Any] = js.native
  
  var onSeekingCapture: js.UndefOr[js.Any] = js.native
  
  var onSelect: js.UndefOr[js.Any] = js.native
  
  var onSelectCapture: js.UndefOr[js.Any] = js.native
  
  var onStalled: js.UndefOr[js.Any] = js.native
  
  var onStalledCapture: js.UndefOr[js.Any] = js.native
  
  var onSubmit: js.UndefOr[js.Any] = js.native
  
  var onSubmitCapture: js.UndefOr[js.Any] = js.native
  
  var onSuspend: js.UndefOr[js.Any] = js.native
  
  var onSuspendCapture: js.UndefOr[js.Any] = js.native
  
  var onTimeUpdate: js.UndefOr[js.Any] = js.native
  
  var onTimeUpdateCapture: js.UndefOr[js.Any] = js.native
  
  var onTouchCancel: js.UndefOr[js.Any] = js.native
  
  var onTouchCancelCapture: js.UndefOr[js.Any] = js.native
  
  var onTouchEnd: js.UndefOr[js.Any] = js.native
  
  var onTouchEndCapture: js.UndefOr[js.Any] = js.native
  
  var onTouchMove: js.UndefOr[js.Any] = js.native
  
  var onTouchMoveCapture: js.UndefOr[js.Any] = js.native
  
  var onTouchStart: js.UndefOr[js.Any] = js.native
  
  var onTouchStartCapture: js.UndefOr[js.Any] = js.native
  
  var onTransitionEnd: js.UndefOr[js.Any] = js.native
  
  var onTransitionEndCapture: js.UndefOr[js.Any] = js.native
  
  var onVolumeChange: js.UndefOr[js.Any] = js.native
  
  var onVolumeChangeCapture: js.UndefOr[js.Any] = js.native
  
  var onWaiting: js.UndefOr[js.Any] = js.native
  
  var onWaitingCapture: js.UndefOr[js.Any] = js.native
  
  var onWheel: js.UndefOr[js.Any] = js.native
  
  var onWheelCapture: js.UndefOr[js.Any] = js.native
  
  var placeholder: js.UndefOr[js.Any] = js.native
  
  var prefix: js.UndefOr[js.Any] = js.native
  
  var property: js.UndefOr[js.Any] = js.native
  
  var radioGroup: js.UndefOr[js.Any] = js.native
  
  var readOnly: js.UndefOr[js.Any] = js.native
  
  var ref: js.UndefOr[Ref[_]] = js.native
  
  var required: js.UndefOr[js.Any] = js.native
  
  var resource: js.UndefOr[js.Any] = js.native
  
  var results: js.UndefOr[js.Any] = js.native
  
  var role: js.UndefOr[js.Any] = js.native
  
  var rows: js.UndefOr[js.Any] = js.native
  
  var security: js.UndefOr[js.Any] = js.native
  
  var size: js.UndefOr[Sizes] = js.native
  
  var slot: js.UndefOr[js.Any] = js.native
  
  var spellCheck: js.UndefOr[js.Any] = js.native
  
  var style: js.UndefOr[js.Any] = js.native
  
  var suppressContentEditableWarning: js.UndefOr[js.Any] = js.native
  
  var suppressHydrationWarning: js.UndefOr[js.Any] = js.native
  
  var tabIndex: js.UndefOr[js.Any] = js.native
  
  var theme: js.UndefOr[typingsSlinky.storybookTheming.typesMod.Theme] = js.native
  
  var title: js.UndefOr[js.Any] = js.native
  
  var translate: js.UndefOr[js.Any] = js.native
  
  var typeof: js.UndefOr[js.Any] = js.native
  
  var unselectable: js.UndefOr[js.Any] = js.native
  
  var valid: js.UndefOr[ValidationStates] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
  
  var vocab: js.UndefOr[js.Any] = js.native
  
  var wrap: js.UndefOr[js.Any] = js.native
}
object PropsWithChildrenPickanyc {
  
  @scala.inline
  def apply(children: js.UndefOr[js.Any] with js.UndefOr[ReactElement]): PropsWithChildrenPickanyc = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsWithChildrenPickanyc]
  }
  
  @scala.inline
  implicit class PropsWithChildrenPickanycOps[Self <: PropsWithChildrenPickanyc] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: js.UndefOr[js.Any] with js.UndefOr[ReactElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbout(value: js.Any): Self = this.set("about", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbout: Self = this.set("about", js.undefined)
    
    @scala.inline
    def setAccessKey(value: js.Any): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    
    @scala.inline
    def setAlign(value: Alignments): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def `setAria-activedescendant`(value: js.Any): Self = this.set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-activedescendant`: Self = this.set("aria-activedescendant", js.undefined)
    
    @scala.inline
    def `setAria-atomic`(value: js.Any): Self = this.set("aria-atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-atomic`: Self = this.set("aria-atomic", js.undefined)
    
    @scala.inline
    def `setAria-autocomplete`(value: js.Any): Self = this.set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-autocomplete`: Self = this.set("aria-autocomplete", js.undefined)
    
    @scala.inline
    def `setAria-busy`(value: js.Any): Self = this.set("aria-busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-busy`: Self = this.set("aria-busy", js.undefined)
    
    @scala.inline
    def `setAria-checked`(value: js.Any): Self = this.set("aria-checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-checked`: Self = this.set("aria-checked", js.undefined)
    
    @scala.inline
    def `setAria-colcount`(value: js.Any): Self = this.set("aria-colcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colcount`: Self = this.set("aria-colcount", js.undefined)
    
    @scala.inline
    def `setAria-colindex`(value: js.Any): Self = this.set("aria-colindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colindex`: Self = this.set("aria-colindex", js.undefined)
    
    @scala.inline
    def `setAria-colspan`(value: js.Any): Self = this.set("aria-colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-colspan`: Self = this.set("aria-colspan", js.undefined)
    
    @scala.inline
    def `setAria-controls`(value: js.Any): Self = this.set("aria-controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-controls`: Self = this.set("aria-controls", js.undefined)
    
    @scala.inline
    def `setAria-current`(value: js.Any): Self = this.set("aria-current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-current`: Self = this.set("aria-current", js.undefined)
    
    @scala.inline
    def `setAria-describedby`(value: js.Any): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-describedby`: Self = this.set("aria-describedby", js.undefined)
    
    @scala.inline
    def `setAria-details`(value: js.Any): Self = this.set("aria-details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-details`: Self = this.set("aria-details", js.undefined)
    
    @scala.inline
    def `setAria-disabled`(value: js.Any): Self = this.set("aria-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-disabled`: Self = this.set("aria-disabled", js.undefined)
    
    @scala.inline
    def `setAria-dropeffect`(value: js.Any): Self = this.set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-dropeffect`: Self = this.set("aria-dropeffect", js.undefined)
    
    @scala.inline
    def `setAria-errormessage`(value: js.Any): Self = this.set("aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-errormessage`: Self = this.set("aria-errormessage", js.undefined)
    
    @scala.inline
    def `setAria-expanded`(value: js.Any): Self = this.set("aria-expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-expanded`: Self = this.set("aria-expanded", js.undefined)
    
    @scala.inline
    def `setAria-flowto`(value: js.Any): Self = this.set("aria-flowto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-flowto`: Self = this.set("aria-flowto", js.undefined)
    
    @scala.inline
    def `setAria-grabbed`(value: js.Any): Self = this.set("aria-grabbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-grabbed`: Self = this.set("aria-grabbed", js.undefined)
    
    @scala.inline
    def `setAria-haspopup`(value: js.Any): Self = this.set("aria-haspopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-haspopup`: Self = this.set("aria-haspopup", js.undefined)
    
    @scala.inline
    def `setAria-hidden`(value: js.Any): Self = this.set("aria-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-hidden`: Self = this.set("aria-hidden", js.undefined)
    
    @scala.inline
    def `setAria-invalid`(value: js.Any): Self = this.set("aria-invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-invalid`: Self = this.set("aria-invalid", js.undefined)
    
    @scala.inline
    def `setAria-keyshortcuts`(value: js.Any): Self = this.set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-keyshortcuts`: Self = this.set("aria-keyshortcuts", js.undefined)
    
    @scala.inline
    def `setAria-label`(value: js.Any): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    
    @scala.inline
    def `setAria-labelledby`(value: js.Any): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", js.undefined)
    
    @scala.inline
    def `setAria-level`(value: js.Any): Self = this.set("aria-level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-level`: Self = this.set("aria-level", js.undefined)
    
    @scala.inline
    def `setAria-live`(value: js.Any): Self = this.set("aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-live`: Self = this.set("aria-live", js.undefined)
    
    @scala.inline
    def `setAria-modal`(value: js.Any): Self = this.set("aria-modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-modal`: Self = this.set("aria-modal", js.undefined)
    
    @scala.inline
    def `setAria-multiline`(value: js.Any): Self = this.set("aria-multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-multiline`: Self = this.set("aria-multiline", js.undefined)
    
    @scala.inline
    def `setAria-multiselectable`(value: js.Any): Self = this.set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-multiselectable`: Self = this.set("aria-multiselectable", js.undefined)
    
    @scala.inline
    def `setAria-orientation`(value: js.Any): Self = this.set("aria-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-orientation`: Self = this.set("aria-orientation", js.undefined)
    
    @scala.inline
    def `setAria-owns`(value: js.Any): Self = this.set("aria-owns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-owns`: Self = this.set("aria-owns", js.undefined)
    
    @scala.inline
    def `setAria-placeholder`(value: js.Any): Self = this.set("aria-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-placeholder`: Self = this.set("aria-placeholder", js.undefined)
    
    @scala.inline
    def `setAria-posinset`(value: js.Any): Self = this.set("aria-posinset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-posinset`: Self = this.set("aria-posinset", js.undefined)
    
    @scala.inline
    def `setAria-pressed`(value: js.Any): Self = this.set("aria-pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-pressed`: Self = this.set("aria-pressed", js.undefined)
    
    @scala.inline
    def `setAria-readonly`(value: js.Any): Self = this.set("aria-readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-readonly`: Self = this.set("aria-readonly", js.undefined)
    
    @scala.inline
    def `setAria-relevant`(value: js.Any): Self = this.set("aria-relevant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-relevant`: Self = this.set("aria-relevant", js.undefined)
    
    @scala.inline
    def `setAria-required`(value: js.Any): Self = this.set("aria-required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-required`: Self = this.set("aria-required", js.undefined)
    
    @scala.inline
    def `setAria-roledescription`(value: js.Any): Self = this.set("aria-roledescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-roledescription`: Self = this.set("aria-roledescription", js.undefined)
    
    @scala.inline
    def `setAria-rowcount`(value: js.Any): Self = this.set("aria-rowcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowcount`: Self = this.set("aria-rowcount", js.undefined)
    
    @scala.inline
    def `setAria-rowindex`(value: js.Any): Self = this.set("aria-rowindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowindex`: Self = this.set("aria-rowindex", js.undefined)
    
    @scala.inline
    def `setAria-rowspan`(value: js.Any): Self = this.set("aria-rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-rowspan`: Self = this.set("aria-rowspan", js.undefined)
    
    @scala.inline
    def `setAria-selected`(value: js.Any): Self = this.set("aria-selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-selected`: Self = this.set("aria-selected", js.undefined)
    
    @scala.inline
    def `setAria-setsize`(value: js.Any): Self = this.set("aria-setsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-setsize`: Self = this.set("aria-setsize", js.undefined)
    
    @scala.inline
    def `setAria-sort`(value: js.Any): Self = this.set("aria-sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-sort`: Self = this.set("aria-sort", js.undefined)
    
    @scala.inline
    def `setAria-valuemax`(value: js.Any): Self = this.set("aria-valuemax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuemax`: Self = this.set("aria-valuemax", js.undefined)
    
    @scala.inline
    def `setAria-valuemin`(value: js.Any): Self = this.set("aria-valuemin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuemin`: Self = this.set("aria-valuemin", js.undefined)
    
    @scala.inline
    def `setAria-valuenow`(value: js.Any): Self = this.set("aria-valuenow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuenow`: Self = this.set("aria-valuenow", js.undefined)
    
    @scala.inline
    def `setAria-valuetext`(value: js.Any): Self = this.set("aria-valuetext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-valuetext`: Self = this.set("aria-valuetext", js.undefined)
    
    @scala.inline
    def setAutoCapitalize(value: js.Any): Self = this.set("autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCapitalize: Self = this.set("autoCapitalize", js.undefined)
    
    @scala.inline
    def setAutoComplete(value: js.Any): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    
    @scala.inline
    def setAutoCorrect(value: js.Any): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: js.Any): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setAutoSave(value: js.Any): Self = this.set("autoSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSave: Self = this.set("autoSave", js.undefined)
    
    @scala.inline
    def setCacheMeasurements(value: js.Any): Self = this.set("cacheMeasurements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheMeasurements: Self = this.set("cacheMeasurements", js.undefined)
    
    @scala.inline
    def setClassName(value: js.Any): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColor(value: js.Any): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCols(value: js.Any): Self = this.set("cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    
    @scala.inline
    def setContentEditable(value: js.Any): Self = this.set("contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEditable: Self = this.set("contentEditable", js.undefined)
    
    @scala.inline
    def setContextMenu(value: js.Any): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    
    @scala.inline
    def setCss(value: js.Any): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setDangerouslySetInnerHTML(value: js.Any): Self = this.set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDangerouslySetInnerHTML: Self = this.set("dangerouslySetInnerHTML", js.undefined)
    
    @scala.inline
    def setDatatype(value: js.Any): Self = this.set("datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    
    @scala.inline
    def setDefaultChecked(value: js.Any): Self = this.set("defaultChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultChecked: Self = this.set("defaultChecked", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDir(value: js.Any): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setDirName(value: js.Any): Self = this.set("dirName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirName: Self = this.set("dirName", js.undefined)
    
    @scala.inline
    def setDisabled(value: js.Any): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDraggable(value: js.Any): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setForm(value: js.Any): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHidden(value: js.Any): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInlist(value: js.Any): Self = this.set("inlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlist: Self = this.set("inlist", js.undefined)
    
    @scala.inline
    def setInputMode(value: js.Any): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputMode: Self = this.set("inputMode", js.undefined)
    
    @scala.inline
    def setIs(value: js.Any): Self = this.set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    
    @scala.inline
    def setItemID(value: js.Any): Self = this.set("itemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemID: Self = this.set("itemID", js.undefined)
    
    @scala.inline
    def setItemProp(value: js.Any): Self = this.set("itemProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemProp: Self = this.set("itemProp", js.undefined)
    
    @scala.inline
    def setItemRef(value: js.Any): Self = this.set("itemRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemRef: Self = this.set("itemRef", js.undefined)
    
    @scala.inline
    def setItemScope(value: js.Any): Self = this.set("itemScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemScope: Self = this.set("itemScope", js.undefined)
    
    @scala.inline
    def setItemType(value: js.Any): Self = this.set("itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
    
    @scala.inline
    def setLang(value: js.Any): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setMaxLength(value: js.Any): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMaxRows(value: js.Any): Self = this.set("maxRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRows: Self = this.set("maxRows", js.undefined)
    
    @scala.inline
    def setMinLength(value: js.Any): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    
    @scala.inline
    def setMinRows(value: js.Any): Self = this.set("minRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinRows: Self = this.set("minRows", js.undefined)
    
    @scala.inline
    def setName(value: js.Any): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnAbort(value: js.Any): Self = this.set("onAbort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    
    @scala.inline
    def setOnAbortCapture(value: js.Any): Self = this.set("onAbortCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAbortCapture: Self = this.set("onAbortCapture", js.undefined)
    
    @scala.inline
    def setOnAnimationEnd(value: js.Any): Self = this.set("onAnimationEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnAnimationEndCapture(value: js.Any): Self = this.set("onAnimationEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAnimationEndCapture: Self = this.set("onAnimationEndCapture", js.undefined)
    
    @scala.inline
    def setOnAnimationIteration(value: js.Any): Self = this.set("onAnimationIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAnimationIteration: Self = this.set("onAnimationIteration", js.undefined)
    
    @scala.inline
    def setOnAnimationIterationCapture(value: js.Any): Self = this.set("onAnimationIterationCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAnimationIterationCapture: Self = this.set("onAnimationIterationCapture", js.undefined)
    
    @scala.inline
    def setOnAnimationStart(value: js.Any): Self = this.set("onAnimationStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAnimationStart: Self = this.set("onAnimationStart", js.undefined)
    
    @scala.inline
    def setOnAnimationStartCapture(value: js.Any): Self = this.set("onAnimationStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAnimationStartCapture: Self = this.set("onAnimationStartCapture", js.undefined)
    
    @scala.inline
    def setOnAuxClick(value: js.Any): Self = this.set("onAuxClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAuxClick: Self = this.set("onAuxClick", js.undefined)
    
    @scala.inline
    def setOnAuxClickCapture(value: js.Any): Self = this.set("onAuxClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAuxClickCapture: Self = this.set("onAuxClickCapture", js.undefined)
    
    @scala.inline
    def setOnBeforeInput(value: js.Any): Self = this.set("onBeforeInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBeforeInput: Self = this.set("onBeforeInput", js.undefined)
    
    @scala.inline
    def setOnBeforeInputCapture(value: js.Any): Self = this.set("onBeforeInputCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBeforeInputCapture: Self = this.set("onBeforeInputCapture", js.undefined)
    
    @scala.inline
    def setOnBlur(value: js.Any): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnBlurCapture(value: js.Any): Self = this.set("onBlurCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBlurCapture: Self = this.set("onBlurCapture", js.undefined)
    
    @scala.inline
    def setOnCanPlay(value: js.Any): Self = this.set("onCanPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCanPlay: Self = this.set("onCanPlay", js.undefined)
    
    @scala.inline
    def setOnCanPlayCapture(value: js.Any): Self = this.set("onCanPlayCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCanPlayCapture: Self = this.set("onCanPlayCapture", js.undefined)
    
    @scala.inline
    def setOnCanPlayThrough(value: js.Any): Self = this.set("onCanPlayThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCanPlayThrough: Self = this.set("onCanPlayThrough", js.undefined)
    
    @scala.inline
    def setOnCanPlayThroughCapture(value: js.Any): Self = this.set("onCanPlayThroughCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCanPlayThroughCapture: Self = this.set("onCanPlayThroughCapture", js.undefined)
    
    @scala.inline
    def setOnChange(value: js.Any): Self = this.set("onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnChangeCapture(value: js.Any): Self = this.set("onChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnChangeCapture: Self = this.set("onChangeCapture", js.undefined)
    
    @scala.inline
    def setOnClick(value: js.Any): Self = this.set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnClickCapture(value: js.Any): Self = this.set("onClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClickCapture: Self = this.set("onClickCapture", js.undefined)
    
    @scala.inline
    def setOnCompositionEnd(value: js.Any): Self = this.set("onCompositionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCompositionEnd: Self = this.set("onCompositionEnd", js.undefined)
    
    @scala.inline
    def setOnCompositionEndCapture(value: js.Any): Self = this.set("onCompositionEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCompositionEndCapture: Self = this.set("onCompositionEndCapture", js.undefined)
    
    @scala.inline
    def setOnCompositionStart(value: js.Any): Self = this.set("onCompositionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCompositionStart: Self = this.set("onCompositionStart", js.undefined)
    
    @scala.inline
    def setOnCompositionStartCapture(value: js.Any): Self = this.set("onCompositionStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCompositionStartCapture: Self = this.set("onCompositionStartCapture", js.undefined)
    
    @scala.inline
    def setOnCompositionUpdate(value: js.Any): Self = this.set("onCompositionUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCompositionUpdate: Self = this.set("onCompositionUpdate", js.undefined)
    
    @scala.inline
    def setOnCompositionUpdateCapture(value: js.Any): Self = this.set("onCompositionUpdateCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCompositionUpdateCapture: Self = this.set("onCompositionUpdateCapture", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: js.Any): Self = this.set("onContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    
    @scala.inline
    def setOnContextMenuCapture(value: js.Any): Self = this.set("onContextMenuCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnContextMenuCapture: Self = this.set("onContextMenuCapture", js.undefined)
    
    @scala.inline
    def setOnCopy(value: js.Any): Self = this.set("onCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCopy: Self = this.set("onCopy", js.undefined)
    
    @scala.inline
    def setOnCopyCapture(value: js.Any): Self = this.set("onCopyCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCopyCapture: Self = this.set("onCopyCapture", js.undefined)
    
    @scala.inline
    def setOnCut(value: js.Any): Self = this.set("onCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCut: Self = this.set("onCut", js.undefined)
    
    @scala.inline
    def setOnCutCapture(value: js.Any): Self = this.set("onCutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCutCapture: Self = this.set("onCutCapture", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: js.Any): Self = this.set("onDoubleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnDoubleClickCapture(value: js.Any): Self = this.set("onDoubleClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDoubleClickCapture: Self = this.set("onDoubleClickCapture", js.undefined)
    
    @scala.inline
    def setOnDrag(value: js.Any): Self = this.set("onDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    
    @scala.inline
    def setOnDragCapture(value: js.Any): Self = this.set("onDragCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragCapture: Self = this.set("onDragCapture", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: js.Any): Self = this.set("onDragEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragEndCapture(value: js.Any): Self = this.set("onDragEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragEndCapture: Self = this.set("onDragEndCapture", js.undefined)
    
    @scala.inline
    def setOnDragEnter(value: js.Any): Self = this.set("onDragEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    
    @scala.inline
    def setOnDragEnterCapture(value: js.Any): Self = this.set("onDragEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragEnterCapture: Self = this.set("onDragEnterCapture", js.undefined)
    
    @scala.inline
    def setOnDragExit(value: js.Any): Self = this.set("onDragExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragExit: Self = this.set("onDragExit", js.undefined)
    
    @scala.inline
    def setOnDragExitCapture(value: js.Any): Self = this.set("onDragExitCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragExitCapture: Self = this.set("onDragExitCapture", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: js.Any): Self = this.set("onDragLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    
    @scala.inline
    def setOnDragLeaveCapture(value: js.Any): Self = this.set("onDragLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragLeaveCapture: Self = this.set("onDragLeaveCapture", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: js.Any): Self = this.set("onDragOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragOverCapture(value: js.Any): Self = this.set("onDragOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragOverCapture: Self = this.set("onDragOverCapture", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: js.Any): Self = this.set("onDragStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnDragStartCapture(value: js.Any): Self = this.set("onDragStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragStartCapture: Self = this.set("onDragStartCapture", js.undefined)
    
    @scala.inline
    def setOnDrop(value: js.Any): Self = this.set("onDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    
    @scala.inline
    def setOnDropCapture(value: js.Any): Self = this.set("onDropCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDropCapture: Self = this.set("onDropCapture", js.undefined)
    
    @scala.inline
    def setOnDurationChange(value: js.Any): Self = this.set("onDurationChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDurationChange: Self = this.set("onDurationChange", js.undefined)
    
    @scala.inline
    def setOnDurationChangeCapture(value: js.Any): Self = this.set("onDurationChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDurationChangeCapture: Self = this.set("onDurationChangeCapture", js.undefined)
    
    @scala.inline
    def setOnEmptied(value: js.Any): Self = this.set("onEmptied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEmptied: Self = this.set("onEmptied", js.undefined)
    
    @scala.inline
    def setOnEmptiedCapture(value: js.Any): Self = this.set("onEmptiedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEmptiedCapture: Self = this.set("onEmptiedCapture", js.undefined)
    
    @scala.inline
    def setOnEncrypted(value: js.Any): Self = this.set("onEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEncrypted: Self = this.set("onEncrypted", js.undefined)
    
    @scala.inline
    def setOnEncryptedCapture(value: js.Any): Self = this.set("onEncryptedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEncryptedCapture: Self = this.set("onEncryptedCapture", js.undefined)
    
    @scala.inline
    def setOnEnded(value: js.Any): Self = this.set("onEnded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    
    @scala.inline
    def setOnEndedCapture(value: js.Any): Self = this.set("onEndedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEndedCapture: Self = this.set("onEndedCapture", js.undefined)
    
    @scala.inline
    def setOnError(value: js.Any): Self = this.set("onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnErrorCapture(value: js.Any): Self = this.set("onErrorCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnErrorCapture: Self = this.set("onErrorCapture", js.undefined)
    
    @scala.inline
    def setOnFocus(value: js.Any): Self = this.set("onFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnFocusCapture(value: js.Any): Self = this.set("onFocusCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFocusCapture: Self = this.set("onFocusCapture", js.undefined)
    
    @scala.inline
    def setOnGotPointerCapture(value: js.Any): Self = this.set("onGotPointerCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnGotPointerCapture: Self = this.set("onGotPointerCapture", js.undefined)
    
    @scala.inline
    def setOnGotPointerCaptureCapture(value: js.Any): Self = this.set("onGotPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnGotPointerCaptureCapture: Self = this.set("onGotPointerCaptureCapture", js.undefined)
    
    @scala.inline
    def setOnHeightChange(value: js.Any): Self = this.set("onHeightChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnHeightChange: Self = this.set("onHeightChange", js.undefined)
    
    @scala.inline
    def setOnInput(value: js.Any): Self = this.set("onInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    
    @scala.inline
    def setOnInputCapture(value: js.Any): Self = this.set("onInputCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnInputCapture: Self = this.set("onInputCapture", js.undefined)
    
    @scala.inline
    def setOnInvalid(value: js.Any): Self = this.set("onInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnInvalid: Self = this.set("onInvalid", js.undefined)
    
    @scala.inline
    def setOnInvalidCapture(value: js.Any): Self = this.set("onInvalidCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnInvalidCapture: Self = this.set("onInvalidCapture", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: js.Any): Self = this.set("onKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyDownCapture(value: js.Any): Self = this.set("onKeyDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyDownCapture: Self = this.set("onKeyDownCapture", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: js.Any): Self = this.set("onKeyPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    
    @scala.inline
    def setOnKeyPressCapture(value: js.Any): Self = this.set("onKeyPressCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyPressCapture: Self = this.set("onKeyPressCapture", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: js.Any): Self = this.set("onKeyUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    
    @scala.inline
    def setOnKeyUpCapture(value: js.Any): Self = this.set("onKeyUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyUpCapture: Self = this.set("onKeyUpCapture", js.undefined)
    
    @scala.inline
    def setOnLoad(value: js.Any): Self = this.set("onLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnLoadCapture(value: js.Any): Self = this.set("onLoadCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadCapture: Self = this.set("onLoadCapture", js.undefined)
    
    @scala.inline
    def setOnLoadStart(value: js.Any): Self = this.set("onLoadStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLoadStartCapture(value: js.Any): Self = this.set("onLoadStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadStartCapture: Self = this.set("onLoadStartCapture", js.undefined)
    
    @scala.inline
    def setOnLoadedData(value: js.Any): Self = this.set("onLoadedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadedData: Self = this.set("onLoadedData", js.undefined)
    
    @scala.inline
    def setOnLoadedDataCapture(value: js.Any): Self = this.set("onLoadedDataCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadedDataCapture: Self = this.set("onLoadedDataCapture", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadata(value: js.Any): Self = this.set("onLoadedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadedMetadata: Self = this.set("onLoadedMetadata", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadataCapture(value: js.Any): Self = this.set("onLoadedMetadataCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadedMetadataCapture: Self = this.set("onLoadedMetadataCapture", js.undefined)
    
    @scala.inline
    def setOnLostPointerCapture(value: js.Any): Self = this.set("onLostPointerCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLostPointerCapture: Self = this.set("onLostPointerCapture", js.undefined)
    
    @scala.inline
    def setOnLostPointerCaptureCapture(value: js.Any): Self = this.set("onLostPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLostPointerCaptureCapture: Self = this.set("onLostPointerCaptureCapture", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: js.Any): Self = this.set("onMouseDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseDownCapture(value: js.Any): Self = this.set("onMouseDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseDownCapture: Self = this.set("onMouseDownCapture", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: js.Any): Self = this.set("onMouseEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: js.Any): Self = this.set("onMouseLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: js.Any): Self = this.set("onMouseMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseMoveCapture(value: js.Any): Self = this.set("onMouseMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseMoveCapture: Self = this.set("onMouseMoveCapture", js.undefined)
    
    @scala.inline
    def setOnMouseOut(value: js.Any): Self = this.set("onMouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseOutCapture(value: js.Any): Self = this.set("onMouseOutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseOutCapture: Self = this.set("onMouseOutCapture", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: js.Any): Self = this.set("onMouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    
    @scala.inline
    def setOnMouseOverCapture(value: js.Any): Self = this.set("onMouseOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseOverCapture: Self = this.set("onMouseOverCapture", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: js.Any): Self = this.set("onMouseUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    
    @scala.inline
    def setOnMouseUpCapture(value: js.Any): Self = this.set("onMouseUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseUpCapture: Self = this.set("onMouseUpCapture", js.undefined)
    
    @scala.inline
    def setOnPaste(value: js.Any): Self = this.set("onPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPaste: Self = this.set("onPaste", js.undefined)
    
    @scala.inline
    def setOnPasteCapture(value: js.Any): Self = this.set("onPasteCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPasteCapture: Self = this.set("onPasteCapture", js.undefined)
    
    @scala.inline
    def setOnPause(value: js.Any): Self = this.set("onPause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    
    @scala.inline
    def setOnPauseCapture(value: js.Any): Self = this.set("onPauseCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPauseCapture: Self = this.set("onPauseCapture", js.undefined)
    
    @scala.inline
    def setOnPlay(value: js.Any): Self = this.set("onPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    
    @scala.inline
    def setOnPlayCapture(value: js.Any): Self = this.set("onPlayCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPlayCapture: Self = this.set("onPlayCapture", js.undefined)
    
    @scala.inline
    def setOnPlaying(value: js.Any): Self = this.set("onPlaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPlaying: Self = this.set("onPlaying", js.undefined)
    
    @scala.inline
    def setOnPlayingCapture(value: js.Any): Self = this.set("onPlayingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPlayingCapture: Self = this.set("onPlayingCapture", js.undefined)
    
    @scala.inline
    def setOnPointerCancel(value: js.Any): Self = this.set("onPointerCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerCancel: Self = this.set("onPointerCancel", js.undefined)
    
    @scala.inline
    def setOnPointerCancelCapture(value: js.Any): Self = this.set("onPointerCancelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerCancelCapture: Self = this.set("onPointerCancelCapture", js.undefined)
    
    @scala.inline
    def setOnPointerDown(value: js.Any): Self = this.set("onPointerDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerDown: Self = this.set("onPointerDown", js.undefined)
    
    @scala.inline
    def setOnPointerDownCapture(value: js.Any): Self = this.set("onPointerDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerDownCapture: Self = this.set("onPointerDownCapture", js.undefined)
    
    @scala.inline
    def setOnPointerEnter(value: js.Any): Self = this.set("onPointerEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerEnter: Self = this.set("onPointerEnter", js.undefined)
    
    @scala.inline
    def setOnPointerEnterCapture(value: js.Any): Self = this.set("onPointerEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerEnterCapture: Self = this.set("onPointerEnterCapture", js.undefined)
    
    @scala.inline
    def setOnPointerLeave(value: js.Any): Self = this.set("onPointerLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerLeave: Self = this.set("onPointerLeave", js.undefined)
    
    @scala.inline
    def setOnPointerLeaveCapture(value: js.Any): Self = this.set("onPointerLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerLeaveCapture: Self = this.set("onPointerLeaveCapture", js.undefined)
    
    @scala.inline
    def setOnPointerMove(value: js.Any): Self = this.set("onPointerMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerMove: Self = this.set("onPointerMove", js.undefined)
    
    @scala.inline
    def setOnPointerMoveCapture(value: js.Any): Self = this.set("onPointerMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerMoveCapture: Self = this.set("onPointerMoveCapture", js.undefined)
    
    @scala.inline
    def setOnPointerOut(value: js.Any): Self = this.set("onPointerOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerOut: Self = this.set("onPointerOut", js.undefined)
    
    @scala.inline
    def setOnPointerOutCapture(value: js.Any): Self = this.set("onPointerOutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerOutCapture: Self = this.set("onPointerOutCapture", js.undefined)
    
    @scala.inline
    def setOnPointerOver(value: js.Any): Self = this.set("onPointerOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerOver: Self = this.set("onPointerOver", js.undefined)
    
    @scala.inline
    def setOnPointerOverCapture(value: js.Any): Self = this.set("onPointerOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerOverCapture: Self = this.set("onPointerOverCapture", js.undefined)
    
    @scala.inline
    def setOnPointerUp(value: js.Any): Self = this.set("onPointerUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerUp: Self = this.set("onPointerUp", js.undefined)
    
    @scala.inline
    def setOnPointerUpCapture(value: js.Any): Self = this.set("onPointerUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerUpCapture: Self = this.set("onPointerUpCapture", js.undefined)
    
    @scala.inline
    def setOnProgress(value: js.Any): Self = this.set("onProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    
    @scala.inline
    def setOnProgressCapture(value: js.Any): Self = this.set("onProgressCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnProgressCapture: Self = this.set("onProgressCapture", js.undefined)
    
    @scala.inline
    def setOnRateChange(value: js.Any): Self = this.set("onRateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnRateChange: Self = this.set("onRateChange", js.undefined)
    
    @scala.inline
    def setOnRateChangeCapture(value: js.Any): Self = this.set("onRateChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnRateChangeCapture: Self = this.set("onRateChangeCapture", js.undefined)
    
    @scala.inline
    def setOnReset(value: js.Any): Self = this.set("onReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    
    @scala.inline
    def setOnResetCapture(value: js.Any): Self = this.set("onResetCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResetCapture: Self = this.set("onResetCapture", js.undefined)
    
    @scala.inline
    def setOnScroll(value: js.Any): Self = this.set("onScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnScrollCapture(value: js.Any): Self = this.set("onScrollCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnScrollCapture: Self = this.set("onScrollCapture", js.undefined)
    
    @scala.inline
    def setOnSeeked(value: js.Any): Self = this.set("onSeeked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSeeked: Self = this.set("onSeeked", js.undefined)
    
    @scala.inline
    def setOnSeekedCapture(value: js.Any): Self = this.set("onSeekedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSeekedCapture: Self = this.set("onSeekedCapture", js.undefined)
    
    @scala.inline
    def setOnSeeking(value: js.Any): Self = this.set("onSeeking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSeeking: Self = this.set("onSeeking", js.undefined)
    
    @scala.inline
    def setOnSeekingCapture(value: js.Any): Self = this.set("onSeekingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSeekingCapture: Self = this.set("onSeekingCapture", js.undefined)
    
    @scala.inline
    def setOnSelect(value: js.Any): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOnSelectCapture(value: js.Any): Self = this.set("onSelectCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelectCapture: Self = this.set("onSelectCapture", js.undefined)
    
    @scala.inline
    def setOnStalled(value: js.Any): Self = this.set("onStalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStalled: Self = this.set("onStalled", js.undefined)
    
    @scala.inline
    def setOnStalledCapture(value: js.Any): Self = this.set("onStalledCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStalledCapture: Self = this.set("onStalledCapture", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: js.Any): Self = this.set("onSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    
    @scala.inline
    def setOnSubmitCapture(value: js.Any): Self = this.set("onSubmitCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSubmitCapture: Self = this.set("onSubmitCapture", js.undefined)
    
    @scala.inline
    def setOnSuspend(value: js.Any): Self = this.set("onSuspend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSuspend: Self = this.set("onSuspend", js.undefined)
    
    @scala.inline
    def setOnSuspendCapture(value: js.Any): Self = this.set("onSuspendCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSuspendCapture: Self = this.set("onSuspendCapture", js.undefined)
    
    @scala.inline
    def setOnTimeUpdate(value: js.Any): Self = this.set("onTimeUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTimeUpdate: Self = this.set("onTimeUpdate", js.undefined)
    
    @scala.inline
    def setOnTimeUpdateCapture(value: js.Any): Self = this.set("onTimeUpdateCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTimeUpdateCapture: Self = this.set("onTimeUpdateCapture", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: js.Any): Self = this.set("onTouchCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchCancelCapture(value: js.Any): Self = this.set("onTouchCancelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchCancelCapture: Self = this.set("onTouchCancelCapture", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: js.Any): Self = this.set("onTouchEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchEndCapture(value: js.Any): Self = this.set("onTouchEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchEndCapture: Self = this.set("onTouchEndCapture", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: js.Any): Self = this.set("onTouchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchMoveCapture(value: js.Any): Self = this.set("onTouchMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchMoveCapture: Self = this.set("onTouchMoveCapture", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: js.Any): Self = this.set("onTouchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    
    @scala.inline
    def setOnTouchStartCapture(value: js.Any): Self = this.set("onTouchStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchStartCapture: Self = this.set("onTouchStartCapture", js.undefined)
    
    @scala.inline
    def setOnTransitionEnd(value: js.Any): Self = this.set("onTransitionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    
    @scala.inline
    def setOnTransitionEndCapture(value: js.Any): Self = this.set("onTransitionEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTransitionEndCapture: Self = this.set("onTransitionEndCapture", js.undefined)
    
    @scala.inline
    def setOnVolumeChange(value: js.Any): Self = this.set("onVolumeChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnVolumeChange: Self = this.set("onVolumeChange", js.undefined)
    
    @scala.inline
    def setOnVolumeChangeCapture(value: js.Any): Self = this.set("onVolumeChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnVolumeChangeCapture: Self = this.set("onVolumeChangeCapture", js.undefined)
    
    @scala.inline
    def setOnWaiting(value: js.Any): Self = this.set("onWaiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnWaiting: Self = this.set("onWaiting", js.undefined)
    
    @scala.inline
    def setOnWaitingCapture(value: js.Any): Self = this.set("onWaitingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnWaitingCapture: Self = this.set("onWaitingCapture", js.undefined)
    
    @scala.inline
    def setOnWheel(value: js.Any): Self = this.set("onWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
    
    @scala.inline
    def setOnWheelCapture(value: js.Any): Self = this.set("onWheelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnWheelCapture: Self = this.set("onWheelCapture", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: js.Any): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPrefix(value: js.Any): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setProperty(value: js.Any): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    
    @scala.inline
    def setRadioGroup(value: js.Any): Self = this.set("radioGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadioGroup: Self = this.set("radioGroup", js.undefined)
    
    @scala.inline
    def setReadOnly(value: js.Any): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setRefRefObject(value: ReactRef[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: Ref[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    
    @scala.inline
    def setRequired(value: js.Any): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setResource(value: js.Any): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setResults(value: js.Any): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    
    @scala.inline
    def setRole(value: js.Any): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setRows(value: js.Any): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setSecurity(value: js.Any): Self = this.set("security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
    
    @scala.inline
    def setSize(value: Sizes): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSlot(value: js.Any): Self = this.set("slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
    
    @scala.inline
    def setSpellCheck(value: js.Any): Self = this.set("spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellCheck: Self = this.set("spellCheck", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSuppressContentEditableWarning(value: js.Any): Self = this.set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressContentEditableWarning: Self = this.set("suppressContentEditableWarning", js.undefined)
    
    @scala.inline
    def setSuppressHydrationWarning(value: js.Any): Self = this.set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressHydrationWarning: Self = this.set("suppressHydrationWarning", js.undefined)
    
    @scala.inline
    def setTabIndex(value: js.Any): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTheme(value: typingsSlinky.storybookTheming.typesMod.Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTitle(value: js.Any): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTranslate(value: js.Any): Self = this.set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    
    @scala.inline
    def setTypeof(value: js.Any): Self = this.set("typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeof: Self = this.set("typeof", js.undefined)
    
    @scala.inline
    def setUnselectable(value: js.Any): Self = this.set("unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnselectable: Self = this.set("unselectable", js.undefined)
    
    @scala.inline
    def setValid(value: ValidationStates): Self = this.set("valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setVocab(value: js.Any): Self = this.set("vocab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVocab: Self = this.set("vocab", js.undefined)
    
    @scala.inline
    def setWrap(value: js.Any): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
}
