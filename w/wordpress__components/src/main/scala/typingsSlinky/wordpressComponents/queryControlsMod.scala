package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.wordpressComponents.anon.CategoriesList
import typingsSlinky.wordpressComponents.anon.MaxItems
import typingsSlinky.wordpressComponents.anon.OnOrderByChange
import typingsSlinky.wordpressComponents.queryControlsMod.QueryControls.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryControlsMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/query-controls", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object QueryControls {
    
    type CategoryProps = CategoriesList | js.Object
    
    type NumberProps = MaxItems | js.Object
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.wordpressComponents.wordpressComponentsStrings.asc
      - typingsSlinky.wordpressComponents.wordpressComponentsStrings.desc
    */
    trait Order extends StObject
    object Order {
      
      @scala.inline
      def asc: typingsSlinky.wordpressComponents.wordpressComponentsStrings.asc = "asc".asInstanceOf[typingsSlinky.wordpressComponents.wordpressComponentsStrings.asc]
      
      @scala.inline
      def desc: typingsSlinky.wordpressComponents.wordpressComponentsStrings.desc = "desc".asInstanceOf[typingsSlinky.wordpressComponents.wordpressComponentsStrings.desc]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.wordpressComponents.wordpressComponentsStrings.date
      - typingsSlinky.wordpressComponents.wordpressComponentsStrings.title
    */
    trait OrderBy extends StObject
    object OrderBy {
      
      @scala.inline
      def date: typingsSlinky.wordpressComponents.wordpressComponentsStrings.date = "date".asInstanceOf[typingsSlinky.wordpressComponents.wordpressComponentsStrings.date]
      
      @scala.inline
      def title: typingsSlinky.wordpressComponents.wordpressComponentsStrings.title = "title".asInstanceOf[typingsSlinky.wordpressComponents.wordpressComponentsStrings.title]
    }
    
    type OrderProps = OnOrderByChange | js.Object
    
    type Props = CategoryProps with OrderProps with NumberProps
  }
}
