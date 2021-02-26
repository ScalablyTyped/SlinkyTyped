package typingsSlinky.senchaTouch.Ext.chart

import typingsSlinky.senchaTouch.Ext.draw.sprite.ICircle
import typingsSlinky.senchaTouch.Ext.draw.sprite.IPath
import typingsSlinky.senchaTouch.Ext.draw.sprite.ISprite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grid {
  
  type ICircularGrid = ICircle
  
  @js.native
  trait IHorizontalGrid extends ISprite {
    
    /** [Method] Render method
      * @param surface Object
      * @param ctx Object
      * @param clipRegion Object
      * @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
      */
    @JSName("render")
    var render_IHorizontalGrid: js.UndefOr[
        js.Function3[
          /* surface */ js.UndefOr[js.Any], 
          /* ctx */ js.UndefOr[js.Any], 
          /* clipRegion */ js.UndefOr[js.Any], 
          _
        ]
      ] = js.native
  }
  object IHorizontalGrid {
    
    @scala.inline
    def apply(): IHorizontalGrid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHorizontalGrid]
    }
    
    @scala.inline
    implicit class IHorizontalGridMutableBuilder[Self <: IHorizontalGrid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(
        value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any]) => _
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  @js.native
  trait IRadialGrid extends IPath {
    
    /** [Method] Render method
      * @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
      */
    @JSName("render")
    var render_IRadialGrid: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Update the path
      * @param path Object
      * @param attr Object
      */
    @JSName("updatePath")
    var updatePath_IRadialGrid: js.UndefOr[js.Function2[/* path */ js.UndefOr[js.Any], /* attr */ js.UndefOr[js.Any], Unit]] = js.native
  }
  object IRadialGrid {
    
    @scala.inline
    def apply(): IRadialGrid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRadialGrid]
    }
    
    @scala.inline
    implicit class IRadialGridMutableBuilder[Self <: IRadialGrid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: () => _): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setUpdatePath(value: (/* path */ js.UndefOr[js.Any], /* attr */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "updatePath", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdatePathUndefined: Self = StObject.set(x, "updatePath", js.undefined)
    }
  }
  
  @js.native
  trait IVerticalGrid extends ISprite {
    
    /** [Method] Render method
      * @param surface Object
      * @param ctx Object
      * @param clipRegion Object
      * @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
      */
    @JSName("render")
    var render_IVerticalGrid: js.UndefOr[
        js.Function3[
          /* surface */ js.UndefOr[js.Any], 
          /* ctx */ js.UndefOr[js.Any], 
          /* clipRegion */ js.UndefOr[js.Any], 
          _
        ]
      ] = js.native
  }
  object IVerticalGrid {
    
    @scala.inline
    def apply(): IVerticalGrid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IVerticalGrid]
    }
    
    @scala.inline
    implicit class IVerticalGridMutableBuilder[Self <: IVerticalGrid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(
        value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any]) => _
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
}
