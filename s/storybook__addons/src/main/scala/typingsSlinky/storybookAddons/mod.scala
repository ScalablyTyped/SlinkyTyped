package typingsSlinky.storybookAddons

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.storybookAddons.anon.Current
import typingsSlinky.storybookAddons.hooksMod.Decorator
import typingsSlinky.storybookAddons.hooksMod.EventMap
import typingsSlinky.storybookAddons.makeDecoratorMod.MakeDecoratorOptions
import typingsSlinky.storybookAddons.makeDecoratorMod.MakeDecoratorResult
import typingsSlinky.storybookAddons.typesMod.Args
import typingsSlinky.storybookAddons.typesMod.StoryContext
import typingsSlinky.storybookAddons.typesMod.StoryGetter
import typingsSlinky.storybookAddons.typesMod.Types_
import typingsSlinky.storybookChannels.mod.ChannelArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@storybook/addons", JSImport.Default)
  @js.native
  val default: typingsSlinky.storybookAddons.distMod.AddonStore = js.native
  
  @JSImport("@storybook/addons", "AddonStore")
  @js.native
  class AddonStore ()
    extends typingsSlinky.storybookAddons.distMod.AddonStore
  
  @JSImport("@storybook/addons", "Channel")
  @js.native
  class Channel ()
    extends typingsSlinky.storybookAddons.distMod.Channel {
    def this(hasTransportAsync: ChannelArgs) = this()
  }
  
  @JSImport("@storybook/addons", "HooksContext")
  @js.native
  class HooksContext ()
    extends typingsSlinky.storybookAddons.hooksMod.HooksContext
  
  @JSImport("@storybook/addons", "addons")
  @js.native
  val addons: typingsSlinky.storybookAddons.distMod.AddonStore = js.native
  
  @JSImport("@storybook/addons", "applyHooks")
  @js.native
  def applyHooks(
    applyDecorators: js.Function2[/* getStory */ StoryGetter, /* decorators */ js.Array[Decorator], StoryGetter]
  ): js.Function2[
    /* getStory */ StoryGetter, 
    /* decorators */ js.Array[Decorator], 
    js.Function1[/* context */ StoryContext, _]
  ] = js.native
  
  @JSImport("@storybook/addons", "isSupportedType")
  @js.native
  def isSupportedType(`type`: Types_): Boolean = js.native
  
  @JSImport("@storybook/addons", "makeDecorator")
  @js.native
  def makeDecorator(hasNameParameterNameWrapperSkipIfNoParametersOrOptions: MakeDecoratorOptions): MakeDecoratorResult = js.native
  
  @JSImport("@storybook/addons", "mockChannel")
  @js.native
  def mockChannel(): typingsSlinky.storybookChannels.mod.default = js.native
  
  @JSImport("@storybook/addons", "types")
  @js.native
  object types extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.storybookAddons.typesMod.types with String] = js.native
    
    /* "notes-element" */ val NOTES_ELEMENT: typingsSlinky.storybookAddons.typesMod.types.NOTES_ELEMENT with String = js.native
    
    /* "panel" */ val PANEL: typingsSlinky.storybookAddons.typesMod.types.PANEL with String = js.native
    
    /* "preview" */ val PREVIEW: typingsSlinky.storybookAddons.typesMod.types.PREVIEW with String = js.native
    
    /* "tab" */ val TAB: typingsSlinky.storybookAddons.typesMod.types.TAB with String = js.native
    
    /* "tool" */ val TOOL: typingsSlinky.storybookAddons.typesMod.types.TOOL with String = js.native
    
    /* "toolextra" */ val TOOLEXTRA: typingsSlinky.storybookAddons.typesMod.types.TOOLEXTRA with String = js.native
  }
  
  @JSImport("@storybook/addons", "useArgs")
  @js.native
  def useArgs(): js.Tuple3[
    Args, 
    js.Function1[/* newArgs */ Args, Unit], 
    js.Function1[/* argNames */ js.UndefOr[js.Array[String]], Unit]
  ] = js.native
  
  @JSImport("@storybook/addons", "useCallback")
  @js.native
  def useCallback[T](callback: T): T = js.native
  @JSImport("@storybook/addons", "useCallback")
  @js.native
  def useCallback[T](callback: T, deps: js.Array[_]): T = js.native
  
  @JSImport("@storybook/addons", "useChannel")
  @js.native
  def useChannel(eventMap: EventMap): js.Any = js.native
  @JSImport("@storybook/addons", "useChannel")
  @js.native
  def useChannel(eventMap: EventMap, deps: js.Array[_]): js.Any = js.native
  
  @JSImport("@storybook/addons", "useEffect")
  @js.native
  def useEffect(create: js.Function0[js.Function0[Unit] | Unit]): Unit = js.native
  @JSImport("@storybook/addons", "useEffect")
  @js.native
  def useEffect(create: js.Function0[js.Function0[Unit] | Unit], deps: js.Array[_]): Unit = js.native
  
  @JSImport("@storybook/addons", "useGlobals")
  @js.native
  def useGlobals(): js.Tuple2[Args, js.Function1[/* newGlobals */ Args, Unit]] = js.native
  
  @JSImport("@storybook/addons", "useMemo")
  @js.native
  def useMemo[T](nextCreate: js.Function0[T]): T = js.native
  @JSImport("@storybook/addons", "useMemo")
  @js.native
  def useMemo[T](nextCreate: js.Function0[T], deps: js.Array[_]): T = js.native
  
  @JSImport("@storybook/addons", "useParameter")
  @js.native
  def useParameter[S](parameterKey: String): js.UndefOr[S] = js.native
  @JSImport("@storybook/addons", "useParameter")
  @js.native
  def useParameter[S](parameterKey: String, defaultValue: S): js.UndefOr[S] = js.native
  
  @JSImport("@storybook/addons", "useReducer")
  @js.native
  def useReducer[S, A](reducer: js.Function2[/* state */ S, /* action */ A, S], initialState: S): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = js.native
  @JSImport("@storybook/addons", "useReducer")
  @js.native
  def useReducer[S, I, A](
    reducer: js.Function2[/* state */ S, /* action */ A, S],
    initialArg: I,
    init: js.Function1[/* initialArg */ I, S]
  ): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = js.native
  
  @JSImport("@storybook/addons", "useRef")
  @js.native
  def useRef[T](initialValue: T): Current[T] = js.native
  
  @JSImport("@storybook/addons", "useState")
  @js.native
  def useState[S](initialState: S): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = js.native
  @JSImport("@storybook/addons", "useState")
  @js.native
  def useState[S](initialState: js.Function0[S]): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = js.native
  
  @JSImport("@storybook/addons", "useStoryContext")
  @js.native
  def useStoryContext(): StoryContext = js.native
  
  type _To = typingsSlinky.storybookAddons.distMod.AddonStore
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: typingsSlinky.storybookAddons.distMod.AddonStore = default
}
