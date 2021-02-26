package typingsSlinky.storybookAddonJest

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ErrorInfo
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.std.Pick
import typingsSlinky.storybookAddonJest.provideJestResultMod.AssertionResult
import typingsSlinky.storybookAddonJest.provideJestResultMod.HocProps
import typingsSlinky.storybookAddonJest.provideJestResultMod.HocState
import typingsSlinky.storybookAddonJest.provideJestResultMod.Test
import typingsSlinky.storybookAddonJest.storybookAddonJestStrings.kind
import typingsSlinky.storybookAddonJest.storybookAddonJestStrings.storyName
import typingsSlinky.storybookAddonJest.storybookAddonJestStrings.tests
import typingsSlinky.storybookApi.mod.API
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Active extends StObject {
    
    var active: Boolean = js.native
  }
  object Active {
    
    @scala.inline
    def apply(active: Boolean): Active = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[Active]
    }
    
    @scala.inline
    implicit class ActiveMutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AssertionResults extends StObject {
    
    var assertionResults: js.Array[AssertionResult] = js.native
    
    var status: String = js.native
  }
  object AssertionResults {
    
    @scala.inline
    def apply(assertionResults: js.Array[AssertionResult], status: String): AssertionResults = {
      val __obj = js.Dynamic.literal(assertionResults = assertionResults.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssertionResults]
    }
    
    @scala.inline
    implicit class AssertionResultsMutableBuilder[Self <: AssertionResults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssertionResults(value: js.Array[AssertionResult]): Self = StObject.set(x, "assertionResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssertionResultsVarargs(value: AssertionResult*): Self = StObject.set(x, "assertionResults", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ComponentDidCatch extends StObject {
    
    var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var UNSAFE_componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ ReadonlyHocProps, /* nextContext */ js.Any, Unit]] = js.native
    
    var UNSAFE_componentWillUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ ReadonlyHocProps, 
          /* nextState */ ReadonlyHocState, 
          /* nextContext */ js.Any, 
          Unit
        ]
      ] = js.native
    
    var componentDidCatch: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
    
    def componentDidMount(): Unit = js.native
    
    var componentDidUpdate: js.UndefOr[
        js.Function3[
          /* prevProps */ ReadonlyHocProps, 
          /* prevState */ ReadonlyHocState, 
          /* snapshot */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.native
    
    var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ ReadonlyHocProps, /* nextContext */ js.Any, Unit]] = js.native
    
    def componentWillUnmount(): Unit = js.native
    
    var componentWillUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ ReadonlyHocProps, 
          /* nextState */ ReadonlyHocState, 
          /* nextContext */ js.Any, 
          Unit
        ]
      ] = js.native
    
    var context: js.Any = js.native
    
    def forceUpdate(): Unit = js.native
    def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
    
    var getSnapshotBeforeUpdate: js.UndefOr[
        js.Function2[/* prevProps */ ReadonlyHocProps, /* prevState */ ReadonlyHocState, _]
      ] = js.native
    
    var mounted: Boolean = js.native
    
    def onAddTests(hasKindStoryNameTests: HocState): Unit = js.native
    
    val props: ReadonlyHocPropsReadonlyc = js.native
    
    var refs: StringDictionary[ReactInstance] = js.native
    
    def render(): ReactElement = js.native
    
    def setState[K /* <: kind | storyName | tests */](
      state: js.Function2[
          /* prevState */ ReadonlyHocState, 
          /* props */ ReadonlyHocProps, 
          HocState | (Pick[HocState, K])
        ]
    ): Unit = js.native
    def setState[K /* <: kind | storyName | tests */](
      state: js.Function2[
          /* prevState */ ReadonlyHocState, 
          /* props */ ReadonlyHocProps, 
          HocState | (Pick[HocState, K])
        ],
      callback: js.Function0[Unit]
    ): Unit = js.native
    def setState[K /* <: kind | storyName | tests */](state: Pick[HocState, K]): Unit = js.native
    def setState[K /* <: kind | storyName | tests */](state: Pick[HocState, K], callback: js.Function0[Unit]): Unit = js.native
    def setState[K /* <: kind | storyName | tests */](state: HocState): Unit = js.native
    def setState[K /* <: kind | storyName | tests */](state: HocState, callback: js.Function0[Unit]): Unit = js.native
    
    var shouldComponentUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ ReadonlyHocProps, 
          /* nextState */ ReadonlyHocState, 
          /* nextContext */ js.Any, 
          Boolean
        ]
      ] = js.native
    
    var state: HocState = js.native
    
    def stopListeningOnStory(): Unit = js.native
  }
  
  @js.native
  trait FilesExt extends StObject {
    
    var filesExt: js.UndefOr[String] = js.native
    
    var results: js.Any = js.native
  }
  object FilesExt {
    
    @scala.inline
    def apply(results: js.Any): FilesExt = {
      val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilesExt]
    }
    
    @scala.inline
    implicit class FilesExtMutableBuilder[Self <: FilesExt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilesExt(value: String): Self = StObject.set(x, "filesExt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesExtUndefined: Self = StObject.set(x, "filesExt", js.undefined)
      
      @scala.inline
      def setResults(value: js.Any): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends Instantiable1[(/* props */ HocProps) | (/* props */ ReadonlyHocProps), ComponentDidCatch]
       with Instantiable2[/* props */ HocProps, /* context */ js.Any, ComponentDidCatch] {
    
    var contextType: js.UndefOr[Context[_]] = js.native
    
    var defaultProps: Active = js.native
  }
  
  /* Inlined std.Readonly<@storybook/addon-jest.@storybook/addon-jest/dist/hoc/provideJestResult.HocProps> */
  @js.native
  trait ReadonlyHocProps extends StObject {
    
    val active: js.UndefOr[Boolean] = js.native
    
    val api: API = js.native
  }
  object ReadonlyHocProps {
    
    @scala.inline
    def apply(api: API): ReadonlyHocProps = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyHocProps]
    }
    
    @scala.inline
    implicit class ReadonlyHocPropsMutableBuilder[Self <: ReadonlyHocProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setApi(value: API): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<@storybook/addon-jest.@storybook/addon-jest/dist/hoc/provideJestResult.HocProps> & std.Readonly<{  children :react.react.ReactNode | undefined}> */
  @js.native
  trait ReadonlyHocPropsReadonlyc extends StObject {
    
    val active: js.UndefOr[Boolean] = js.native
    
    val api: API = js.native
    
    val children: js.UndefOr[ReactElement] = js.native
  }
  object ReadonlyHocPropsReadonlyc {
    
    @scala.inline
    def apply(api: API): ReadonlyHocPropsReadonlyc = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyHocPropsReadonlyc]
    }
    
    @scala.inline
    implicit class ReadonlyHocPropsReadonlycMutableBuilder[Self <: ReadonlyHocPropsReadonlyc] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setApi(value: API): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<@storybook/addon-jest.@storybook/addon-jest/dist/hoc/provideJestResult.HocState> */
  @js.native
  trait ReadonlyHocState extends StObject {
    
    val kind: js.UndefOr[String] = js.native
    
    val storyName: js.UndefOr[String] = js.native
    
    val tests: js.UndefOr[js.Array[Test]] = js.native
  }
  object ReadonlyHocState {
    
    @scala.inline
    def apply(): ReadonlyHocState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyHocState]
    }
    
    @scala.inline
    implicit class ReadonlyHocStateMutableBuilder[Self <: ReadonlyHocState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setStoryName(value: String): Self = StObject.set(x, "storyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoryNameUndefined: Self = StObject.set(x, "storyName", js.undefined)
      
      @scala.inline
      def setTests(value: js.Array[Test]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestsUndefined: Self = StObject.set(x, "tests", js.undefined)
      
      @scala.inline
      def setTestsVarargs(value: Test*): Self = StObject.set(x, "tests", js.Array(value :_*))
    }
  }
}
