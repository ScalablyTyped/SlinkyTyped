package typingsSlinky.summernote.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Summernote {
  
  type EditImageCallback = js.Function1[/* $image */ typingsSlinky.jquery.JQuery.Node, scala.Unit]
  
  type colorsDef = js.Array[js.Array[js.Array[java.lang.String]]]
  
  type htmlElement = java.lang.String
  
  type popoverAirDef = js.Tuple5[
    js.Tuple2[
      typingsSlinky.summernote.summernoteStrings.color, 
      typingsSlinky.summernote.mod.global.Summernote.popoverAirOptionsColor
    ], 
    js.Tuple2[
      typingsSlinky.summernote.summernoteStrings.font, 
      typingsSlinky.summernote.mod.global.Summernote.popoverAirOptionsFont
    ], 
    js.Tuple2[
      typingsSlinky.summernote.summernoteStrings.para, 
      typingsSlinky.summernote.mod.global.Summernote.popoverAirOptionsPara
    ], 
    js.Tuple2[
      typingsSlinky.summernote.summernoteStrings.table, 
      typingsSlinky.summernote.mod.global.Summernote.popoverAirOptionsTable
    ], 
    js.Tuple2[
      typingsSlinky.summernote.summernoteStrings.insert, 
      typingsSlinky.summernote.mod.global.Summernote.popoverAirOptionsInsert
    ]
  ]
  
  type popoverAirOptionsColor = typingsSlinky.summernote.summernoteStrings.color
  
  type popoverAirOptionsTable = typingsSlinky.summernote.summernoteStrings.table
  
  type popoverImageDef = js.Tuple3[
    js.Tuple2[
      typingsSlinky.summernote.summernoteStrings.imagesize, 
      js.Array[typingsSlinky.summernote.mod.global.Summernote.popoverImageOptionsImagesize]
    ], 
    js.Tuple2[
      typingsSlinky.summernote.summernoteStrings.float, 
      js.Array[typingsSlinky.summernote.mod.global.Summernote.popoverImageOptionsFloat]
    ], 
    js.Tuple2[
      typingsSlinky.summernote.summernoteStrings.remove, 
      js.Array[typingsSlinky.summernote.mod.global.Summernote.popoverImageOptionsRemove]
    ]
  ]
  
  type popoverImageOptionsRemove = typingsSlinky.summernote.summernoteStrings.removeMedia
  
  type popoverLinkDef = js.Array[
    js.Tuple2[
      typingsSlinky.summernote.summernoteStrings.link, 
      js.Array[typingsSlinky.summernote.mod.global.Summernote.popoverLinkLinkOptions]
    ]
  ]
  
  type toolbarColorGroupOptions = typingsSlinky.summernote.summernoteStrings.color
  
  // type toolbarDef = [string, string[]][]
  type toolbarDef = js.Array[
    js.Tuple2[
      typingsSlinky.summernote.summernoteStrings.style | typingsSlinky.summernote.summernoteStrings.font | typingsSlinky.summernote.summernoteStrings.fontsize_ | typingsSlinky.summernote.summernoteStrings.color | typingsSlinky.summernote.summernoteStrings.para | typingsSlinky.summernote.summernoteStrings.height | typingsSlinky.summernote.summernoteStrings.table | typingsSlinky.summernote.summernoteStrings.insert | typingsSlinky.summernote.summernoteStrings.view | typingsSlinky.summernote.summernoteStrings.help | typingsSlinky.summernote.summernoteStrings.misc, 
      js.Array[
        typingsSlinky.summernote.mod.global.Summernote.miscGroupOptions | typingsSlinky.summernote.mod.global.Summernote.toolbarColorGroupOptions | typingsSlinky.summernote.mod.global.Summernote.toolbarFontGroupOptions | typingsSlinky.summernote.mod.global.Summernote.toolbarFontsizeGroupOptions | typingsSlinky.summernote.mod.global.Summernote.toolbarHeightGroupOptions | typingsSlinky.summernote.mod.global.Summernote.toolbarHelpGroupOptions | typingsSlinky.summernote.mod.global.Summernote.toolbarInsertGroupOptions | typingsSlinky.summernote.mod.global.Summernote.toolbarParaGroupOptions | typingsSlinky.summernote.mod.global.Summernote.toolbarStyleGroupOptions | typingsSlinky.summernote.mod.global.Summernote.toolbarTableGroupOptions | typingsSlinky.summernote.mod.global.Summernote.toolbarViewGroupOptions
      ]
    ]
  ]
  
  type toolbarHeightGroupOptions = typingsSlinky.summernote.summernoteStrings.height
  
  type toolbarHelpGroupOptions = typingsSlinky.summernote.summernoteStrings.help
  
  type toolbarTableGroupOptions = typingsSlinky.summernote.summernoteStrings.table
}
