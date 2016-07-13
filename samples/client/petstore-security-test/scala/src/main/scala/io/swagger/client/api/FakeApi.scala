/**
 * Swagger Petstore *_/ ' \" =end \\r\\n \\n \\r
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  *_/ ' \" =end       
 *
 * OpenAPI spec version: 1.0.0 *_/ ' \" =end \\r\\n \\n \\r
 * Contact: apiteam@swagger.io *_/ ' \" =end \\r\\n \\n \\r
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.client.api

import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class FakeApi(val defBasePath: String = "https://petstore.swagger.io *_/ &#39; \&quot; &#x3D;end \\r\\n \\n \\r/v2 *_/ &#39; \&quot; &#x3D;end \\r\\n \\n \\r",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * To test code injection *_/ &#39; \&quot; &#x3D;end \\r\\n \\n \\r
   * 
   * @param testCodeInjectEndRnNR To test code injection *_/ &#39; \&quot; &#x3D;end \\r\\n \\n \\r (optional)
   * @return void
   */
  def testCodeInject * &#39; &quot; &#x3D;end rn n r (testCodeInjectEndRnNR: String)  = {
    // create path and map variables
    val path = "/fake".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "*/ '  =end 
 
 
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

        
    
    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("test code inject */ &#39; &quot; &#x3D;end \r\n \n \r", testCodeInjectEndRnNR.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "test code inject */ &#39; &quot; &#x3D;end \r\n \n \r" -> testCodeInjectEndRnNR.toString()
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}