package typingsSlinky.wordpressEditor.componentsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.wordpressBlockEditor.anon.PickEditorColorcolor
import typingsSlinky.wordpressBlockEditor.mod.EditorColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/editor/components", "getColorObjectByAttributeValues")
@js.native
object getColorObjectByAttributeValues
  extends TopLevel[
      js.Function3[
        /* colors */ js.Array[EditorColor], 
        /* definedColor */ js.UndefOr[String], 
        /* customColor */ String, 
        EditorColor | PickEditorColorcolor
      ]
    ]

