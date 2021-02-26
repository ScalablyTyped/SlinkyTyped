package typingsSlinky.welldoneSoftwareWhyDidYouRender

import slinky.core.ReactComponentClass
import typingsSlinky.welldoneSoftwareWhyDidYouRender.anon.TypeofReact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("@welldone-software/why-did-you-render", JSImport.Default)
    @js.native
    def apply(react: TypeofReact): TypeofReact = js.native
    @JSImport("@welldone-software/why-did-you-render", JSImport.Default)
    @js.native
    def apply(react: TypeofReact, options: WhyDidYouRenderOptions): TypeofReact = js.native
    
    @JSImport("@welldone-software/why-did-you-render", "default.defaultNotifier")
    @js.native
    val defaultNotifier: Notifier = js.native
  }
  
  /* augmented module */
  object reactAugmentingMod {
    
    object Component {
      
      @JSImport("react", "Component.whyDidYouRender")
      @js.native
      val whyDidYouRender: WhyDidYouRenderComponentMember = js.native
    }
    
    @js.native
    trait ExoticComponent[P] extends StObject {
      
      var whyDidYouRender: js.UndefOr[WhyDidYouRenderComponentMember] = js.native
    }
    object ExoticComponent {
      
      @scala.inline
      def apply[P](): ExoticComponent[P] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ExoticComponent[P]]
      }
      
      @scala.inline
      implicit class ExoticComponentMutableBuilder[Self <: ExoticComponent[_], P] (val x: Self with ExoticComponent[P]) extends AnyVal {
        
        @scala.inline
        def setWhyDidYouRender(value: WhyDidYouRenderComponentMember): Self = StObject.set(x, "whyDidYouRender", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhyDidYouRenderUndefined: Self = StObject.set(x, "whyDidYouRender", js.undefined)
      }
    }
    
    @js.native
    trait FunctionComponent[P] extends StObject {
      
      var whyDidYouRender: js.UndefOr[WhyDidYouRenderComponentMember] = js.native
    }
    object FunctionComponent {
      
      @scala.inline
      def apply[P](): FunctionComponent[P] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FunctionComponent[P]]
      }
      
      @scala.inline
      implicit class FunctionComponentMutableBuilder[Self <: FunctionComponent[_], P] (val x: Self with FunctionComponent[P]) extends AnyVal {
        
        @scala.inline
        def setWhyDidYouRender(value: WhyDidYouRenderComponentMember): Self = StObject.set(x, "whyDidYouRender", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhyDidYouRenderUndefined: Self = StObject.set(x, "whyDidYouRender", js.undefined)
      }
    }
  }
  
  type ExtraHookToTrack = js.Tuple2[js.Any, String]
  
  @js.native
  trait HookDifference extends StObject {
    
    var diffType: String = js.native
    
    var nextValue: js.Any = js.native
    
    var pathString: String = js.native
    
    var prevValue: js.Any = js.native
  }
  object HookDifference {
    
    @scala.inline
    def apply(diffType: String, nextValue: js.Any, pathString: String, prevValue: js.Any): HookDifference = {
      val __obj = js.Dynamic.literal(diffType = diffType.asInstanceOf[js.Any], nextValue = nextValue.asInstanceOf[js.Any], pathString = pathString.asInstanceOf[js.Any], prevValue = prevValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[HookDifference]
    }
    
    @scala.inline
    implicit class HookDifferenceMutableBuilder[Self <: HookDifference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiffType(value: String): Self = StObject.set(x, "diffType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextValue(value: js.Any): Self = StObject.set(x, "nextValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathString(value: String): Self = StObject.set(x, "pathString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevValue(value: js.Any): Self = StObject.set(x, "prevValue", value.asInstanceOf[js.Any])
    }
  }
  
  type Notifier = js.Function1[/* options */ UpdateInfo, Unit]
  
  @js.native
  trait ReasonForUpdate extends StObject {
    
    var hookDifferences: js.Array[HookDifference] = js.native
    
    var propsDifferences: Boolean = js.native
    
    var stateDifferences: Boolean = js.native
  }
  object ReasonForUpdate {
    
    @scala.inline
    def apply(hookDifferences: js.Array[HookDifference], propsDifferences: Boolean, stateDifferences: Boolean): ReasonForUpdate = {
      val __obj = js.Dynamic.literal(hookDifferences = hookDifferences.asInstanceOf[js.Any], propsDifferences = propsDifferences.asInstanceOf[js.Any], stateDifferences = stateDifferences.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReasonForUpdate]
    }
    
    @scala.inline
    implicit class ReasonForUpdateMutableBuilder[Self <: ReasonForUpdate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHookDifferences(value: js.Array[HookDifference]): Self = StObject.set(x, "hookDifferences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHookDifferencesVarargs(value: HookDifference*): Self = StObject.set(x, "hookDifferences", js.Array(value :_*))
      
      @scala.inline
      def setPropsDifferences(value: Boolean): Self = StObject.set(x, "propsDifferences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateDifferences(value: Boolean): Self = StObject.set(x, "stateDifferences", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateInfo extends StObject {
    
    var Component: ReactComponentClass[js.Object] = js.native
    
    var displayName: String = js.native
    
    var hookName: js.UndefOr[String] = js.native
    
    var nextHook: js.Any = js.native
    
    var nextProps: js.Any = js.native
    
    var nextState: js.Any = js.native
    
    var options: WhyDidYouRenderOptions = js.native
    
    var prevHook: js.Any = js.native
    
    var prevProps: js.Any = js.native
    
    var prevState: js.Any = js.native
    
    var reason: ReasonForUpdate = js.native
  }
  object UpdateInfo {
    
    @scala.inline
    def apply(
      Component: ReactComponentClass[js.Object],
      displayName: String,
      nextHook: js.Any,
      nextProps: js.Any,
      nextState: js.Any,
      options: WhyDidYouRenderOptions,
      prevHook: js.Any,
      prevProps: js.Any,
      prevState: js.Any,
      reason: ReasonForUpdate
    ): UpdateInfo = {
      val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], nextHook = nextHook.asInstanceOf[js.Any], nextProps = nextProps.asInstanceOf[js.Any], nextState = nextState.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], prevHook = prevHook.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateInfo]
    }
    
    @scala.inline
    implicit class UpdateInfoMutableBuilder[Self <: UpdateInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHookName(value: String): Self = StObject.set(x, "hookName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHookNameUndefined: Self = StObject.set(x, "hookName", js.undefined)
      
      @scala.inline
      def setNextHook(value: js.Any): Self = StObject.set(x, "nextHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextProps(value: js.Any): Self = StObject.set(x, "nextProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextState(value: js.Any): Self = StObject.set(x, "nextState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: WhyDidYouRenderOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevHook(value: js.Any): Self = StObject.set(x, "prevHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevProps(value: js.Any): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevState(value: js.Any): Self = StObject.set(x, "prevState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: ReasonForUpdate): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  type WhyDidYouRenderComponentMember = WhyDidYouRenderOptions | Boolean
  
  @js.native
  trait WhyDidYouRenderOptions extends StObject {
    
    var collapseGroups: js.UndefOr[Boolean] = js.native
    
    var customName: js.UndefOr[String] = js.native
    
    var diffNameColor: js.UndefOr[String] = js.native
    
    var diffPathColor: js.UndefOr[String] = js.native
    
    var exclude: js.UndefOr[js.Array[js.RegExp]] = js.native
    
    var hotReloadBufferMs: js.UndefOr[Double] = js.native
    
    var include: js.UndefOr[js.Array[js.RegExp]] = js.native
    
    var logOnDifferentValues: js.UndefOr[Boolean] = js.native
    
    var logOwnerReasons: js.UndefOr[Boolean] = js.native
    
    var notifier: js.UndefOr[Notifier] = js.native
    
    var onlyLogs: js.UndefOr[Boolean] = js.native
    
    var titleColor: js.UndefOr[String] = js.native
    
    var trackAllPureComponents: js.UndefOr[Boolean] = js.native
    
    var trackExtraHooks: js.UndefOr[js.Array[ExtraHookToTrack]] = js.native
    
    var trackHooks: js.UndefOr[Boolean] = js.native
  }
  object WhyDidYouRenderOptions {
    
    @scala.inline
    def apply(): WhyDidYouRenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WhyDidYouRenderOptions]
    }
    
    @scala.inline
    implicit class WhyDidYouRenderOptionsMutableBuilder[Self <: WhyDidYouRenderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapseGroups(value: Boolean): Self = StObject.set(x, "collapseGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseGroupsUndefined: Self = StObject.set(x, "collapseGroups", js.undefined)
      
      @scala.inline
      def setCustomName(value: String): Self = StObject.set(x, "customName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomNameUndefined: Self = StObject.set(x, "customName", js.undefined)
      
      @scala.inline
      def setDiffNameColor(value: String): Self = StObject.set(x, "diffNameColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiffNameColorUndefined: Self = StObject.set(x, "diffNameColor", js.undefined)
      
      @scala.inline
      def setDiffPathColor(value: String): Self = StObject.set(x, "diffPathColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiffPathColorUndefined: Self = StObject.set(x, "diffPathColor", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[js.RegExp]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: js.RegExp*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setHotReloadBufferMs(value: Double): Self = StObject.set(x, "hotReloadBufferMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHotReloadBufferMsUndefined: Self = StObject.set(x, "hotReloadBufferMs", js.undefined)
      
      @scala.inline
      def setInclude(value: js.Array[js.RegExp]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: js.RegExp*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setLogOnDifferentValues(value: Boolean): Self = StObject.set(x, "logOnDifferentValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogOnDifferentValuesUndefined: Self = StObject.set(x, "logOnDifferentValues", js.undefined)
      
      @scala.inline
      def setLogOwnerReasons(value: Boolean): Self = StObject.set(x, "logOwnerReasons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogOwnerReasonsUndefined: Self = StObject.set(x, "logOwnerReasons", js.undefined)
      
      @scala.inline
      def setNotifier(value: /* options */ UpdateInfo => Unit): Self = StObject.set(x, "notifier", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifierUndefined: Self = StObject.set(x, "notifier", js.undefined)
      
      @scala.inline
      def setOnlyLogs(value: Boolean): Self = StObject.set(x, "onlyLogs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyLogsUndefined: Self = StObject.set(x, "onlyLogs", js.undefined)
      
      @scala.inline
      def setTitleColor(value: String): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      @scala.inline
      def setTrackAllPureComponents(value: Boolean): Self = StObject.set(x, "trackAllPureComponents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackAllPureComponentsUndefined: Self = StObject.set(x, "trackAllPureComponents", js.undefined)
      
      @scala.inline
      def setTrackExtraHooks(value: js.Array[ExtraHookToTrack]): Self = StObject.set(x, "trackExtraHooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackExtraHooksUndefined: Self = StObject.set(x, "trackExtraHooks", js.undefined)
      
      @scala.inline
      def setTrackExtraHooksVarargs(value: ExtraHookToTrack*): Self = StObject.set(x, "trackExtraHooks", js.Array(value :_*))
      
      @scala.inline
      def setTrackHooks(value: Boolean): Self = StObject.set(x, "trackHooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackHooksUndefined: Self = StObject.set(x, "trackHooks", js.undefined)
    }
  }
}
