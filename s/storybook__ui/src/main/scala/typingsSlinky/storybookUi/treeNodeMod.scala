package typingsSlinky.storybookUi

import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.ReactComponentClass
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.AnchorHTMLAttributes
import typingsSlinky.react.mod.ButtonHTMLAttributes
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.storybookTheming.typesMod.Theme
import typingsSlinky.storybookUi.anon.Depth
import typingsSlinky.storybookUi.anon.IsExpandable
import typingsSlinky.storybookUi.anon.IsExpanded
import typingsSlinky.storybookUi.anon.PickDetailedHTMLPropsHTMLAbout
import typingsSlinky.storybookUi.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeNodeMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/TreeNode", "CollapseIcon")
  @js.native
  val CollapseIcon: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], 
    IsExpanded, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/TreeNode", "ComponentNode")
  @js.native
  val ComponentNode: ReactComponentClass[
    ComponentProps[
      StyledComponent[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        Depth, 
        Theme
      ]
    ]
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/TreeNode", "DocumentNode")
  @js.native
  val DocumentNode: ReactComponentClass[
    ComponentProps[
      StyledComponent[
        DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
        `1`, 
        Theme
      ]
    ]
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/TreeNode", "GroupNode")
  @js.native
  val GroupNode: ReactComponentClass[
    (ComponentProps[
      StyledComponent[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        Depth, 
        Theme
      ]
    ]) with IsExpandable
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/TreeNode", "Path")
  @js.native
  val Path: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], 
    PickDetailedHTMLPropsHTMLAbout, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/TreeNode", "RootNode")
  @js.native
  val RootNode: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], 
    PickDetailedHTMLPropsHTMLAbout, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/TreeNode", "StoryNode")
  @js.native
  val StoryNode: ReactComponentClass[
    ComponentProps[
      StyledComponent[
        DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
        `1`, 
        Theme
      ]
    ]
  ] = js.native
}
