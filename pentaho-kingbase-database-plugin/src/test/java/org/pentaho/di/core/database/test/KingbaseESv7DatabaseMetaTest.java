/*******************************************************************************
 *
 * 
 *
 * Copyright (C) 2011-2019 by Sun : http://www.kingbase.com.cn
 *
 *******************************************************************************
 *
 *
 *    Email : snj1314@163.com
 *
 *
 ******************************************************************************/

package org.pentaho.di.core.database.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.pentaho.di.core.database.KingbaseESv7DatabaseMeta;

/**
 * 
 * 
 * @author Sun
 * @since 2019年9月6日
 * @version
 * 
 */
public class KingbaseESv7DatabaseMetaTest {

  @Test
  public void testDriverClass() {
    KingbaseESv7DatabaseMeta dbMeta = new KingbaseESv7DatabaseMeta();
    assertEquals("com.kingbase.Driver", dbMeta.getDriverClass());
  }

  @Test
  public void testDefaultDatabasePort() {
    KingbaseESv7DatabaseMeta dbMeta = new KingbaseESv7DatabaseMeta();
    assertEquals(54321, dbMeta.getDefaultDatabasePort());
  }

}
