package typingsSlinky.storybookComponents.anon

import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.TagMod
import slinky.core.facade.ReactRef
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.AnimationEventHandler
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEvent
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

/* Inlined react.react.WeakValidationMap<std.Pick<std.Pick<react-textarea-autosize.react-textarea-autosize.TextareaAutosizeProps, 'color' | 'content' | 'height' | 'translate' | 'width' | 'start' | 'hidden' | 'style' | 'default' | 'wrap' | 'open' | 'multiple' | 'disabled' | 'ref' | 'key' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'slot' | 'spellCheck' | 'tabIndex' | 'title' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'href' | 'cite' | 'data' | 'form' | 'label' | 'span' | 'summary' | 'pattern' | 'cellPadding' | 'cellSpacing' | 'alt' | 'crossOrigin' | 'sizes' | 'src' | 'srcSet' | 'useMap' | 'value' | 'reversed' | 'type' | 'max' | 'media' | 'method' | 'min' | 'name' | 'target' | 'list' | 'step' | 'download' | 'hrefLang' | 'rel' | 'autoFocus' | 'formAction' | 'formEncType' | 'formMethod' | 'formNoValidate' | 'formTarget' | 'htmlFor' | 'accept' | 'acceptCharset' | 'action' | 'allowFullScreen' | 'allowTransparency' | 'as' | 'async' | 'autoComplete' | 'autoPlay' | 'capture' | 'charSet' | 'challenge' | 'checked' | 'classID' | 'cols' | 'colSpan' | 'controls' | 'coords' | 'dateTime' | 'defer' | 'encType' | 'frameBorder' | 'headers' | 'high' | 'httpEquiv' | 'integrity' | 'keyParams' | 'keyType' | 'kind' | 'loop' | 'low' | 'manifest' | 'marginHeight' | 'marginWidth' | 'maxLength' | 'mediaGroup' | 'minLength' | 'muted' | 'nonce' | 'noValidate' | 'optimum' | 'playsInline' | 'poster' | 'preload' | 'readOnly' | 'required' | 'rows' | 'rowSpan' | 'sandbox' | 'scope' | 'scoped' | 'scrolling' | 'seamless' | 'selected' | 'shape' | 'srcDoc' | 'srcLang' | 'wmode' | 'onHeightChange' | 'useCacheForDOMMeasurements' | 'minRows' | 'maxRows' | 'inputRef'> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps, 'color' | 'content' | 'height' | 'translate' | 'width' | 'start' | 'hidden' | 'size' | 'style' | 'default' | 'wrap' | 'open' | 'multiple' | 'disabled' | 'key' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'slot' | 'spellCheck' | 'tabIndex' | 'title' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'href' | 'cite' | 'data' | 'form' | 'label' | 'span' | 'summary' | 'pattern' | 'cellPadding' | 'cellSpacing' | 'alt' | 'crossOrigin' | 'sizes' | 'src' | 'srcSet' | 'useMap' | 'value' | 'reversed' | 'type' | 'max' | 'media' | 'method' | 'min' | 'name' | 'target' | 'list' | 'step' | 'download' | 'hrefLang' | 'rel' | 'autoFocus' | 'formAction' | 'formEncType' | 'formMethod' | 'formNoValidate' | 'formTarget' | 'htmlFor' | 'valid' | 'align' | 'accept' | 'acceptCharset' | 'action' | 'allowFullScreen' | 'allowTransparency' | 'as' | 'async' | 'autoComplete' | 'autoPlay' | 'capture' | 'charSet' | 'challenge' | 'checked' | 'classID' | 'cols' | 'colSpan' | 'controls' | 'coords' | 'dateTime' | 'defer' | 'encType' | 'frameBorder' | 'headers' | 'high' | 'httpEquiv' | 'integrity' | 'keyParams' | 'keyType' | 'kind' | 'loop' | 'low' | 'manifest' | 'marginHeight' | 'marginWidth' | 'maxLength' | 'mediaGroup' | 'minLength' | 'muted' | 'nonce' | 'noValidate' | 'optimum' | 'playsInline' | 'poster' | 'preload' | 'readOnly' | 'required' | 'rows' | 'rowSpan' | 'sandbox' | 'scope' | 'scoped' | 'scrolling' | 'seamless' | 'selected' | 'shape' | 'srcDoc' | 'srcLang' | 'wmode' | 'onHeightChange' | 'useCacheForDOMMeasurements' | 'minRows' | 'maxRows' | 'inputRef'> & react.react.RefAttributes<any> & std.Pick<react-textarea-autosize.react-textarea-autosize.TextareaAutosizeProps, 'color' | 'content' | 'height' | 'translate' | 'width' | 'start' | 'hidden' | 'style' | 'default' | 'wrap' | 'open' | 'multiple' | 'disabled' | 'ref' | 'key' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'slot' | 'spellCheck' | 'tabIndex' | 'title' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'href' | 'cite' | 'data' | 'form' | 'label' | 'span' | 'summary' | 'pattern' | 'cellPadding' | 'cellSpacing' | 'alt' | 'crossOrigin' | 'sizes' | 'src' | 'srcSet' | 'useMap' | 'value' | 'reversed' | 'type' | 'max' | 'media' | 'method' | 'min' | 'name' | 'target' | 'list' | 'step' | 'download' | 'hrefLang' | 'rel' | 'autoFocus' | 'formAction' | 'formEncType' | 'formMethod' | 'formNoValidate' | 'formTarget' | 'htmlFor' | 'accept' | 'acceptCharset' | 'action' | 'allowFullScreen' | 'allowTransparency' | 'as' | 'async' | 'autoComplete' | 'autoPlay' | 'capture' | 'charSet' | 'challenge' | 'checked' | 'classID' | 'cols' | 'colSpan' | 'controls' | 'coords' | 'dateTime' | 'defer' | 'encType' | 'frameBorder' | 'headers' | 'high' | 'httpEquiv' | 'integrity' | 'keyParams' | 'keyType' | 'kind' | 'loop' | 'low' | 'manifest' | 'marginHeight' | 'marginWidth' | 'maxLength' | 'mediaGroup' | 'minLength' | 'muted' | 'nonce' | 'noValidate' | 'optimum' | 'playsInline' | 'poster' | 'preload' | 'readOnly' | 'required' | 'rows' | 'rowSpan' | 'sandbox' | 'scope' | 'scoped' | 'scrolling' | 'seamless' | 'selected' | 'shape' | 'srcDoc' | 'srcLang' | 'wmode' | 'onHeightChange' | 'useCacheForDOMMeasurements' | 'minRows' | 'maxRows' | 'inputRef'> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps & @emotion/styled-base.anon.ThemeTheme<@storybook/theming.@storybook/theming.Theme>> */
@js.native
trait WeakValidationMapPickPickAbout extends js.Object {
  var about: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var accept: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var acceptCharset: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var accessKey: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var action: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var align: js.UndefOr[Validator[js.UndefOr[Alignments | Null]]] = js.native
  var allowFullScreen: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var allowTransparency: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var alt: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
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
  var as: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var async: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var autoCapitalize: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var autoComplete: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var autoCorrect: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var autoFocus: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var autoPlay: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var autoSave: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var capture: js.UndefOr[Validator[js.UndefOr[Boolean | Null | String]]] = js.native
  var cellPadding: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.native
  var cellSpacing: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.native
  var challenge: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var charSet: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var checked: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var children: js.UndefOr[Validator[js.UndefOr[Null | TagMod[Any]]]] = js.native
  var cite: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var classID: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var colSpan: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var color: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var cols: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var content: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var contentEditable: js.UndefOr[Validator[js.UndefOr[inherit | Booleanish | Null]]] = js.native
  var contextMenu: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var controls: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var coords: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var crossOrigin: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var css: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var dangerouslySetInnerHTML: js.UndefOr[Validator[js.UndefOr[Html | Null]]] = js.native
  var data: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var datatype: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var dateTime: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var default: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var defaultChecked: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var defaultValue: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Double | Null | String]]] = js.native
  var defer: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var dir: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var download: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var draggable: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.native
  var encType: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var form: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var formAction: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var formEncType: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var formMethod: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var formNoValidate: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var formTarget: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var frameBorder: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.native
  var headers: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var height: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.native
  var hidden: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var high: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var href: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var hrefLang: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var htmlFor: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var httpEquiv: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var inlist: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var inputMode: js.UndefOr[
    Validator[js.UndefOr[none | text | tel | url | email | numeric | decimal | search | Null]]
  ] = js.native
  var inputRef: js.UndefOr[
    Validator[
      js.UndefOr[
        (js.Function1[/* node */ HTMLTextAreaElement, Unit]) | Null | ReactRef[HTMLTextAreaElement]
      ]
    ]
  ] = js.native
  var integrity: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var is: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var itemID: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var itemProp: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var itemRef: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var itemScope: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var itemType: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var key: js.UndefOr[Validator[js.UndefOr[Key | Null]]] = js.native
  var keyParams: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var keyType: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var kind: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var label: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var lang: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var list: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var loop: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var low: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var manifest: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var marginHeight: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var marginWidth: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var max: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.native
  var maxLength: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var maxRows: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var media: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var mediaGroup: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var method: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var min: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.native
  var minLength: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var minRows: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var multiple: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var muted: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var name: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var noValidate: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var nonce: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var onAbort: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onAbortCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onAnimationEnd: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onAnimationEndCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onAnimationIteration: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onAnimationIterationCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onAnimationStart: js.UndefOr[Validator[js.UndefOr[AnimationEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onAnimationStartCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onAuxClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onAuxClickCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onBeforeInput: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onBeforeInputCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onBlur: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onBlurCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCanPlay: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onCanPlayCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCanPlayThrough: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onCanPlayThroughCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onChange: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* event */ ChangeEvent[HTMLTextAreaElement], Unit]) | Null]
    ]
  ] = js.native
  var onChangeCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onClickCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCompositionEnd: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onCompositionEndCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCompositionStart: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onCompositionStartCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCompositionUpdate: js.UndefOr[Validator[js.UndefOr[CompositionEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onCompositionUpdateCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onContextMenu: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onContextMenuCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCopy: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onCopyCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onCut: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onCutCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDoubleClick: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onDoubleClickCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDrag: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onDragCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragEnd: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onDragEndCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragEnter: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onDragEnterCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragExit: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onDragExitCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragLeave: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onDragLeaveCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragOver: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onDragOverCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDragStart: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onDragStartCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDrop: js.UndefOr[Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onDropCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onDurationChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onDurationChangeCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onEmptied: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onEmptiedCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onEncrypted: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onEncryptedCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onEnded: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onEndedCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onError: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onErrorCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onFocus: js.UndefOr[Validator[js.UndefOr[FocusEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onFocusCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onGotPointerCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onGotPointerCaptureCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onHeightChange: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* height */ Double, Unit]) | Null]]] = js.native
  var onInput: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onInputCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onInvalid: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onInvalidCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onKeyDown: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onKeyDownCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onKeyPress: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onKeyPressCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onKeyUp: js.UndefOr[Validator[js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onKeyUpCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLoad: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onLoadCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLoadStart: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onLoadStartCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLoadedData: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onLoadedDataCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLoadedMetadata: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onLoadedMetadataCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLostPointerCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onLostPointerCaptureCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onMouseDown: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onMouseDownCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onMouseEnter: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onMouseLeave: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onMouseMove: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onMouseMoveCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onMouseOut: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onMouseOutCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onMouseOver: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onMouseOverCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onMouseUp: js.UndefOr[Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onMouseUpCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPaste: js.UndefOr[Validator[js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onPasteCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPause: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onPauseCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPlay: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onPlayCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPlaying: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onPlayingCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerCancel: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLTextAreaElement]]]] = js.native
  var onPointerCancelCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerDown: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLTextAreaElement]]]] = js.native
  var onPointerDownCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerEnter: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLTextAreaElement]]]] = js.native
  var onPointerEnterCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerLeave: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLTextAreaElement]]]] = js.native
  var onPointerLeaveCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerMove: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLTextAreaElement]]]] = js.native
  var onPointerMoveCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerOut: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLTextAreaElement]]]] = js.native
  var onPointerOutCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerOver: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLTextAreaElement]]]] = js.native
  var onPointerOverCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onPointerUp: js.UndefOr[Validator[js.UndefOr[Null | PointerEventHandler[HTMLTextAreaElement]]]] = js.native
  var onPointerUpCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onProgress: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onProgressCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onRateChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onRateChangeCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onReset: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onResetCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onScroll: js.UndefOr[Validator[js.UndefOr[Null | UIEventHandler[HTMLTextAreaElement]]]] = js.native
  var onScrollCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onSeeked: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onSeekedCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onSeeking: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onSeekingCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onSelect: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onSelectCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onStalled: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onStalledCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onSubmit: js.UndefOr[Validator[js.UndefOr[FormEventHandler[HTMLTextAreaElement] | Null]]] = js.native
  var onSubmitCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onSuspend: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onSuspendCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTimeUpdate: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onTimeUpdateCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTouchCancel: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLTextAreaElement]]]] = js.native
  var onTouchCancelCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTouchEnd: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLTextAreaElement]]]] = js.native
  var onTouchEndCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTouchMove: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLTextAreaElement]]]] = js.native
  var onTouchMoveCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTouchStart: js.UndefOr[Validator[js.UndefOr[Null | TouchEventHandler[HTMLTextAreaElement]]]] = js.native
  var onTouchStartCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onTransitionEnd: js.UndefOr[Validator[js.UndefOr[Null | TransitionEventHandler[HTMLTextAreaElement]]]] = js.native
  var onTransitionEndCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onVolumeChange: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onVolumeChangeCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onWaiting: js.UndefOr[Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]] = js.native
  var onWaitingCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var onWheel: js.UndefOr[Validator[js.UndefOr[Null | WheelEventHandler[HTMLTextAreaElement]]]] = js.native
  var onWheelCapture: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var open: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var optimum: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var pattern: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var placeholder: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var playsInline: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var poster: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var prefix: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var preload: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var property: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var radioGroup: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var readOnly: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var ref: js.UndefOr[Validator[js.UndefOr[Null | Ref[_]]]] = js.native
  var rel: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var required: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var resource: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var results: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var reversed: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var role: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var rowSpan: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var rows: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var sandbox: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var scope: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var scoped: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var scrolling: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var seamless: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var security: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var selected: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var shape: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var size: js.UndefOr[Validator[js.UndefOr[Null | Sizes]]] = js.native
  var sizes: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var slot: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var span: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var spellCheck: js.UndefOr[Validator[js.UndefOr[Booleanish | Null]]] = js.native
  var src: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var srcDoc: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var srcLang: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var srcSet: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var start: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var step: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.native
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.native
  var summary: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var suppressContentEditableWarning: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var suppressHydrationWarning: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var tabIndex: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var target: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var theme: js.UndefOr[Validator[js.UndefOr[Null | typingsSlinky.storybookTheming.typesMod.Theme]]] = js.native
  var title: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var translate: js.UndefOr[Validator[js.UndefOr[yes | no | Null]]] = js.native
  var `type`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var typeof: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var unselectable: js.UndefOr[Validator[js.UndefOr[on | off | Null]]] = js.native
  var useCacheForDOMMeasurements: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var useMap: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var valid: js.UndefOr[Validator[js.UndefOr[Null | ValidationStates]]] = js.native
  var value: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var vocab: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var width: js.UndefOr[Validator[js.UndefOr[Double | Null | String]]] = js.native
  var wmode: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var wrap: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
}

