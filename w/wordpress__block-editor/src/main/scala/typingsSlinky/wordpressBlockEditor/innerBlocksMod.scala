package typingsSlinky.wordpressBlockEditor

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.wordpressBlockEditor.anon.Children
import typingsSlinky.wordpressBlockEditor.innerBlocksMod.InnerBlocks.Props
import typingsSlinky.wordpressBlockEditor.mod.EditorTemplateLock
import typingsSlinky.wordpressBlocks.templatesMod.TemplateArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object innerBlocksMod {
  
  object default {
    
    @JSImport("@wordpress/block-editor/components/inner-blocks", JSImport.Default)
    @js.native
    def apply(props: Props): ReactElement = js.native
    @JSImport("@wordpress/block-editor/components/inner-blocks", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * display a `+` (plus) icon button that, when clicked, displays the block picker menu. No
      * default Block is inserted.
      */
    @JSImport("@wordpress/block-editor/components/inner-blocks", "default.ButtonBlockerAppender")
    @js.native
    def ButtonBlockerAppender: ReactComponentClass[Children] = js.native
    @scala.inline
    def ButtonBlockerAppender_=(x: ReactComponentClass[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ButtonBlockerAppender")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/block-editor/components/inner-blocks", "default.Content")
    @js.native
    def Content: ReactComponentClass[Children] = js.native
    @scala.inline
    def Content_=(x: ReactComponentClass[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    /**
      * display the default block appender as set by `wp.blocks.setDefaultBlockName`. Typically this
      * is the `paragraph` block.
      */
    @JSImport("@wordpress/block-editor/components/inner-blocks", "default.DefaultBlockAppender")
    @js.native
    def DefaultBlockAppender: ReactComponentClass[Children] = js.native
    @scala.inline
    def DefaultBlockAppender_=(x: ReactComponentClass[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultBlockAppender")(x.asInstanceOf[js.Any])
  }
  
  object InnerBlocks {
    
    @js.native
    trait Props extends StObject {
      
      var allowedBlocks: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * A 'render prop' function that can be used to customize the block's appender.
        */
      var renderAppender: js.UndefOr[ReactComponentClass[js.Object]] = js.native
      
      /**
        * The template is defined as a list of block items. Such blocks can have predefined
        * attributes, placeholder, content, etc. Block templates allow specifying a default initial
        * state for an InnerBlocks area.
        *
        * See {@link https://github.com/WordPress/gutenberg/blob/master/docs/designers-developers/developers/block-api/block-templates.md }
        */
      var template: js.UndefOr[TemplateArray] = js.native
      
      /**
        * If `true` when child blocks in the template are inserted the selection is updated.
        * If `false` the selection should not be updated when child blocks specified in the template are inserted.
        * @defaultValue true
        */
      var templateInsertUpdatesSelection: js.UndefOr[Boolean] = js.native
      
      /**
        * Template locking allows locking the `InnerBlocks` area for the current template.
        *
        * - `'all'` — prevents all operations. It is not possible to insert new blocks. Move existing blocks or delete them.
        * - `'insert'` — prevents inserting or removing blocks, but allows moving existing ones.
        * - `false` — prevents locking from being applied to an `InnerBlocks` area even if a parent block contains locking.
        *
        * If locking is not set in an `InnerBlocks` area: the locking of the parent `InnerBlocks` area is used.
        *
        * If the block is a top level block: the locking of the Custom Post Type is used.
        */
      var templateLock: js.UndefOr[EditorTemplateLock] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllowedBlocks(value: js.Array[String]): Self = StObject.set(x, "allowedBlocks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowedBlocksUndefined: Self = StObject.set(x, "allowedBlocks", js.undefined)
        
        @scala.inline
        def setAllowedBlocksVarargs(value: String*): Self = StObject.set(x, "allowedBlocks", js.Array(value :_*))
        
        @scala.inline
        def setRenderAppender(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "renderAppender", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderAppenderComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "renderAppender", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderAppenderFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "renderAppender", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderAppenderUndefined: Self = StObject.set(x, "renderAppender", js.undefined)
        
        @scala.inline
        def setTemplate(value: TemplateArray): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplateInsertUpdatesSelection(value: Boolean): Self = StObject.set(x, "templateInsertUpdatesSelection", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplateInsertUpdatesSelectionUndefined: Self = StObject.set(x, "templateInsertUpdatesSelection", js.undefined)
        
        @scala.inline
        def setTemplateLock(value: EditorTemplateLock): Self = StObject.set(x, "templateLock", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplateLockUndefined: Self = StObject.set(x, "templateLock", js.undefined)
        
        @scala.inline
        def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      }
    }
  }
}
