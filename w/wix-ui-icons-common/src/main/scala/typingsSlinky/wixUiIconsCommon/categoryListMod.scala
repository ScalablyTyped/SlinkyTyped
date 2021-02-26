package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.wixUiIconsCommon.categoryListCategoryListMod.CategoryListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object categoryListMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/stories/components/category-list", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CategoryListProps] = js.native
  
  type _To = ReactComponentClass[CategoryListProps]
  
  /* This means you don't have to write `default`, but can instead just say `categoryListMod.foo` */
  override def _to: ReactComponentClass[CategoryListProps] = default
}