object WeakValidationMapPickPickAbout {
  @scala.inline
  def apply(): WeakValidationMapPickPickAbout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapPickPickAbout]
  }
  @scala.inline
  implicit class WeakValidationMapPickPickAboutOps[Self <: WeakValidationMapPickPickAbout] (val x: Self) extends AnyVal {
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
    def withAccept(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.undefined)
        ret
    }
    @scala.inline
    def withAcceptCharset(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptCharset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptCharset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptCharset")(js.undefined)
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
    def withAction(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
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
    def withAllowFullScreen(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFullScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFullScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowTransparency(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTransparency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTransparency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTransparency")(js.undefined)
        ret
    }
    @scala.inline
    def withAlt(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(js.undefined)
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
    def withAs(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def withAsync(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
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
    def withAutoPlay(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(js.undefined)
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
    def withCapture(value: Validator[js.UndefOr[Boolean | Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(js.undefined)
        ret
    }
    @scala.inline
    def withCellPadding(value: Validator[js.UndefOr[Double | Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withCellSpacing(value: Validator[js.UndefOr[Double | Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withChallenge(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challenge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChallenge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challenge")(js.undefined)
        ret
    }
    @scala.inline
    def withCharSet(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charSet")(js.undefined)
        ret
    }
    @scala.inline
    def withChecked(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
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
    def withCite(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cite")(js.undefined)
        ret
    }
    @scala.inline
    def withClassID(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classID")(js.undefined)
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
    def withColSpan(value: Validator[js.UndefOr[Double | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSpan")(js.undefined)
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
    def withCols(value: Validator[js.UndefOr[Double | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def withControls(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withCoords(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossOrigin(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def withData(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
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
    def withDateTime(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
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
    def withDefer(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defer")(js.undefined)
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
    def withDownload(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(js.undefined)
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
    def withEncType(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encType")(js.undefined)
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
    def withFormAction(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formAction")(js.undefined)
        ret
    }
    @scala.inline
    def withFormEncType(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formEncType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormEncType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formEncType")(js.undefined)
        ret
    }
    @scala.inline
    def withFormMethod(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withFormNoValidate(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formNoValidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormNoValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formNoValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withFormTarget(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameBorder(value: Validator[js.UndefOr[Double | Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Validator[js.UndefOr[Double | Null | String]]): Self = {
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
    def withHigh(value: Validator[js.UndefOr[Double | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(js.undefined)
        ret
    }
    @scala.inline
    def withHref(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def withHrefLang(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hrefLang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHrefLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hrefLang")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlFor(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlFor")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpEquiv(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpEquiv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpEquiv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpEquiv")(js.undefined)
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
    def withInputRef(
      value: Validator[
          js.UndefOr[
            (js.Function1[/* node */ HTMLTextAreaElement, Unit]) | Null | ReactRef[HTMLTextAreaElement]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegrity(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(js.undefined)
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
    def withKeyParams(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyParams")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyType(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyType")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
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
    def withList(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withLow(value: Validator[js.UndefOr[Double | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(js.undefined)
        ret
    }
    @scala.inline
    def withManifest(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginHeight(value: Validator[js.UndefOr[Double | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginWidth(value: Validator[js.UndefOr[Double | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Validator[js.UndefOr[Double | Null | String]]): Self = {
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
    def withMaxLength(value: Validator[js.UndefOr[Double | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRows(value: Validator[js.UndefOr[Double | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRows")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def withMediaGroup(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: Validator[js.UndefOr[Null | String]]): Self = {
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
    def withMin(value: Validator[js.UndefOr[Double | Null | String]]): Self = {
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
    def withMinLength(value: Validator[js.UndefOr[Double | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinRows(value: Validator[js.UndefOr[Double | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRows")(js.undefined)
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
    def withMuted(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMuted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(js.undefined)
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
    def withNoValidate(value: Validator[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noValidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withNonce(value: Validator[js.UndefOr[Null | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAbort(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]): Self = {
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
    def withOnAnimationEnd(value: Validator[js.UndefOr[AnimationEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnAnimationIteration(value: Validator[js.UndefOr[AnimationEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnAnimationStart(value: Validator[js.UndefOr[AnimationEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnAuxClick(value: Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnBeforeInput(value: Validator[js.UndefOr[FormEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnBlur(value: Validator[js.UndefOr[FocusEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnCanPlay(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]): Self = {
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
    def withOnCanPlayThrough(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]): Self = {
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
    def withOnChange(
      value: Validator[
          js.UndefOr[(js.Function1[/* event */ ChangeEvent[HTMLTextAreaElement], Unit]) | Null]
        ]
    ): Self = {
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
    def withOnClick(value: Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnCompositionEnd(value: Validator[js.UndefOr[CompositionEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnCompositionStart(value: Validator[js.UndefOr[CompositionEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnCompositionUpdate(value: Validator[js.UndefOr[CompositionEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnContextMenu(value: Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnCopy(value: Validator[js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnCut(value: Validator[js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnDoubleClick(value: Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnDrag(value: Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnDragEnd(value: Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnDragEnter(value: Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnDragExit(value: Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnDragLeave(value: Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnDragOver(value: Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnDragStart(value: Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnDrop(value: Validator[js.UndefOr[DragEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnDurationChange(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]): Self = {
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
    def withOnEmptied(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]): Self = {
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
    def withOnEncrypted(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]): Self = {
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
    def withOnEnded(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]): Self = {
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
    def withOnError(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]): Self = {
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
    def withOnFocus(value: Validator[js.UndefOr[FocusEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnHeightChange(value: Validator[js.UndefOr[(js.Function1[/* height */ Double, Unit]) | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeightChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnHeightChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeightChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInput(value: Validator[js.UndefOr[FormEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnInvalid(value: Validator[js.UndefOr[FormEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnKeyDown(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnKeyPress(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnKeyUp(value: Validator[js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnLoad(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]): Self = {
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
    def withOnLoadStart(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]): Self = {
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
    def withOnLoadedData(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]): Self = {
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
    def withOnLoadedMetadata(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]): Self = {
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
    def withOnMouseDown(value: Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnMouseEnter(value: Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnMouseLeave(value: Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnMouseMove(value: Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnMouseOut(value: Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnMouseOver(value: Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnMouseUp(value: Validator[js.UndefOr[MouseEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnPaste(value: Validator[js.UndefOr[ClipboardEventHandler[HTMLTextAreaElement] | Null]]): Self = {
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
    def withOnPause(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]): Self = {
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
    def withOnPlay(value: Validator[js.UndefOr[Null | ReactEventHandler[HTMLTextAreaElement]]]): Self = {
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
  }
  
}

