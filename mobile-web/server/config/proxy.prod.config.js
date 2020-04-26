module.exports = {
  '/admin-api -> http://127.0.0.1:18083/': {
    changeOrigin: true,
    pathRewrite: {},
  },
  '/server/api -> https://preview.pro.ant.design/': {
    changeOrigin: true,
    pathRewrite: { '^/server': '' },
  },
};
