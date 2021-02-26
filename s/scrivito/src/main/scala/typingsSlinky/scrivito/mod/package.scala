package typingsSlinky.scrivito

import org.scalablytyped.runtime.StObject
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
  
  @scala.inline
  def canWrite(): scala.Boolean = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("canWrite")().asInstanceOf[scala.Boolean]
  
  @scala.inline
  def configure(options: typingsSlinky.scrivito.mod.ConfigOptions): scala.Unit = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def configureContentBrowser(options: js.Any): scala.Unit = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("configureContentBrowser")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def connect(component: typingsSlinky.react.mod.ComponentClass[js.Object, js.Object]): scala.Unit = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(component.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def connect(component: typingsSlinky.react.mod.FunctionComponent[js.Object]): scala.Unit = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(component.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def createObjClass(options: typingsSlinky.scrivito.mod.ObjClassOptions): typingsSlinky.scrivito.mod.AbstractObjClass = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createObjClass")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.scrivito.mod.AbstractObjClass]
  
  @scala.inline
  def createWidgetClass(options: typingsSlinky.scrivito.mod.WidgetClassOptions): typingsSlinky.scrivito.mod.AbstractWidgetClass = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createWidgetClass")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.scrivito.mod.AbstractWidgetClass]
  
  @scala.inline
  def currentPage(): typingsSlinky.scrivito.mod.Obj = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("currentPage")().asInstanceOf[typingsSlinky.scrivito.mod.Obj]
  
  @scala.inline
  def currentPageParams(): js.Any = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("currentPageParams")().asInstanceOf[js.Any]
  
  @scala.inline
  def extendMenu(menuCallback: js.Any): scala.Unit = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extendMenu")(menuCallback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def extractText(obj: typingsSlinky.scrivito.mod.Obj, options: typingsSlinky.scrivito.anon.Length): java.lang.String = (typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extractText")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def finishLoading(): js.Promise[js.Object] = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("finishLoading")().asInstanceOf[js.Promise[js.Object]]
  
  @scala.inline
  def getClass_(name: java.lang.String): typingsSlinky.scrivito.mod.ObjClass | typingsSlinky.scrivito.mod.WidgetClass | scala.Null = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getClass")(name.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.scrivito.mod.ObjClass | typingsSlinky.scrivito.mod.WidgetClass | scala.Null]
  
  @scala.inline
  def isEditorLoggedIn(): scala.Boolean = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isEditorLoggedIn")().asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isInPlaceEditingActive(): scala.Boolean = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isInPlaceEditingActive")().asInstanceOf[scala.Boolean]
  
  @scala.inline
  def load[T](functionToLoad: js.Function0[T]): js.Promise[T] = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(functionToLoad.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  @scala.inline
  def navigateTo(target: js.Function0[typingsSlinky.scrivito.mod.Obj | typingsSlinky.scrivito.mod.Link]): scala.Unit = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(target.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def navigateTo(
    target: js.Function0[typingsSlinky.scrivito.mod.Obj | typingsSlinky.scrivito.mod.Link],
    options: typingsSlinky.scrivito.anon.Hash
  ): scala.Unit = (typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def navigateTo(target: typingsSlinky.scrivito.mod.Link): scala.Unit = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(target.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def navigateTo(target: typingsSlinky.scrivito.mod.Link, options: typingsSlinky.scrivito.anon.Hash): scala.Unit = (typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def navigateTo(target: typingsSlinky.scrivito.mod.Obj): scala.Unit = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(target.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def navigateTo(target: typingsSlinky.scrivito.mod.Obj, options: typingsSlinky.scrivito.anon.Hash): scala.Unit = (typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def openDialog(name: java.lang.String): scala.Unit = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("openDialog")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def preload(preloadDump: js.Any): js.Promise[typingsSlinky.scrivito.anon.DumpLoaded] = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("preload")(preloadDump.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.scrivito.anon.DumpLoaded]]
  
  @scala.inline
  def provideComponent(
    className: java.lang.String,
    component: slinky.core.ReactComponentClass[
      typingsSlinky.scrivito.mod.ObjComponentProps | typingsSlinky.scrivito.mod.WidgetComponentProps
    ]
  ): scala.Unit = (typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("provideComponent")(className.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def provideEditingConfig(name: java.lang.String, editingConfig: typingsSlinky.scrivito.mod.EditingConfig): scala.Unit = (typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("provideEditingConfig")(name.asInstanceOf[js.Any], editingConfig.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def provideObjClass(name: java.lang.String, contentClassOrOptions: typingsSlinky.scrivito.mod.AbstractObjClass): typingsSlinky.scrivito.mod.ObjClass = (typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("provideObjClass")(name.asInstanceOf[js.Any], contentClassOrOptions.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.scrivito.mod.ObjClass]
  @scala.inline
  def provideObjClass(name: java.lang.String, contentClassOrOptions: typingsSlinky.scrivito.mod.ObjClassOptions): typingsSlinky.scrivito.mod.ObjClass = (typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("provideObjClass")(name.asInstanceOf[js.Any], contentClassOrOptions.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.scrivito.mod.ObjClass]
  
  @scala.inline
  def provideWidgetClass(name: java.lang.String, contentClassOrOptions: typingsSlinky.scrivito.mod.AbstractWidgetClass): typingsSlinky.scrivito.mod.WidgetClass = (typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("provideWidgetClass")(name.asInstanceOf[js.Any], contentClassOrOptions.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.scrivito.mod.WidgetClass]
  @scala.inline
  def provideWidgetClass(name: java.lang.String, contentClassOrOptions: typingsSlinky.scrivito.mod.WidgetClassOptions): typingsSlinky.scrivito.mod.WidgetClass = (typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("provideWidgetClass")(name.asInstanceOf[js.Any], contentClassOrOptions.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.scrivito.mod.WidgetClass]
  
  @scala.inline
  def registerComponent(
    name: java.lang.String,
    component: slinky.core.ReactComponentClass[
      typingsSlinky.scrivito.mod.ObjComponentProps | typingsSlinky.scrivito.mod.WidgetComponentProps
    ]
  ): scala.Unit = (typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerComponent")(name.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def renderPage(page: js.Any, renderFunction: js.Function0[scala.Unit]): js.Promise[typingsSlinky.scrivito.anon.PreloadDump] = (typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("renderPage")(page.asInstanceOf[js.Any], renderFunction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.scrivito.anon.PreloadDump]]
  
  @scala.inline
  def setVisitorIdToken(idToken: java.lang.String): scala.Unit = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setVisitorIdToken")(idToken.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def updateContent(): scala.Unit = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("updateContent")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def updateMenuExtensions(): scala.Unit = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("updateMenuExtensions")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def urlFor(target: typingsSlinky.scrivito.mod.Binary): scala.Unit = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("urlFor")(target.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def urlFor(target: typingsSlinky.scrivito.mod.Binary, options: typingsSlinky.scrivito.anon.Query): scala.Unit = (typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("urlFor")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def urlFor(target: typingsSlinky.scrivito.mod.Link): scala.Unit = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("urlFor")(target.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def urlFor(target: typingsSlinky.scrivito.mod.Link, options: typingsSlinky.scrivito.anon.Query): scala.Unit = (typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("urlFor")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def urlFor(target: typingsSlinky.scrivito.mod.Obj): scala.Unit = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("urlFor")(target.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def urlFor(target: typingsSlinky.scrivito.mod.Obj, options: typingsSlinky.scrivito.anon.Query): scala.Unit = (typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("urlFor")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def useHistory(history: org.scalajs.dom.raw.History): scala.Unit = typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useHistory")(history.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def validationResults(model: typingsSlinky.scrivito.mod.Obj, attribute: java.lang.String): js.Array[js.Object] = (typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validationResults")(model.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  @scala.inline
  def validationResults(model: typingsSlinky.scrivito.mod.Widget, attribute: java.lang.String): js.Array[js.Object] = (typingsSlinky.scrivito.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validationResults")(model.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
}
