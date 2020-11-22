package typingsSlinky.storybookApi.modulesStoriesMod

import typingsSlinky.storybookApi.anon.DictparameterName
import typingsSlinky.storybookApi.anon.RefId
import typingsSlinky.storybookApi.mod.Args
import typingsSlinky.storybookApi.storiesMod.Group
import typingsSlinky.storybookApi.storiesMod.Root
import typingsSlinky.storybookApi.storiesMod.StoriesHash
import typingsSlinky.storybookApi.storiesMod.StoriesRaw
import typingsSlinky.storybookApi.storiesMod.Story
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubAPI extends js.Object {
  
  def findLeafStoryId(
    StoriesHash: StoriesHash,
    storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any
  ): js.Any = js.native
  
  def getCurrentParameter[S](): S = js.native
  def getCurrentParameter[S](parameterName: ParameterName): S = js.native
  
  def getCurrentStoryData(): Story | Group = js.native
  
  def getData(
    storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any
  ): Story | Group = js.native
  def getData(
    storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any,
    refId: String
  ): Story | Group = js.native
  
  def getParameters(
    storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any
  ): js.UndefOr[DictparameterName | js.Any] = js.native
  def getParameters(
    storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any,
    parameterName: ParameterName
  ): js.UndefOr[DictparameterName | js.Any] = js.native
  def getParameters(storyId: RefId): js.UndefOr[DictparameterName | js.Any] = js.native
  def getParameters(storyId: RefId, parameterName: ParameterName): js.UndefOr[DictparameterName | js.Any] = js.native
  
  def jumpToComponent(direction: Direction): Unit = js.native
  
  def jumpToStory(direction: Direction): Unit = js.native
  
  def resetStoryArgs(story: Story): Unit = js.native
  def resetStoryArgs(story: Story, argNames: js.Array[String]): Unit = js.native
  
  def resolveStory(
    storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any
  ): Story | Group | Root = js.native
  def resolveStory(
    storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any,
    refsId: String
  ): Story | Group | Root = js.native
  
  def selectFirstStory(): Unit = js.native
  
  def selectStory(kindOrId: String): Unit = js.native
  def selectStory(kindOrId: String, story: js.UndefOr[scala.Nothing], obj: typingsSlinky.storybookApi.anon.ViewMode): Unit = js.native
  def selectStory(kindOrId: String, story: String): Unit = js.native
  def selectStory(kindOrId: String, story: String, obj: typingsSlinky.storybookApi.anon.ViewMode): Unit = js.native
  
  def setStories(stories: StoriesRaw): js.Promise[Unit] = js.native
  def setStories(stories: StoriesRaw, failed: js.Error): js.Promise[Unit] = js.native
  
  var storyId: js.Function2[/* kind */ String, /* name */ String, String] = js.native
  
  def updateStoryArgs(story: Story, newArgs: Args): Unit = js.native
}
