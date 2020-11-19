package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.anon.Children
import typingsSlinky.react.mod.ErrorInfo
import typingsSlinky.semanticUiReact.refFindNodeMod.default
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RefFindNode {
  
  @JSImport("semantic-ui-react/dist/commonjs/addons/Ref/RefFindNode", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def UNSAFE_componentWillMount(value: () => Unit): this.type = set("UNSAFE_componentWillMount", js.Any.fromFunction0(value))
    
    @scala.inline
    def UNSAFE_componentWillReceiveProps(
      value: (typingsSlinky.semanticUiReact.refFindNodeMod.RefFindNode, /* nextContext */ js.Any) => Unit
    ): this.type = set("UNSAFE_componentWillReceiveProps", js.Any.fromFunction2(value))
    
    @scala.inline
    def UNSAFE_componentWillUpdate(
      value: (typingsSlinky.semanticUiReact.refFindNodeMod.RefFindNode, js.Object, /* nextContext */ js.Any) => Unit
    ): this.type = set("UNSAFE_componentWillUpdate", js.Any.fromFunction3(value))
    
    @scala.inline
    def componentDidCatch(value: (/* error */ js.Error, /* errorInfo */ ErrorInfo) => Unit): this.type = set("componentDidCatch", js.Any.fromFunction2(value))
    
    @scala.inline
    def componentDidMount(value: () => Unit): this.type = set("componentDidMount", js.Any.fromFunction0(value))
    
    @scala.inline
    def componentDidUpdate(
      value: (typingsSlinky.semanticUiReact.refFindNodeMod.RefFindNode, js.Object, /* snapshot */ js.UndefOr[js.Any]) => Unit
    ): this.type = set("componentDidUpdate", js.Any.fromFunction3(value))
    
    @scala.inline
    def componentWillMount(value: () => Unit): this.type = set("componentWillMount", js.Any.fromFunction0(value))
    
    @scala.inline
    def componentWillReceiveProps(
      value: (typingsSlinky.semanticUiReact.refFindNodeMod.RefFindNode, /* nextContext */ js.Any) => Unit
    ): this.type = set("componentWillReceiveProps", js.Any.fromFunction2(value))
    
    @scala.inline
    def componentWillUnmount(value: () => Unit): this.type = set("componentWillUnmount", js.Any.fromFunction0(value))
    
    @scala.inline
    def componentWillUpdate(
      value: (typingsSlinky.semanticUiReact.refFindNodeMod.RefFindNode, js.Object, /* nextContext */ js.Any) => Unit
    ): this.type = set("componentWillUpdate", js.Any.fromFunction3(value))
    
    @scala.inline
    def getSnapshotBeforeUpdate(value: (typingsSlinky.semanticUiReact.refFindNodeMod.RefFindNode, js.Object) => js.Any | Null): this.type = set("getSnapshotBeforeUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def shouldComponentUpdate(
      value: (typingsSlinky.semanticUiReact.refFindNodeMod.RefFindNode, js.Object, /* nextContext */ js.Any) => Boolean
    ): this.type = set("shouldComponentUpdate", js.Any.fromFunction3(value))
  }
  
  def withProps(p: typingsSlinky.semanticUiReact.refFindNodeMod.RefFindNode): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    context: js.Any,
    forceUpdate: js.UndefOr[js.Function0[Unit]] => Unit,
    props: typingsSlinky.semanticUiReact.refFindNodeMod.RefFindNode with Children,
    render: () => ReactElement,
    setState: (js.UndefOr[
      (js.Function2[
        js.Object, 
        typingsSlinky.semanticUiReact.refFindNodeMod.RefFindNode, 
        Null | js.Object | (Pick[js.Object, js.Any])
      ]) | Null | js.Object | (Pick[js.Object, js.Any])
    ], js.UndefOr[js.Function0[Unit]]) => Unit,
    state: js.Object
  ): Builder = {
    val __props = js.Dynamic.literal(context = context.asInstanceOf[js.Any], forceUpdate = js.Any.fromFunction1(forceUpdate), props = props.asInstanceOf[js.Any], render = js.Any.fromFunction0(render), setState = js.Any.fromFunction2(setState), state = state.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.semanticUiReact.refFindNodeMod.RefFindNode]))
  }
}
