package typingsSlinky.storybookUi

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import typingsSlinky.storybookApi.storiesMod.Group
import typingsSlinky.storybookApi.storiesMod.Root
import typingsSlinky.storybookApi.storiesMod.StoriesHash
import typingsSlinky.storybookApi.storiesMod.Story
import typingsSlinky.storybookUi.sidebarTypesMod.Dataset
import typingsSlinky.storybookUi.sidebarTypesMod.Item
import typingsSlinky.storybookUi.sidebarTypesMod.RefType
import typingsSlinky.storybookUi.sidebarTypesMod.SearchItem
import typingsSlinky.storybookUi.storybookUiStrings.auth
import typingsSlinky.storybookUi.storybookUiStrings.empty
import typingsSlinky.storybookUi.storybookUiStrings.error
import typingsSlinky.storybookUi.storybookUiStrings.loading
import typingsSlinky.storybookUi.storybookUiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "createId")
  @js.native
  def createId(itemId: String): String = js.native
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "createId")
  @js.native
  def createId(itemId: String, refId: String): String = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "cycle")
  @js.native
  def cycle[T](array: js.Array[T], index: Double, delta: Double): Double = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "get")
  @js.native
  def get(id: String, dataset: Dataset): Root | Group | Story = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "getAncestorIds")
  @js.native
  def getAncestorIds(data: StoriesHash, id: String): js.Array[String] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "getDescendantIds")
  @js.native
  def getDescendantIds(data: StoriesHash, id: String, skipLeafs: Boolean): js.Array[String] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "getLink")
  @js.native
  def getLink(itemId: String): String = js.native
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "getLink")
  @js.native
  def getLink(itemId: String, refId: String): String = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "getParent")
  @js.native
  def getParent(id: String, dataset: Dataset): Root | Group | Story = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "getParents")
  @js.native
  def getParents(id: String, dataset: Dataset): js.Array[Item] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "getPath")
  @js.native
  def getPath(item: Item, ref: RefType): js.Array[String] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "getStateType")
  @js.native
  def getStateType(isLoading: Boolean, isAuthRequired: Boolean, isError: Boolean, isEmpty: Boolean): auth | error | loading | empty | ready = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "isAncestor")
  @js.native
  def isAncestor(): Boolean = js.native
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "isAncestor")
  @js.native
  def isAncestor(element: js.UndefOr[scala.Nothing], maybeAncestor: Element): Boolean = js.native
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "isAncestor")
  @js.native
  def isAncestor(element: Element): Boolean = js.native
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "isAncestor")
  @js.native
  def isAncestor(element: Element, maybeAncestor: Element): Boolean = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "prevent")
  @js.native
  def prevent(e: SyntheticEvent[Event, Element]): Boolean = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "scrollIntoView")
  @js.native
  def scrollIntoView(element: Element): Unit = js.native
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "scrollIntoView")
  @js.native
  def scrollIntoView(element: Element, center: Boolean): Unit = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "searchItem")
  @js.native
  def searchItem(item: Item, ref: RefType): SearchItem = js.native
}
