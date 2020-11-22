package typingsSlinky.scrivito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AttributeBasedValidation = js.Tuple2[java.lang.String, typingsSlinky.scrivito.mod.AttributeValidationCallback]
  
  type AttributeValidationCallback = js.Function2[
    /* current */ js.Any, 
    /* options */ typingsSlinky.scrivito.anon.Content, 
    typingsSlinky.scrivito.mod.ValidationReturnType
  ]
  
  type AttributeWithOptions = js.Tuple2[typingsSlinky.scrivito.mod.Attribute, typingsSlinky.scrivito.mod.AttributeOptions]
  
  type ClassBasedValidation = js.Function1[
    /* target */ typingsSlinky.scrivito.mod.Widget | typingsSlinky.scrivito.mod.Obj, 
    typingsSlinky.scrivito.mod.ValidationReturnType
  ]
  
  type EditingConfigAttributes = org.scalablytyped.runtime.StringDictionary[typingsSlinky.scrivito.mod.AttributeProps]
  
  type ObjComponent = slinky.core.ReactComponentClass[typingsSlinky.scrivito.mod.ObjComponentProps]
  
  type ObjSearchAttribute = typingsSlinky.scrivito.mod.ObjSearchSingleAttribute | js.Array[typingsSlinky.scrivito.mod.ObjSearchSingleAttribute]
  
  type ObjSearchAttributeBasedBoost = org.scalablytyped.runtime.StringDictionary[scala.Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.scrivito.scrivitoStrings.Asterisk
    - typingsSlinky.scrivito.scrivitoStrings.id
    - typingsSlinky.scrivito.scrivitoStrings._createdAt
    - typingsSlinky.scrivito.scrivitoStrings._lastChanged
    - typingsSlinky.scrivito.scrivitoStrings._objClass
    - typingsSlinky.scrivito.scrivitoStrings._path
    - typingsSlinky.scrivito.scrivitoStrings._permalink
    - typingsSlinky.scrivito.scrivitoStrings._restriction
    - typingsSlinky.scrivito.scrivitoStrings.MetadataCollection
    - java.lang.String
  */
  type ObjSearchSingleAttribute = typingsSlinky.scrivito.mod._ObjSearchSingleAttribute | java.lang.String
  
  type ObjSearchValue = java.lang.String | js.Date | scala.Double | typingsSlinky.scrivito.mod.Obj | js.Array[js.Any]
  
  type OrderParam = typingsSlinky.scrivito.mod.ObjSearchSingleAttribute | (js.Tuple2[
    typingsSlinky.scrivito.mod.ObjSearchSingleAttribute, 
    typingsSlinky.scrivito.scrivitoStrings.asc | typingsSlinky.scrivito.scrivitoStrings.desc
  ])
  
  type Validation = typingsSlinky.scrivito.mod.AttributeBasedValidation | typingsSlinky.scrivito.mod.ClassBasedValidation
  
  type ValidationReturnType = js.UndefOr[typingsSlinky.scrivito.anon.Message | java.lang.String]
  
  type WidgetClass = org.scalablytyped.runtime.Instantiable1[/* arg */ js.Object, typingsSlinky.scrivito.mod.Widget]
  
  type WidgetComponent = slinky.core.ReactComponentClass[typingsSlinky.scrivito.mod.WidgetComponentProps]
}
