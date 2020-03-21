package typingsSlinky.slateReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.slate.mod.Command
import typingsSlinky.slate.mod.Node
import typingsSlinky.slate.mod.Query
import typingsSlinky.slate.mod.SchemaProperties
import typingsSlinky.slate.mod.SlateError
import typingsSlinky.slate.mod.Value
import typingsSlinky.slateReact.mod.EditorProps
import typingsSlinky.slateReact.mod.OnChangeParam
import typingsSlinky.slateReact.mod.Plugins
import typingsSlinky.slateReact.mod.RenderAnnotationProps
import typingsSlinky.slateReact.mod.RenderBlockProps
import typingsSlinky.slateReact.mod.RenderDecorationProps
import typingsSlinky.slateReact.mod.RenderDocumentProps
import typingsSlinky.slateReact.mod.RenderInlineProps
import typingsSlinky.slateReact.mod.RenderMarkProps
import typingsSlinky.slateReact.mod.RenderNodeProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Editor
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.slateReact.mod.Editor] {
  @JSImport("slate-react", "Editor")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, className, readOnly, spellCheck, style, tabIndex */
  def apply(
    value: Value,
    autoCorrect: js.UndefOr[Boolean] = js.undefined,
    decorateNode: (/* node */ Node, typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[_]) => _ = null,
    normalizeNode: (/* node */ Node, typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[Unit]) => (js.Function1[typingsSlinky.slateReact.mod.Editor, Unit]) | Unit = null,
    onBeforeInput: (SyntheticEvent[EventTarget with org.scalajs.dom.raw.Element, Event_], /* editor */ typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onBlur: (SyntheticFocusEvent[org.scalajs.dom.raw.Element], /* editor */ typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onChange: /* change */ OnChangeParam => js.Any = null,
    onClick: (SyntheticMouseEvent[org.scalajs.dom.raw.Element], /* editor */ typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onCommand: (/* command */ Command, typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[Unit]) => Unit = null,
    onCompositionEnd: (SyntheticCompositionEvent[org.scalajs.dom.raw.Element], /* editor */ typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onCompositionStart: (SyntheticCompositionEvent[org.scalajs.dom.raw.Element], /* editor */ typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onConstruct: (typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[Unit]) => Unit = null,
    onContextMenu: (SyntheticMouseEvent[org.scalajs.dom.raw.Element], /* editor */ typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onCopy: (SyntheticClipboardEvent[org.scalajs.dom.raw.Element], /* editor */ typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onCut: (SyntheticClipboardEvent[org.scalajs.dom.raw.Element], /* editor */ typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onDragEnd: (DragEvent[org.scalajs.dom.raw.Element], /* editor */ typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onDragEnter: (DragEvent[org.scalajs.dom.raw.Element], /* editor */ typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onDragExit: (DragEvent[org.scalajs.dom.raw.Element], /* editor */ typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onDragLeave: (DragEvent[org.scalajs.dom.raw.Element], /* editor */ typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onDragOver: (DragEvent[org.scalajs.dom.raw.Element], /* editor */ typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onDragStart: (DragEvent[org.scalajs.dom.raw.Element], /* editor */ typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onDrop: (DragEvent[org.scalajs.dom.raw.Element], /* editor */ typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onFocus: (SyntheticFocusEvent[org.scalajs.dom.raw.Element], /* editor */ typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onInput: (SyntheticEvent[EventTarget with org.scalajs.dom.raw.Element, Event_], /* editor */ typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onKeyDown: (SyntheticKeyboardEvent[org.scalajs.dom.raw.Element], /* editor */ typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onPaste: (SyntheticClipboardEvent[org.scalajs.dom.raw.Element], /* editor */ typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    onQuery: (/* query */ Query, typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[Unit]) => Unit = null,
    onSelect: (SyntheticEvent[Event_, org.scalajs.dom.raw.Element], /* editor */ typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[js.Any]) => js.Any = null,
    placeholder: js.Any = null,
    plugins: Plugins[typingsSlinky.slateReact.mod.Editor] = null,
    renderAnnotation: (/* props */ RenderAnnotationProps, typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[_]) => _ = null,
    renderBlock: (/* props */ RenderBlockProps, typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[_]) => _ = null,
    renderDecoration: (/* props */ RenderDecorationProps, typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[_]) => _ = null,
    renderDocument: (/* props */ RenderDocumentProps, typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[_]) => _ = null,
    renderEditor: (/* props */ EditorProps[typingsSlinky.slateReact.mod.Editor], typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[_]) => _ = null,
    renderInline: (/* props */ RenderInlineProps, typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[_]) => _ = null,
    renderMark: (/* props */ RenderMarkProps, typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[_]) => _ = null,
    role: String = null,
    schema: SchemaProperties = null,
    shouldNodeComponentUpdate: (/* previousProps */ RenderNodeProps, /* props */ RenderNodeProps, /* editor */ typingsSlinky.slate.mod.Editor, /* next */ js.Function0[_]) => _ = null,
    validateNode: (/* node */ Node, typingsSlinky.slateReact.mod.Editor, /* next */ js.Function0[Unit]) => SlateError | Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.slateReact.mod.Editor] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (decorateNode != null) __obj.updateDynamic("decorateNode")(js.Any.fromFunction3(decorateNode))
    if (normalizeNode != null) __obj.updateDynamic("normalizeNode")(js.Any.fromFunction3(normalizeNode))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction3(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction3(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction3(onClick))
    if (onCommand != null) __obj.updateDynamic("onCommand")(js.Any.fromFunction3(onCommand))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction3(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction3(onCompositionStart))
    if (onConstruct != null) __obj.updateDynamic("onConstruct")(js.Any.fromFunction2(onConstruct))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction3(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction3(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction3(onCut))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction3(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction3(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction3(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction3(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction3(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction3(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction3(onDrop))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction3(onFocus))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction3(onInput))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction3(onKeyDown))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction3(onPaste))
    if (onQuery != null) __obj.updateDynamic("onQuery")(js.Any.fromFunction3(onQuery))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction3(onSelect))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (renderAnnotation != null) __obj.updateDynamic("renderAnnotation")(js.Any.fromFunction3(renderAnnotation))
    if (renderBlock != null) __obj.updateDynamic("renderBlock")(js.Any.fromFunction3(renderBlock))
    if (renderDecoration != null) __obj.updateDynamic("renderDecoration")(js.Any.fromFunction3(renderDecoration))
    if (renderDocument != null) __obj.updateDynamic("renderDocument")(js.Any.fromFunction3(renderDocument))
    if (renderEditor != null) __obj.updateDynamic("renderEditor")(js.Any.fromFunction3(renderEditor))
    if (renderInline != null) __obj.updateDynamic("renderInline")(js.Any.fromFunction3(renderInline))
    if (renderMark != null) __obj.updateDynamic("renderMark")(js.Any.fromFunction3(renderMark))
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (shouldNodeComponentUpdate != null) __obj.updateDynamic("shouldNodeComponentUpdate")(js.Any.fromFunction4(shouldNodeComponentUpdate))
    if (validateNode != null) __obj.updateDynamic("validateNode")(js.Any.fromFunction3(validateNode))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = EditorProps[typingsSlinky.slateReact.mod.Editor]
}

