package typingsSlinky.wordpressEditPost

import typingsSlinky.std.Record
import typingsSlinky.wordpressEditPost.mod.EditorMode
import typingsSlinky.wordpressEditPost.mod.MetaboxDescriptor
import typingsSlinky.wordpressEditPost.mod.MetaboxLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/edit-post/store/selectors", JSImport.Namespace)
@js.native
object selectorsMod extends js.Object {
  
  def getActiveGeneralSidebarName(): String | Null = js.native
  
  def getActiveMetaBoxLocations(): js.Array[MetaboxLocation] = js.native
  
  def getAllMetaBoxes(): js.Array[MetaboxDescriptor] = js.native
  
  def getEditorMode(): EditorMode = js.native
  
  def getMetaBoxesPerLocation(location: MetaboxLocation): js.UndefOr[js.Array[MetaboxDescriptor]] = js.native
  
  def getPreference[T](preferenceKey: String): js.UndefOr[T] = js.native
  def getPreference[T](preferenceKey: String, defaultValue: T): T | Double | String = js.native
  
  def getPreferences(): Record[String, _] = js.native
  
  def hasMetaBoxes(): Boolean = js.native
  
  def isEditorPanelEnabled(panelName: String): Boolean = js.native
  
  def isEditorPanelOpened(panelName: String): Boolean = js.native
  
  def isEditorPanelRemoved(panelName: String): Boolean = js.native
  
  def isEditorSidebarOpened(): Boolean = js.native
  
  def isFeatureActive(feature: String): Boolean = js.native
  
  def isMetaBoxLocationActive(location: MetaboxLocation): Boolean = js.native
  
  def isMetaBoxLocationVisible(location: MetaboxLocation): Boolean = js.native
  
  def isModalActive(modalName: String): Boolean = js.native
  
  def isPluginItemPinned(pluginName: String): Boolean = js.native
  
  def isPluginSidebarOpened(): Boolean = js.native
  
  def isPublishSidebarOpened(): Boolean = js.native
  
  def isSavingMetaBoxes(): Boolean = js.native
}
