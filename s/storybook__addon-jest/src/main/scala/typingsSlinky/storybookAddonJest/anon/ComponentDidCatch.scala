package typingsSlinky.storybookAddonJest.anon

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ErrorInfo
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.std.Pick
import typingsSlinky.storybookAddonJest.provideJestResultMod.HocState
import typingsSlinky.storybookAddonJest.storybookAddonJestStrings.kind
import typingsSlinky.storybookAddonJest.storybookAddonJestStrings.storyName
import typingsSlinky.storybookAddonJest.storybookAddonJestStrings.tests
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDidCatch extends js.Object {
  
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
