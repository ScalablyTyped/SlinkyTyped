package typingsSlinky.storybookAddons

import typingsSlinky.storybookAddons.anon.Current
import typingsSlinky.storybookAddons.hooksMod.Decorator
import typingsSlinky.storybookAddons.hooksMod.EventMap
import typingsSlinky.storybookAddons.makeDecoratorMod.MakeDecoratorOptions
import typingsSlinky.storybookAddons.makeDecoratorMod.MakeDecoratorResult
import typingsSlinky.storybookAddons.typesMod.StoryContext
import typingsSlinky.storybookAddons.typesMod.StoryGetter
import typingsSlinky.storybookAddons.typesMod.Types_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addons", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AddonStore ()
    extends typingsSlinky.storybookAddons.distMod.AddonStore
  
  @js.native
  class HooksContext ()
    extends typingsSlinky.storybookAddons.hooksMod.HooksContext
  
  val addons: typingsSlinky.storybookAddons.distMod.AddonStore = js.native
  val default: typingsSlinky.storybookAddons.distMod.AddonStore = js.native
  def applyHooks(
    applyDecorators: js.Function2[/* getStory */ StoryGetter, /* decorators */ js.Array[Decorator], StoryGetter]
  ): js.Function2[
    /* getStory */ StoryGetter, 
    /* decorators */ js.Array[Decorator], 
    js.Function1[/* context */ StoryContext, _]
  ] = js.native
  def isSupportedType(`type`: Types_): Boolean = js.native
  def makeDecorator(hasNameParameterNameWrapperSkipIfNoParametersOrOptionsAllowDeprecatedUsage: MakeDecoratorOptions): MakeDecoratorResult = js.native
  def mockChannel(): typingsSlinky.storybookChannels.mod.default = js.native
  def useCallback[T](callback: T): T = js.native
  def useCallback[T](callback: T, deps: js.Array[_]): T = js.native
  def useChannel(eventMap: EventMap): js.Any = js.native
  def useChannel(eventMap: EventMap, deps: js.Array[_]): js.Any = js.native
  def useEffect(create: js.Function0[js.Function0[Unit] | Unit]): Unit = js.native
  def useEffect(create: js.Function0[js.Function0[Unit] | Unit], deps: js.Array[_]): Unit = js.native
  def useMemo[T](nextCreate: js.Function0[T]): T = js.native
  def useMemo[T](nextCreate: js.Function0[T], deps: js.Array[_]): T = js.native
  def useParameter[S](parameterKey: String): js.UndefOr[S] = js.native
  def useParameter[S](parameterKey: String, defaultValue: S): js.UndefOr[S] = js.native
  def useReducer[S, A](reducer: js.Function2[/* state */ S, /* action */ A, S], initialState: S): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = js.native
  def useReducer[S, I, A](
    reducer: js.Function2[/* state */ S, /* action */ A, S],
    initialArg: I,
    init: js.Function1[/* initialArg */ I, S]
  ): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = js.native
  def useRef[T](initialValue: T): Current[T] = js.native
  def useState[S](initialState: S): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = js.native
  def useState[S](initialState: js.Function0[S]): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = js.native
  def useStoryContext(): StoryContext = js.native
  @js.native
  object types extends js.Object {
    /* "notes-element" */ val NOTES_ELEMENT: typingsSlinky.storybookAddons.typesMod.types.NOTES_ELEMENT with String = js.native
    /* "panel" */ val PANEL: typingsSlinky.storybookAddons.typesMod.types.PANEL with String = js.native
    /* "preview" */ val PREVIEW: typingsSlinky.storybookAddons.typesMod.types.PREVIEW with String = js.native
    /* "tab" */ val TAB: typingsSlinky.storybookAddons.typesMod.types.TAB with String = js.native
    /* "tool" */ val TOOL: typingsSlinky.storybookAddons.typesMod.types.TOOL with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.storybookAddons.typesMod.types with String] = js.native
  }
  
}

