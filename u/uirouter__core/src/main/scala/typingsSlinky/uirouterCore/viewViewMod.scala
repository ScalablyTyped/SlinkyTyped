package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.anon.UiViewContextAnchor
import typingsSlinky.uirouterCore.commonCommonMod.TypedMap
import typingsSlinky.uirouterCore.pathNodeMod.PathNode
import typingsSlinky.uirouterCore.routerMod.UIRouter
import typingsSlinky.uirouterCore.stateInterfaceMod.ViewDeclaration
import typingsSlinky.uirouterCore.viewInterfaceMod.ActiveUIView
import typingsSlinky.uirouterCore.viewInterfaceMod.ViewConfig
import typingsSlinky.uirouterCore.viewInterfaceMod.ViewContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewViewMod {
  
  @JSImport("@uirouter/core/lib/view/view", "ViewService")
  @js.native
  class ViewService protected () extends StObject {
    /** @internal */
    def this(/** @internal */ router: UIRouter) = this()
    
    /** @internal */ var _listeners: js.Any = js.native
    
    /** @internal */
    var _pluginapi: ViewServicePluginAPI = js.native
    
    /** @internal */ var _rootContext: js.Any = js.native
    
    /** @internal */
    var _rootViewContext: js.Any = js.native
    
    /** @internal */ var _uiViews: js.Any = js.native
    
    /** @internal */ var _viewConfigFactories: js.Any = js.native
    
    /** @internal */
    var _viewConfigFactory: js.Any = js.native
    
    /** @internal */ var _viewConfigs: js.Any = js.native
    
    def activateViewConfig(viewConfig: ViewConfig): Unit = js.native
    
    /**
      * Returns the list of views on the page containing loaded content.
      *
      * @return {Array} Returns an array of fully-qualified view names.
      */
    def active(): js.Array[_] = js.native
    
    /**
      * Returns the list of views currently available on the page, by fully-qualified name.
      *
      * @return {Array} Returns an array of fully-qualified view names.
      */
    def available(): js.Array[_] = js.native
    
    def createViewConfig(path: js.Array[PathNode], decl: ViewDeclaration): js.Array[ViewConfig] = js.native
    
    /**
      * Deactivates a ViewConfig.
      *
      * This function deactivates a `ViewConfig`.
      * After calling [[sync]], it will un-pair from any `ui-view` with which it is currently paired.
      *
      * @param viewConfig The ViewConfig view to deregister.
      */
    def deactivateViewConfig(viewConfig: ViewConfig): Unit = js.native
    
    /**
      * Registers a `ui-view` component
      *
      * When a `ui-view` component is created, it uses this method to register itself.
      * After registration the [[sync]] method is used to ensure all `ui-view` are configured with the proper [[ViewConfig]].
      *
      * Note: the `ui-view` component uses the `ViewConfig` to determine what view should be loaded inside the `ui-view`,
      * and what the view's state context is.
      *
      * Note: There is no corresponding `deregisterUIView`.
      *       A `ui-view` should hang on to the return value of `registerUIView` and invoke it to deregister itself.
      *
      * @param uiView The metadata for a UIView
      * @return a de-registration function used when the view is destroyed.
      */
    def registerUIView(uiView: ActiveUIView): js.Function0[Unit] = js.native
    
    var router: js.Any = js.native
    
    def sync(): Unit = js.native
  }
  /* static members */
  object ViewService {
    
    /**
      * Given a ui-view and a ViewConfig, determines if they "match".
      *
      * A ui-view has a fully qualified name (fqn) and a context object.  The fqn is built from its overall location in
      * the DOM, describing its nesting relationship to any parent ui-view tags it is nested inside of.
      *
      * A ViewConfig has a target ui-view name and a context anchor.  The ui-view name can be a simple name, or
      * can be a segmented ui-view path, describing a portion of a ui-view fqn.
      *
      * In order for a ui-view to match ViewConfig, ui-view's $type must match the ViewConfig's $type
      *
      * If the ViewConfig's target ui-view name is a simple name (no dots), then a ui-view matches if:
      * - the ui-view's name matches the ViewConfig's target name
      * - the ui-view's context matches the ViewConfig's anchor
      *
      * If the ViewConfig's target ui-view name is a segmented name (with dots), then a ui-view matches if:
      * - There exists a parent ui-view where:
      *    - the parent ui-view's name matches the first segment (index 0) of the ViewConfig's target name
      *    - the parent ui-view's context matches the ViewConfig's anchor
      * - And the remaining segments (index 1..n) of the ViewConfig's target name match the tail of the ui-view's fqn
      *
      * Example:
      *
      * DOM:
      * <ui-view>                        <!-- created in the root context (name: "") -->
      *   <ui-view name="foo">                <!-- created in the context named: "A"      -->
      *     <ui-view>                    <!-- created in the context named: "A.B"    -->
      *       <ui-view name="bar">            <!-- created in the context named: "A.B.C"  -->
      *       </ui-view>
      *     </ui-view>
      *   </ui-view>
      * </ui-view>
      *
      * uiViews: [
      *  { fqn: "$default",                  creationContext: { name: "" } },
      *  { fqn: "$default.foo",              creationContext: { name: "A" } },
      *  { fqn: "$default.foo.$default",     creationContext: { name: "A.B" } }
      *  { fqn: "$default.foo.$default.bar", creationContext: { name: "A.B.C" } }
      * ]
      *
      * These four view configs all match the ui-view with the fqn: "$default.foo.$default.bar":
      *
      * - ViewConfig1: { uiViewName: "bar",                       uiViewContextAnchor: "A.B.C" }
      * - ViewConfig2: { uiViewName: "$default.bar",              uiViewContextAnchor: "A.B" }
      * - ViewConfig3: { uiViewName: "foo.$default.bar",          uiViewContextAnchor: "A" }
      * - ViewConfig4: { uiViewName: "$default.foo.$default.bar", uiViewContextAnchor: "" }
      *
      * Using ViewConfig3 as an example, it matches the ui-view with fqn "$default.foo.$default.bar" because:
      * - The ViewConfig's segmented target name is: [ "foo", "$default", "bar" ]
      * - There exists a parent ui-view (which has fqn: "$default.foo") where:
      *    - the parent ui-view's name "foo" matches the first segment "foo" of the ViewConfig's target name
      *    - the parent ui-view's context "A" matches the ViewConfig's anchor context "A"
      * - And the remaining segments [ "$default", "bar" ].join("."_ of the ViewConfig's target name match
      *   the tail of the ui-view's fqn "default.bar"
      *
      * @internal
      */
    @JSImport("@uirouter/core/lib/view/view", "ViewService.matches")
    @js.native
    def matches(uiViewsByFqn: TypedMap[ActiveUIView], uiView: ActiveUIView): js.Function1[/* viewConfig */ ViewConfig, Boolean] = js.native
    
    /**
      * Normalizes a view's name from a state.views configuration block.
      *
      * This should be used by a framework implementation to calculate the values for
      * [[_ViewDeclaration.$uiViewName]] and [[_ViewDeclaration.$uiViewContextAnchor]].
      *
      * @param context the context object (state declaration) that the view belongs to
      * @param rawViewName the name of the view, as declared in the [[StateDeclaration.views]]
      *
      * @returns the normalized uiViewName and uiViewContextAnchor that the view targets
      */
    @JSImport("@uirouter/core/lib/view/view", "ViewService.normalizeUIViewTarget")
    @js.native
    def normalizeUIViewTarget(context: ViewContext): UiViewContextAnchor = js.native
    @JSImport("@uirouter/core/lib/view/view", "ViewService.normalizeUIViewTarget")
    @js.native
    def normalizeUIViewTarget(context: ViewContext, rawViewName: String): UiViewContextAnchor = js.native
  }
  
  type ViewConfigFactory = js.Function2[
    /* path */ js.Array[PathNode], 
    /* decl */ ViewDeclaration, 
    ViewConfig | js.Array[ViewConfig]
  ]
  
  @js.native
  trait ViewServicePluginAPI extends StObject {
    
    def _activeViewConfigs(): js.Array[ViewConfig] = js.native
    
    def _onSync(listener: ViewSyncListener): js.Function = js.native
    
    /** @param id router.$id + "." + uiView.id */
    def _registeredUIView(id: String): ActiveUIView = js.native
    
    def _registeredUIViews(): js.Array[ActiveUIView] = js.native
    
    def _rootViewContext(): ViewContext = js.native
    def _rootViewContext(context: ViewContext): ViewContext = js.native
    
    def _viewConfigFactory(viewType: String, factory: ViewConfigFactory): js.Any = js.native
  }
  
  type ViewSyncListener = js.Function1[/* viewTuples */ js.Array[ViewTuple], Unit]
  
  @js.native
  trait ViewTuple extends StObject {
    
    var uiView: ActiveUIView = js.native
    
    var viewConfig: ViewConfig = js.native
  }
  object ViewTuple {
    
    @scala.inline
    def apply(uiView: ActiveUIView, viewConfig: ViewConfig): ViewTuple = {
      val __obj = js.Dynamic.literal(uiView = uiView.asInstanceOf[js.Any], viewConfig = viewConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewTuple]
    }
    
    @scala.inline
    implicit class ViewTupleMutableBuilder[Self <: ViewTuple] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUiView(value: ActiveUIView): Self = StObject.set(x, "uiView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewConfig(value: ViewConfig): Self = StObject.set(x, "viewConfig", value.asInstanceOf[js.Any])
    }
  }
}
