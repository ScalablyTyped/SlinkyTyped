package typingsSlinky.storybookApi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Record
import typingsSlinky.storybookApi.anon.DictparameterName
import typingsSlinky.storybookApi.anon.DocsOnly
import typingsSlinky.storybookApi.anon.Error
import typingsSlinky.storybookApi.anon.Provider
import typingsSlinky.storybookApi.anon.Stories
import typingsSlinky.storybookApi.mod.Args
import typingsSlinky.storybookApi.mod.StoryId
import typingsSlinky.storybookApi.mod.StoryKind
import typingsSlinky.storybookApi.storybookApiBooleans.`false`
import typingsSlinky.storybookApi.storybookApiBooleans.`true`
import typingsSlinky.storybookApi.storybookApiNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storiesMod {
  
  @JSImport("@storybook/api/dist/lib/stories", "denormalizeStoryParameters")
  @js.native
  def denormalizeStoryParameters(hasGlobalParametersKindParametersStories: SetStoriesPayload): StoriesRaw = js.native
  
  @JSImport("@storybook/api/dist/lib/stories", "isGroup")
  @js.native
  def isGroup(item: Item): /* is @storybook/api.@storybook/api/dist/lib/stories.Group */ Boolean = js.native
  
  @JSImport("@storybook/api/dist/lib/stories", "isRoot")
  @js.native
  def isRoot(item: Item): /* is @storybook/api.@storybook/api/dist/lib/stories.Root */ Boolean = js.native
  
  @JSImport("@storybook/api/dist/lib/stories", "isStory")
  @js.native
  def isStory(item: Item): /* is @storybook/api.@storybook/api/dist/lib/stories.Story */ Boolean = js.native
  
  @JSImport("@storybook/api/dist/lib/stories", "transformStoriesRawToStoriesHash")
  @js.native
  def transformStoriesRawToStoriesHash(input: StoriesRaw, hasProvider: Provider): StoriesHash = js.native
  
  @js.native
  trait Group extends StObject {
    
    var children: js.Array[StoryId] = js.native
    
    var depth: Double = js.native
    
    var id: StoryId = js.native
    
    var isComponent: Boolean = js.native
    
    var isLeaf: `false` = js.native
    
    var isRoot: `false` = js.native
    
    var name: String = js.native
    
    var parameters: js.UndefOr[DocsOnly] = js.native
    
    var parent: js.UndefOr[StoryId] = js.native
    
    var refId: js.UndefOr[String] = js.native
  }
  object Group {
    
    @scala.inline
    def apply(
      children: js.Array[StoryId],
      depth: Double,
      id: StoryId,
      isComponent: Boolean,
      isLeaf: `false`,
      isRoot: `false`,
      name: String
    ): Group = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], isRoot = isRoot.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Group]
    }
    
    @scala.inline
    implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[StoryId]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: StoryId*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: StoryId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsComponent(value: Boolean): Self = StObject.set(x, "isComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLeaf(value: `false`): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRoot(value: `false`): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameters(value: DocsOnly): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setParent(value: StoryId): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
    }
  }
  
  type GroupsList = js.Array[Root | Group]
  
  /* Inlined @storybook/api.@storybook/api/dist/lib/stories.StoriesHash[keyof @storybook/api.@storybook/api/dist/lib/stories.StoriesHash] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.storybookApi.storybookApiStrings.kind
    - typingsSlinky.storybookApi.storybookApiStrings.children
    - typingsSlinky.storybookApi.storybookApiStrings.refId
    - typingsSlinky.storybookApi.storybookApiStrings.isComponent
    - typingsSlinky.storybookApi.storybookApiStrings.depth
    - typingsSlinky.storybookApi.storybookApiStrings.parent
    - typingsSlinky.storybookApi.storybookApiStrings.isLeaf
    - typingsSlinky.storybookApi.storybookApiStrings.args
    - typingsSlinky.storybookApi.storybookApiStrings.parameters
    - typingsSlinky.storybookApi.storybookApiStrings.name
    - typingsSlinky.storybookApi.storybookApiStrings.id
    - typingsSlinky.storybookApi.storybookApiStrings.isRoot
  */
  trait Item extends StObject
  object Item {
    
    @scala.inline
    def args: typingsSlinky.storybookApi.storybookApiStrings.args = "args".asInstanceOf[typingsSlinky.storybookApi.storybookApiStrings.args]
    
    @scala.inline
    def children: typingsSlinky.storybookApi.storybookApiStrings.children = "children".asInstanceOf[typingsSlinky.storybookApi.storybookApiStrings.children]
    
    @scala.inline
    def depth: typingsSlinky.storybookApi.storybookApiStrings.depth = "depth".asInstanceOf[typingsSlinky.storybookApi.storybookApiStrings.depth]
    
    @scala.inline
    def id: typingsSlinky.storybookApi.storybookApiStrings.id = "id".asInstanceOf[typingsSlinky.storybookApi.storybookApiStrings.id]
    
    @scala.inline
    def isComponent: typingsSlinky.storybookApi.storybookApiStrings.isComponent = "isComponent".asInstanceOf[typingsSlinky.storybookApi.storybookApiStrings.isComponent]
    
    @scala.inline
    def isLeaf: typingsSlinky.storybookApi.storybookApiStrings.isLeaf = "isLeaf".asInstanceOf[typingsSlinky.storybookApi.storybookApiStrings.isLeaf]
    
    @scala.inline
    def isRoot: typingsSlinky.storybookApi.storybookApiStrings.isRoot = "isRoot".asInstanceOf[typingsSlinky.storybookApi.storybookApiStrings.isRoot]
    
    @scala.inline
    def kind: typingsSlinky.storybookApi.storybookApiStrings.kind = "kind".asInstanceOf[typingsSlinky.storybookApi.storybookApiStrings.kind]
    
    @scala.inline
    def name: typingsSlinky.storybookApi.storybookApiStrings.name = "name".asInstanceOf[typingsSlinky.storybookApi.storybookApiStrings.name]
    
    @scala.inline
    def parameters: typingsSlinky.storybookApi.storybookApiStrings.parameters = "parameters".asInstanceOf[typingsSlinky.storybookApi.storybookApiStrings.parameters]
    
    @scala.inline
    def parent: typingsSlinky.storybookApi.storybookApiStrings.parent = "parent".asInstanceOf[typingsSlinky.storybookApi.storybookApiStrings.parent]
    
    @scala.inline
    def refId: typingsSlinky.storybookApi.storybookApiStrings.refId = "refId".asInstanceOf[typingsSlinky.storybookApi.storybookApiStrings.refId]
  }
  
  @js.native
  trait Root extends StObject {
    
    var children: js.Array[StoryId] = js.native
    
    var depth: `0` = js.native
    
    var id: StoryId = js.native
    
    var isComponent: `false` = js.native
    
    var isLeaf: `false` = js.native
    
    var isRoot: `true` = js.native
    
    var name: String = js.native
    
    var refId: js.UndefOr[String] = js.native
  }
  object Root {
    
    @scala.inline
    def apply(
      children: js.Array[StoryId],
      depth: `0`,
      id: StoryId,
      isComponent: `false`,
      isLeaf: `false`,
      isRoot: `true`,
      name: String
    ): Root = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], isRoot = isRoot.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Root]
    }
    
    @scala.inline
    implicit class RootMutableBuilder[Self <: Root] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[StoryId]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: StoryId*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDepth(value: `0`): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: StoryId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsComponent(value: `false`): Self = StObject.set(x, "isComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLeaf(value: `false`): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRoot(value: `true`): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
    }
  }
  
  type SetStoriesPayload = Error | (Stories with (Record[String, scala.Nothing]))
  
  type StoriesHash = StringDictionary[Root | Group | Story]
  
  type StoriesList = js.Array[Group | Story]
  
  type StoriesRaw = StringDictionary[StoryInput]
  
  @js.native
  trait Story extends StObject {
    
    var args: Args = js.native
    
    var children: js.UndefOr[js.Array[StoryId]] = js.native
    
    var depth: Double = js.native
    
    var id: StoryId = js.native
    
    var isComponent: Boolean = js.native
    
    var isLeaf: `true` = js.native
    
    var isRoot: `false` = js.native
    
    var kind: StoryKind = js.native
    
    var name: String = js.native
    
    var parameters: js.UndefOr[DictparameterName] = js.native
    
    var parent: StoryId = js.native
    
    var refId: js.UndefOr[String] = js.native
  }
  object Story {
    
    @scala.inline
    def apply(
      args: Args,
      depth: Double,
      id: StoryId,
      isComponent: Boolean,
      isLeaf: `true`,
      isRoot: `false`,
      kind: StoryKind,
      name: String,
      parent: StoryId
    ): Story = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], isRoot = isRoot.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Story]
    }
    
    @scala.inline
    implicit class StoryMutableBuilder[Self <: Story] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: Args): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: js.Array[StoryId]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: StoryId*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: StoryId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsComponent(value: Boolean): Self = StObject.set(x, "isComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLeaf(value: `true`): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRoot(value: `false`): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: StoryKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameters(value: DictparameterName): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setParent(value: StoryId): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
    }
  }
  
  @js.native
  trait StoryInput extends StObject {
    
    var args: Args = js.native
    
    var children: js.Array[String] = js.native
    
    var id: StoryId = js.native
    
    var isLeaf: Boolean = js.native
    
    var kind: StoryKind = js.native
    
    var name: String = js.native
    
    var parameters: DictparameterName = js.native
    
    var refId: js.UndefOr[String] = js.native
  }
  object StoryInput {
    
    @scala.inline
    def apply(
      args: Args,
      children: js.Array[String],
      id: StoryId,
      isLeaf: Boolean,
      kind: StoryKind,
      name: String,
      parameters: DictparameterName
    ): StoryInput = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryInput]
    }
    
    @scala.inline
    implicit class StoryInputMutableBuilder[Self <: StoryInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: Args): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: js.Array[String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: String*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setId(value: StoryId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: StoryKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameters(value: DictparameterName): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
    }
  }
}
