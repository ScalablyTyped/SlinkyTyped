package typingsSlinky.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object SPClientTemplates {
  
  /** Must return null in order to fall back to a more common template or to a system default template */
  type FieldCallback = js.Function1[
    /* renderContext */ typingsSlinky.sharepoint.SPClientTemplates.RenderContext, 
    java.lang.String
  ]
  
  /** Must return null in order to fall back to a more common template or to a system default template */
  type FieldInFormCallback = js.Function1[
    /* renderContext */ typingsSlinky.sharepoint.SPClientTemplates.RenderContextFieldInForm, 
    java.lang.String
  ]
  
  /** Must return null in order to fall back to a more common template or to a system default template */
  type FieldInViewCallback = js.Function1[
    /* renderContext */ typingsSlinky.sharepoint.SPClientTemplates.RenderContextFieldInView, 
    java.lang.String
  ]
  
  type FieldTemplateMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.sharepoint.SPClientTemplates.FieldTemplateOverrides]
  
  type FieldTemplates = org.scalablytyped.runtime.StringDictionary[typingsSlinky.sharepoint.SPClientTemplates.FieldCallback]
  
  /** Must return null in order to fall back to a more common template or to a system default template */
  type GroupCallback = js.Function1[
    /* renderContext */ typingsSlinky.sharepoint.SPClientTemplates.RenderContextGroupInView, 
    java.lang.String
  ]
  
  type Item = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  /** Must return null in order to fall back to a more common template or to a system default template */
  type ItemCallback = js.Function1[
    /* renderContext */ typingsSlinky.sharepoint.SPClientTemplates.RenderContext, 
    java.lang.String
  ]
  
  type RenderCallback = js.Function1[/* ctx */ typingsSlinky.sharepoint.SPClientTemplates.RenderContext, scala.Unit]
  
  /** Must return null in order to fall back to a more common template or to a system default template */
  type SingleTemplateCallback = js.Function1[
    /* renderContext */ typingsSlinky.sharepoint.SPClientTemplates.RenderContextInView, 
    java.lang.String
  ]
}
