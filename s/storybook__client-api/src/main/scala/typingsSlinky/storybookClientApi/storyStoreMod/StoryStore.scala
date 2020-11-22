package typingsSlinky.storybookClientApi.storyStoreMod

import typingsSlinky.std.Record
import typingsSlinky.storybookAddons.typesMod.Args
import typingsSlinky.storybookAddons.typesMod.Parameters
import typingsSlinky.storybookAddons.typesMod.StoryKind
import typingsSlinky.storybookChannels.mod.Channel
import typingsSlinky.storybookClientApi.anon.Error
import typingsSlinky.storybookClientApi.anon.GlobalParameters
import typingsSlinky.storybookClientApi.anon.StoryOptionsnormalizePara
import typingsSlinky.storybookClientApi.anon.applyDecoratorsfnLegacySt
import typingsSlinky.storybookClientApi.typesMod.AddStoryArgs
import typingsSlinky.storybookClientApi.typesMod.ArgTypesEnhancer
import typingsSlinky.storybookClientApi.typesMod.ErrorLike
import typingsSlinky.storybookClientApi.typesMod.GetStorybookKind
import typingsSlinky.storybookClientApi.typesMod.PublishedStoreItem
import typingsSlinky.storybookClientApi.typesMod.StoreData
import typingsSlinky.storybookClientApi.typesMod.StoreItem
import typingsSlinky.storybookClientApi.typesMod.StoreSelection
import typingsSlinky.storybookClientApi.typesMod.StoreSelectionSpecifier
import typingsSlinky.storybookClientApi.typesMod.StoryMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryStore extends js.Object {
  
  var _argTypesEnhancers: js.Array[ArgTypesEnhancer] = js.native
  
  var _channel: Channel = js.native
  
  var _configuring: Boolean = js.native
  
  var _error: js.UndefOr[ErrorLike] = js.native
  
  var _globalMetadata: StoryMetadata = js.native
  
  var _globals: Args = js.native
  
  var _kinds: Record[String, KindMetadata] = js.native
  
  var _selection: js.UndefOr[StoreSelection] = js.native
  
  var _selectionSpecifier: js.UndefOr[StoreSelectionSpecifier] = js.native
  
  var _stories: StoreData = js.native
  
  def addArgTypesEnhancer(argTypesEnhancer: ArgTypesEnhancer): Unit = js.native
  
  def addGlobalMetadata(hasParametersDecoratorsLoaders: StoryMetadata): Unit = js.native
  
  def addKindMetadata(kind: String, hasParametersDecoratorsLoaders: StoryMetadata): Unit = js.native
  
  def addStory(
    hasIdKindNameStoryFnParametersDecoratorsLoaders: AddStoryArgs,
    hasApplyDecoratorsAllowUnsafe: applyDecoratorsfnLegacySt
  ): Unit = js.native
  
  def cleanHooks(id: String): Unit = js.native
  
  def cleanHooksForKind(kind: String): Unit = js.native
  
  def clearError(): Unit = js.native
  
  def clearGlobalDecorators(): Unit = js.native
  
  def combineStoryParameters(parameters: Parameters, kind: StoryKind): Parameters = js.native
  
  def ensureKind(kind: String): Unit = js.native
  
  def extract(): js.Object = js.native
  def extract(options: StoryOptionsnormalizePara): js.Object = js.native
  
  def finishConfiguring(): Unit = js.native
  
  def fromId(id: String): PublishedStoreItem | Null = js.native
  
  def getDataForManager(): Error = js.native
  
  def getError(): js.UndefOr[ErrorLike] = js.native
  
  def getRawStory(kind: String, name: String): PublishedStoreItem = js.native
  
  def getSelection(): StoreSelection = js.native
  
  def getStoriesForKind(kind: String): js.Array[PublishedStoreItem] = js.native
  
  def getStoriesJsonData(): GlobalParameters = js.native
  
  def getStoryKinds(): js.Array[String] = js.native
  
  def getStorybook(): js.Array[GetStorybookKind] = js.native
  
  var mergeAdditionalDataToStory: js.Any = js.native
  
  def pushToManager(): Unit = js.native
  
  def raw(): js.Array[PublishedStoreItem] = js.native
  def raw(options: StoryOptions): js.Array[PublishedStoreItem] = js.native
  
  def remove(id: String): Unit = js.native
  def remove(id: String, hasAllowUnsafe: AllowUnsafeOption): Unit = js.native
  
  def removeStoryKind(kind: String): Unit = js.native
  def removeStoryKind(kind: String, hasAllowUnsafe: AllowUnsafeOption): Unit = js.native
  
  def resetStoryArgs(id: String): Unit = js.native
  def resetStoryArgs(id: String, argNames: js.Array[String]): Unit = js.native
  
  def setError(err: ErrorLike): Unit = js.native
  
  def setSelection(selection: StoreSelection): Unit = js.native
  
  def setSelectionSpecifier(selectionSpecifier: StoreSelectionSpecifier): Unit = js.native
  
  def setupListeners(): Unit = js.native
  
  def sortedStories(): js.Array[StoreItem] = js.native
  
  def startConfiguring(): Unit = js.native
  
  def storeGlobals(): Unit = js.native
  
  def updateGlobals(newGlobals: Args): Unit = js.native
  
  def updateStoryArgs(id: String, newArgs: Args): Unit = js.native
}
