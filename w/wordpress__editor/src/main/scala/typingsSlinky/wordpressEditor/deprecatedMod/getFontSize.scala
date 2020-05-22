package typingsSlinky.wordpressEditor.deprecatedMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.wordpressBlockEditor.anon.PartialEditorFontSizePick
import typingsSlinky.wordpressBlockEditor.mod.EditorFontSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/editor/components/deprecated", "getFontSize")
@js.native
object getFontSize
  extends TopLevel[
      js.Function3[
        /* fontSizes */ js.Array[EditorFontSize], 
        /* fontSizeAttribute */ js.UndefOr[String], 
        /* customFontSizeAttribute */ Double, 
        PartialEditorFontSizePick
      ]
    ]

