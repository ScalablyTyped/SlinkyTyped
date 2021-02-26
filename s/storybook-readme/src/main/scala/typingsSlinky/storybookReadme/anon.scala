package typingsSlinky.storybookReadme

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Children extends StObject {
    
    var children: ReactElement = js.native
  }
  object Children {
    
    @scala.inline
    def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  @js.native
  trait ChildrenElement extends StObject {
    
    var children: ReactElement = js.native
  }
  object ChildrenElement {
    
    @scala.inline
    def apply(children: ReactElement): ChildrenElement = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChildrenElement]
    }
    
    @scala.inline
    implicit class ChildrenElementMutableBuilder[Self <: ChildrenElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Md extends StObject {
    
    var md: String = js.native
  }
  object Md {
    
    @scala.inline
    def apply(md: String): Md = {
      val __obj = js.Dynamic.literal(md = md.asInstanceOf[js.Any])
      __obj.asInstanceOf[Md]
    }
    
    @scala.inline
    implicit class MdMutableBuilder[Self <: Md] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMd(value: String): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    }
  }
}
