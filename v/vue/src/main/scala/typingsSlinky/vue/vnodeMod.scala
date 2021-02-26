package typingsSlinky.vue

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import typingsSlinky.std.Array
import typingsSlinky.vue.anon.Render
import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vue.vueMod.VueConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vnodeMod {
  
  type NormalizedScopedSlot = js.Function1[/* props */ js.Any, ScopedSlotChildren]
  
  type ScopedSlot = js.Function1[/* props */ js.Any, ScopedSlotReturnValue]
  
  type ScopedSlotChildren = js.UndefOr[js.Array[VNode]]
  
  @js.native
  trait ScopedSlotReturnArray
    extends Array[ScopedSlotReturnValue]
       with _ScopedSlotReturnValue
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vue.vnodeMod.VNode
    - java.lang.String
    - scala.Boolean
    - scala.Null
    - js.UndefOr[scala.Nothing]
    - typingsSlinky.vue.vnodeMod.ScopedSlotReturnArray
  */
  type ScopedSlotReturnValue = js.UndefOr[_ScopedSlotReturnValue | String | Boolean | Null]
  
  @js.native
  trait VNode extends _ScopedSlotReturnValue {
    
    var children: js.UndefOr[js.Array[VNode]] = js.native
    
    var componentInstance: js.UndefOr[Vue] = js.native
    
    var componentOptions: js.UndefOr[VNodeComponentOptions] = js.native
    
    var context: js.UndefOr[Vue] = js.native
    
    var data: js.UndefOr[VNodeData] = js.native
    
    var elm: js.UndefOr[Node] = js.native
    
    var isComment: Boolean = js.native
    
    var isRootInsert: Boolean = js.native
    
    var isStatic: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[String | Double] = js.native
    
    var ns: js.UndefOr[String] = js.native
    
    var parent: js.UndefOr[VNode] = js.native
    
    var raw: js.UndefOr[Boolean] = js.native
    
    var tag: js.UndefOr[String] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object VNode {
    
    @scala.inline
    def apply(isComment: Boolean, isRootInsert: Boolean): VNode = {
      val __obj = js.Dynamic.literal(isComment = isComment.asInstanceOf[js.Any], isRootInsert = isRootInsert.asInstanceOf[js.Any])
      __obj.asInstanceOf[VNode]
    }
    
    @scala.inline
    implicit class VNodeMutableBuilder[Self <: VNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[VNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: VNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setComponentInstance(value: Vue): Self = StObject.set(x, "componentInstance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentInstanceUndefined: Self = StObject.set(x, "componentInstance", js.undefined)
      
      @scala.inline
      def setComponentOptions(value: VNodeComponentOptions): Self = StObject.set(x, "componentOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentOptionsUndefined: Self = StObject.set(x, "componentOptions", js.undefined)
      
      @scala.inline
      def setContext(value: Vue): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setData(value: VNodeData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setElm(value: Node): Self = StObject.set(x, "elm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElmUndefined: Self = StObject.set(x, "elm", js.undefined)
      
      @scala.inline
      def setIsComment(value: Boolean): Self = StObject.set(x, "isComment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRootInsert(value: Boolean): Self = StObject.set(x, "isRootInsert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStaticUndefined: Self = StObject.set(x, "isStatic", js.undefined)
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
      
      @scala.inline
      def setParent(value: VNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type VNodeChildren = js.UndefOr[VNodeChildrenArrayContents | js.Array[ScopedSlot] | String | Boolean | Null]
  
  @js.native
  trait VNodeChildrenArrayContents extends Array[VNodeChildren | VNode]
  
  @js.native
  trait VNodeComponentOptions extends StObject {
    
    var Ctor: VueConstructor[Vue] = js.native
    
    var children: js.UndefOr[js.Array[VNode]] = js.native
    
    var listeners: js.UndefOr[js.Object] = js.native
    
    var propsData: js.UndefOr[js.Object] = js.native
    
    var tag: js.UndefOr[String] = js.native
  }
  object VNodeComponentOptions {
    
    @scala.inline
    def apply(Ctor: VueConstructor[Vue]): VNodeComponentOptions = {
      val __obj = js.Dynamic.literal(Ctor = Ctor.asInstanceOf[js.Any])
      __obj.asInstanceOf[VNodeComponentOptions]
    }
    
    @scala.inline
    implicit class VNodeComponentOptionsMutableBuilder[Self <: VNodeComponentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[VNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: VNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setCtor(value: VueConstructor[Vue]): Self = StObject.set(x, "Ctor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListeners(value: js.Object): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      @scala.inline
      def setPropsData(value: js.Object): Self = StObject.set(x, "propsData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsDataUndefined: Self = StObject.set(x, "propsData", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  @js.native
  trait VNodeData extends StObject {
    
    var attrs: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var `class`: js.UndefOr[js.Any] = js.native
    
    var directives: js.UndefOr[js.Array[VNodeDirective]] = js.native
    
    var domProps: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var hook: js.UndefOr[StringDictionary[js.Function]] = js.native
    
    var inlineTemplate: js.UndefOr[Render] = js.native
    
    var keepAlive: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[String | Double] = js.native
    
    var nativeOn: js.UndefOr[StringDictionary[js.Function | js.Array[js.Function]]] = js.native
    
    var on: js.UndefOr[StringDictionary[js.Function | js.Array[js.Function]]] = js.native
    
    var props: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var ref: js.UndefOr[String] = js.native
    
    var refInFor: js.UndefOr[Boolean] = js.native
    
    var scopedSlots: js.UndefOr[StringDictionary[js.UndefOr[ScopedSlot]]] = js.native
    
    var show: js.UndefOr[Boolean] = js.native
    
    var slot: js.UndefOr[String] = js.native
    
    var staticClass: js.UndefOr[String] = js.native
    
    var staticStyle: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var style: js.UndefOr[String | js.Array[js.Object] | js.Object] = js.native
    
    var tag: js.UndefOr[String] = js.native
    
    var transition: js.UndefOr[js.Object] = js.native
  }
  object VNodeData {
    
    @scala.inline
    def apply(): VNodeData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VNodeData]
    }
    
    @scala.inline
    implicit class VNodeDataMutableBuilder[Self <: VNodeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: StringDictionary[js.Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      @scala.inline
      def setClass(value: js.Any): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setDirectives(value: js.Array[VNodeDirective]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
      
      @scala.inline
      def setDirectivesVarargs(value: VNodeDirective*): Self = StObject.set(x, "directives", js.Array(value :_*))
      
      @scala.inline
      def setDomProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "domProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomPropsUndefined: Self = StObject.set(x, "domProps", js.undefined)
      
      @scala.inline
      def setHook(value: StringDictionary[js.Function]): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHookUndefined: Self = StObject.set(x, "hook", js.undefined)
      
      @scala.inline
      def setInlineTemplate(value: Render): Self = StObject.set(x, "inlineTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineTemplateUndefined: Self = StObject.set(x, "inlineTemplate", js.undefined)
      
      @scala.inline
      def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setNativeOn(value: StringDictionary[js.Function | js.Array[js.Function]]): Self = StObject.set(x, "nativeOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeOnUndefined: Self = StObject.set(x, "nativeOn", js.undefined)
      
      @scala.inline
      def setOn(value: StringDictionary[js.Function | js.Array[js.Function]]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      @scala.inline
      def setProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefInFor(value: Boolean): Self = StObject.set(x, "refInFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefInForUndefined: Self = StObject.set(x, "refInFor", js.undefined)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setScopedSlots(value: StringDictionary[js.UndefOr[ScopedSlot]]): Self = StObject.set(x, "scopedSlots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopedSlotsUndefined: Self = StObject.set(x, "scopedSlots", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      @scala.inline
      def setStaticClass(value: String): Self = StObject.set(x, "staticClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticClassUndefined: Self = StObject.set(x, "staticClass", js.undefined)
      
      @scala.inline
      def setStaticStyle(value: StringDictionary[js.Any]): Self = StObject.set(x, "staticStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticStyleUndefined: Self = StObject.set(x, "staticStyle", js.undefined)
      
      @scala.inline
      def setStyle(value: String | js.Array[js.Object] | js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: js.Object*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setTransition(value: js.Object): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  @js.native
  trait VNodeDirective extends StObject {
    
    var arg: js.UndefOr[String] = js.native
    
    var expression: js.UndefOr[js.Any] = js.native
    
    var modifiers: js.UndefOr[StringDictionary[Boolean]] = js.native
    
    var name: String = js.native
    
    var oldArg: js.UndefOr[String] = js.native
    
    var oldValue: js.UndefOr[js.Any] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object VNodeDirective {
    
    @scala.inline
    def apply(name: String): VNodeDirective = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[VNodeDirective]
    }
    
    @scala.inline
    implicit class VNodeDirectiveMutableBuilder[Self <: VNodeDirective] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArg(value: String): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgUndefined: Self = StObject.set(x, "arg", js.undefined)
      
      @scala.inline
      def setExpression(value: js.Any): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      @scala.inline
      def setModifiers(value: StringDictionary[Boolean]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldArg(value: String): Self = StObject.set(x, "oldArg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldArgUndefined: Self = StObject.set(x, "oldArg", js.undefined)
      
      @scala.inline
      def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait _ScopedSlotReturnValue extends StObject
}
